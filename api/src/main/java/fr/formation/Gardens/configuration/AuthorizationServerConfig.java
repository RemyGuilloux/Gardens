package fr.formation.Gardens.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.Gardens.services.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@Configuration
@EnableAuthorizationServer
@RestController // for "/me" endpoint
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
	 @Value("${jwt-auth-server.keyStore}")
	    private String keyStore;

	    @Value("${jwt-auth-server.keyPass}")
	    private String keyPass;

	    @Value("${jwt-auth-server.keyAlias}")
	    private String keyAlias;

	    @Value("${jwt-auth-server.accessTokenValiditySeconds}")
	    private int accessTokenValiditySeconds;

	    @Value("${jwt-auth-server.refreshTokenValiditySeconds}")
	    private int refreshTokenValiditySeconds;

	    private final AuthenticationManager authenticationManager;

	    private final UserService userDetailsService;

	    private final CustomAccessTokenConverter customAccessTokenConverter;

	    private final PasswordEncoder encoder;

	    protected AuthorizationServerConfig( AuthenticationManager authenticationManagerBean,   UserService userDetailsService, CustomAccessTokenConverter customAccessTokenConverter, PasswordEncoder encoder) {
	        this.authenticationManager = authenticationManagerBean;
	        this.userDetailsService = userDetailsService;
	        this.customAccessTokenConverter = customAccessTokenConverter;
	        this.encoder =  encoder;
	    }

	    /** <p> Token service using random UUID values for the access token and refresh token values. Specifies the token store and enables the refresh token. </p>
	     * @return DefaultTokenServices */
	    @Bean
	    protected DefaultTokenServices tokenServices() {
	        DefaultTokenServices services = new DefaultTokenServices();
	        services.setTokenStore(tokenStore());
	        services.setSupportRefreshToken(true);
	        return services;
	    }

	    /** <p> JwtTokenStore can read and write JWT thanks to the token converter. </p>
	     * @return TokenStore */
	    @Bean
	    protected TokenStore tokenStore() { return new JwtTokenStore(accessTokenConverter()); }

	    /** <p> Strategy for enhancing an access token before it is stored by an AuthorizationServerTokenServices implementation. </p>
	     * @return TokenStore */
	    @Bean
	    public TokenEnhancer tokenEnhancer() { return new CustomTokenEnhancer(); }

	    /** <p> A token converter for JWT and specifies a signing key (private/public key pair). </p>
	     * @return JwtAccessTokenConverter */
	    @Bean
	    protected JwtAccessTokenConverter accessTokenConverter() {
		JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
		Resource resource = new ClassPathResource(keyStore);
		char[] password = keyPass.toCharArray();
		KeyStoreKeyFactory factory = new KeyStoreKeyFactory(resource, password);
		converter.setKeyPair(factory.getKeyPair(keyAlias));
		converter.setAccessTokenConverter(customAccessTokenConverter);
		return converter;
	    }

	    /** <p> Configure the properties and enhanced functionality of the Authorization Server endpoints. </p>  */
	    @Override
	    public void configure(AuthorizationServerEndpointsConfigurer configurer) throws Exception {
	        TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
	        tokenEnhancerChain.setTokenEnhancers( Arrays.asList( tokenEnhancer(), accessTokenConverter() ) );
	        configurer.tokenStore(tokenStore()).tokenEnhancer(tokenEnhancerChain).authenticationManager(authenticationManager).userDetailsService(userDetailsService);
	    }

	    /** <p> Change authorization server security allowing form auth for clients (vs HTTP Basic). The client_id is sent as form parameter instead. </p> */
	    @Override
	    public void configure(AuthorizationServerSecurityConfigurer configurer) throws Exception { configurer.allowFormAuthenticationForClients(); }

	    /** <p> In memory client with empty secret, application is a "private" API with a single client, but Spring forces a client authentication. Authorized grant types are <i>password</i> and <i>refresh_token</i>. </p> */
	    @Override
	    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient("client-app")
			.secret(encoder.encode("")).scopes("trusted")
			.authorizedGrantTypes("password", "refresh_token")
			.accessTokenValiditySeconds(accessTokenValiditySeconds)
			.refreshTokenValiditySeconds(refreshTokenValiditySeconds);
	    }
	   

}
