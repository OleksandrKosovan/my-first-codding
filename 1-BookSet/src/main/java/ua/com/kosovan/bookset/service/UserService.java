package ua.com.kosovan.bookset.service;
import java.util.List;

import ua.com.kosovan.bookset.entity.User;



public interface UserService {

	void save(User user);

	List<User> findAll();

	User findOne(int id);

	void delete(int id);

	User findByName(String name);

	User findByUuid(String uuid);

	void update(User user);

}
