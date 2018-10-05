package ua.com.my_pocket.user_database.service;

import java.util.List;

import ua.com.my_pocket.user_database.entity.User;

/**
 * 
 * @author Kosovan Olexandr
 * @version 1.0
 * @interface from methods for entity User
 */
public interface UserService {

	void save(User user) throws Exception;

	List<User> findAll();

	User findOne(int id);

	void delete(int id);

	User findByName(String name);

	User findByUuid(String uuid);

	void update(User user);

}
