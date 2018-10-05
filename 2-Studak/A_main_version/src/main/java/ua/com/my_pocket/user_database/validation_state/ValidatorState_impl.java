package ua.com.my_pocket.user_database.validation_state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.com.my_pocket.user_database.dao.UserDataBaseDao;
import ua.com.my_pocket.user_database.entity.UserDataBase;

@Component("ValidatorState")
public class ValidatorState_impl implements ValitaorState {

	@Autowired
	private UserDataBaseDao userDataBaseDao;

	@Override
	public void validate(Object object) throws Exception {
		UserDataBase userDataBase = (UserDataBase) object;
		/*
		 * validation for IDENTIFICATION_ID
		 */
		if (userDataBase.getIdentificationID() == 0) {
			throw new ValidationExceptionState(ValidatorMessegeState.EMPTY_IDENTIFICATION_ID_FIELD);
		}
		if (userDataBaseDao.userDataBaseExistsByIdentificationID(userDataBase.getIdentificationID()) == true) {
			throw new ValidationExceptionState(ValidatorMessegeState.IDENTIFICATION_ID_EXIST);
		}

		/*
		 * validation for other
		 */
		if (userDataBase.getSeriaPassport().isEmpty()) {
			throw new ValidationExceptionState(ValidatorMessegeState.EMPTY_SERIA_FIELD);
		}
		if (userDataBase.getCodePassport() == 0) {
			throw new ValidationExceptionState(ValidatorMessegeState.EMPTY_CODE_FIELD);
		}
		if (userDataBase.getName().isEmpty()) {
			throw new ValidationExceptionState(ValidatorMessegeState.EMPTY_NAME_FIELD);
		}
		if (userDataBase.getSurname().isEmpty()) {
			throw new ValidationExceptionState(ValidatorMessegeState.EMPTY_SURNAME_FIELD);
		}
		if (userDataBase.getDadname().isEmpty()) {
			throw new ValidationExceptionState(ValidatorMessegeState.EMPTY_DADNAME_FIELD);
		}

	}

}
