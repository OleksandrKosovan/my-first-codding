package ua.com.my_pocket.user_database.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ua.com.my_pocket.user_database.dao.UserDataBaseDao;
import ua.com.my_pocket.user_database.entity.UserDataBase;
import ua.com.my_pocket.user_database.service.UserDataBaseService;
import ua.com.my_pocket.user_database.validation_state.ValitaorState;

/**
 * 
 * @author Kosovan Olexandr
 * @version 1.0
 */

@Service
public class UserDataBaseService_impl implements UserDataBaseService {

	@Autowired
	private UserDataBaseDao userDataBaseDao;

	@Autowired
	@Qualifier("ValidatorState")
	private ValitaorState validatorState;

	@Override
	public void save(UserDataBase userDataBase) throws Exception {
		validatorState.validate(userDataBase);
		userDataBaseDao.save(userDataBase);
	}

	@Override
	public List<UserDataBase> findAll() {
		return userDataBaseDao.findAll();
	}

	@Override
	public UserDataBase findOne(int id) {
		return userDataBaseDao.findOne(id);
	}

	@Override
	public void delete(int id) {
		userDataBaseDao.delete(id);
	}

}
