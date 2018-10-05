package ua.com.young_dream.stud_id.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ua.com.young_dream.stud_id.dao.UserDao;
import ua.com.young_dream.stud_id.entity.Role;
import ua.com.young_dream.stud_id.entity.User;
import ua.com.young_dream.stud_id.service.UserService;

@Service("userDetailsService")
public class UserService_impl implements UserService, UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private BCryptPasswordEncoder encoder;

	public void save(User user) {
		user.setRole(Role.ROLE_USER);
		user.setPassword(encoder.encode(user.getPassword()));
		userDao.save(user);
	}

	public List<User> findAll() {
		return userDao.findAll();
	}

	public User findOne(int id) {
		return userDao.findOne(id);
	}

	public void delete(int id) {
		userDao.delete(id);
	}

	public User findByName(String name) {
		return userDao.findByName(name);
	}

	public User findByUuid(String uuid) {
		return userDao.findByUUID(uuid);
	}

	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		return userDao.findByName(name);
	}

}
