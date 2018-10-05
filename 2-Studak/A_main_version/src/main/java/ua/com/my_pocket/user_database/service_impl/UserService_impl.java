package ua.com.my_pocket.user_database.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ua.com.my_pocket.user_database.dao.UserDao;
import ua.com.my_pocket.user_database.entity.Role;
import ua.com.my_pocket.user_database.entity.User;
import ua.com.my_pocket.user_database.service.UserService;
import ua.com.my_pocket.user_database.validation_user.ValidatorRegistration;

@Service("userDetailsService")
public class UserService_impl implements UserService, UserDetailsService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	@Qualifier("userValidator")
	private ValidatorRegistration validatorRegistration;
	

	public void save(User user) throws Exception {
		validatorRegistration.validate(user);
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

	public void update(User user) {
		userDao.save(user);
	}

	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		return userDao.findByName(name);
	}

}
