package fr.formation.Gardens.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import fr.formation.Gardens.services.UserService;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

	private final UserService userService;

	// @Autowired is optional with one constructor
	protected UniqueEmailValidator(UserService userService) {
		this.userService = userService;
	}

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		if (null == email || email.isEmpty()) {
			return true;
		}
		return userService.emailUnique(email);
	}
	// TODO Auto-generated method stub

}
