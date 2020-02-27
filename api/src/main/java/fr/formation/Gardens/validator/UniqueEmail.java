package fr.formation.Gardens.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import org.jvnet.staxex.StAxSOAPBody.Payload;

/**
 * Validates if an email is unique or not.
 * <p>
 * Accepted type is {@code String}.
 * <p>
 * Uniquness is tested if and only if the value is neither {@code null} nor
 * empty. That said <b>a {@code null} or empty value is considered as valid</b>.
 * Other validation should be used to check against {@code null} and empty
 * values.
 *
 * @see String#isEmpty()
 */
@Documented
@Retention(RUNTIME)
@Target({ TYPE, FIELD, PARAMETER })
@Constraint(validatedBy = UniqueEmailValidator.class)
public @interface UniqueEmail {
	String message() default "{E_NOT_UNIQUE}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
