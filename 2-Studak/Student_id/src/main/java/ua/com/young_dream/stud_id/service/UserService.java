package ua.com.young_dream.stud_id.service;

import java.util.List;

import ua.com.young_dream.stud_id.entity.User;

public interface UserService {

	void save(User user);

	List<User> findAll();

	User findOne(int id);

	void delete(int id);

	User findByName(String name);

	User findByUuid(String uuid);

}
