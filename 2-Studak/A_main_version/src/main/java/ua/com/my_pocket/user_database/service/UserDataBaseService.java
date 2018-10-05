package ua.com.my_pocket.user_database.service;

import java.util.List;

import ua.com.my_pocket.user_database.entity.UserDataBase;

/**
 * 
 * @author Kosovan Olexandr
 * @version 1.1
 */
public interface UserDataBaseService {

	void save(UserDataBase userDataBase) throws Exception;

	List<UserDataBase> findAll();

	UserDataBase findOne(int id);

	void delete(int id);

}
