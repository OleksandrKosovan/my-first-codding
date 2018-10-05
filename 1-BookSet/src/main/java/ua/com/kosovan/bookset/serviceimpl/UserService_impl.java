package ua.com.kosovan.bookset.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ua.com.kosovan.bookset.dao.UserDao;
import ua.com.kosovan.bookset.entity.Role;
import ua.com.kosovan.bookset.entity.User;
import ua.com.kosovan.bookset.service.UserService;



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

	public void update(User user) {
		userDao.save(user);
	}

}
