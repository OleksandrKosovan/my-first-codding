package ua.com.my_pocket.user_database.validation_login;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component("ValidatorLogin")
public class ValidatorLogin_impl implements ValidatorLogin {

	@Override
	public void validate(Object object) throws Exception {
		User user = (User) object;
		if (user.getPassword().isEmpty()) {
			throw new ValidationExceptionLogin(ValidatorMessegeLogin.EMPTY_PASSWORD);
		}
	}

}
