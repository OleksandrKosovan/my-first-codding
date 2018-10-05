package ua.com.my_pocket.back_end.service;

import java.util.List;

import ua.com.my_pocket.back_end.entity.User;

public interface UserService {

	void save (User user) throws Exception;
	List<User> findAll();
	User findOne(int id);
	void delete (int id);
	
	User findByName(String name);
	User findByUuid(String uuid);
	
	void update(User user);
	void updateProfile(User user);
	
	
	
}
