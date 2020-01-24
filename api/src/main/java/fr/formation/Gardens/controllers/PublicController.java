package fr.formation.Gardens.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @see ResourceServerConfig#configure(HttpSecurity)
 */
@RestController
@RequestMapping("/public")
public class PublicController {
	/**
    * Accessible for anyone even anonymous.
    *
    * @return "Hello anyone!"
    */
   @GetMapping("/hello")
   public String hello() {
	return "Hello anyone!";
   }
}
