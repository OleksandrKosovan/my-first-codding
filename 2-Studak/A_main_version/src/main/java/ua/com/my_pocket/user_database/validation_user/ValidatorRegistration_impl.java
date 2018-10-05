package ua.com.my_pocket.user_database.validation_user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.com.my_pocket.user_database.dao.UserDao;
import ua.com.my_pocket.user_database.dao.UserDataBaseDao;
import ua.com.my_pocket.user_database.entity.User;

/**
 * 
 * @author KOSOVAN OLEXANDR
 *
 */
@Component("userValidator")
public class ValidatorRegistration_impl implements ValidatorRegistration {

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserDataBaseDao userDataBaseDao;

	@Override
	public void validate(Object object) throws Exception {
		User user = (User) object;

		/*
		 * validation for IDENTIFICATION_ID
		 */
		if (userDataBaseDao.userDataBaseExistsByIdentificationID(user.getIdentification_code()) == false) {
			throw new ValidationExceptionRegistrtion(ValidatorMessegesRegistration.IDENTIFICATION_ID_NO_EXIST);
		}
		if (userDao.userExistsByIdentification_code(user.getIdentification_code()) == true) {
			throw new ValidationExceptionRegistrtion(ValidatorMessegesRegistration.IDENTIFICATION_ALREADY_EXIST);
		}
		if (user.getIdentification_code() == 0) {
			throw new ValidationExceptionRegistrtion(ValidatorMessegesRegistration.EMPTY_IDENTIFICATION_ID_FIELD);
		}

		/*
		 * validation for name
		 */
		if (userDataBaseDao.userDataBaseExistsByName(user.getName()) == false) {
			throw new ValidationExceptionRegistrtion(ValidatorMessegesRegistration.NAME_NO_EXIST);
		}
		if (user.getName().isEmpty()) {
			throw new ValidationExceptionRegistrtion(ValidatorMessegesRegistration.EMPTY_NAME_FIELD);
		}

		/*
		 * validation for surname
		 */
		if (userDataBaseDao.userDataBaseExistsBySurname(user.getSurname()) == false) {
			throw new ValidationExceptionRegistrtion(ValidatorMessegesRegistration.SURNAME_NO_EXIST);
		}
		if (user.getSurname().isEmpty()) {
			throw new ValidationExceptionRegistrtion(ValidatorMessegesRegistration.EMPTY_SURNAME_FIELD);
		}

		/*
		 * validation for dadname
		 */
		if (userDataBaseDao.userDataBaseExistsByDadname(user.getDadsurname()) == false) {
			throw new ValidationExceptionRegistrtion(ValidatorMessegesRegistration.DADNAME_NO_EXIST);
		}
		if (user.getDadsurname().isEmpty()) {
			throw new ValidationExceptionRegistrtion(ValidatorMessegesRegistration.EMPTY_DADNAME_FIELD);
		}

		/*
		 * validation for email
		 */
		if (userDao.userExistsByEmail(user.getEmail()) == true) {
			throw new ValidationExceptionRegistrtion(ValidatorMessegesRegistration.EMAIL_ALREADY_EXIST);
		}
		if (user.getEmail().isEmpty()) {
			throw new ValidationExceptionRegistrtion(ValidatorMessegesRegistration.EMPTY_EMAIL_FIELD);
		}

		/*
		 * validation for phone
		 */
		if (userDao.userExistsByPhone(user.getPhone()) == true) {
			throw new ValidationExceptionRegistrtion(ValidatorMessegesRegistration.PHONE_ALREADY_EXIST);
		}
		if (user.getPhone() == 0) {
			throw new ValidationExceptionRegistrtion(ValidatorMessegesRegistration.EMPTY_PHONE_FIELD);
		}

		/*
		 * validation for password
		 */
		if (user.getPassword().isEmpty()) {
			throw new ValidationExceptionRegistrtion(ValidatorMessegesRegistration.EMPTY_PASSWORD_FIELD);
		}

	}

}
