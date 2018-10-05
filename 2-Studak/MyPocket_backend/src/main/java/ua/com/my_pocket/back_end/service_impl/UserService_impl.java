package ua.com.my_pocket.back_end.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ua.com.my_pocket.back_end.dao.UserDao;
import ua.com.my_pocket.back_end.entity.Role;
import ua.com.my_pocket.back_end.entity.User;
import ua.com.my_pocket.back_end.service.UserService;

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

	public void update(User user) {
		userDao.save(user);
	}

	@Override
	public void updateProfile(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		userDao.save(user);
	}

	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		return userDao.findByName(name);
	}

	/*
	 * @Override
	 * 
	 * @Transactional public void saveImage(Principal principal, MultipartFile
	 * multipartFile) throws Exception {
	 * 
	 * validatorImgUser.validate(userDao.findOne(Integer.parseInt(principal.
	 * getName())));
	 * 
	 * User user = userDao.findOne(Integer.parseInt(principal.getName()));
	 * 
	 * String path = System.getProperty("catalina.home") + "/resources/" +
	 * user.getName() + "/" + multipartFile.getOriginalFilename();
	 * 
	 * user.setPathImage("resources/" + user.getName() + "/" +
	 * multipartFile.getOriginalFilename());
	 * 
	 * File file = new File(path);
	 * 
	 * try { file.mkdirs(); try { FileUtils.cleanDirectory (new
	 * File(System.getProperty("catalina.home") + "/resources/" + user.getName()
	 * + "/")); } catch (IOException e) { e.printStackTrace(); }
	 * multipartFile.transferTo(file); } catch (IOException e) {
	 * System.out.println("error with file"); } }
	 */

}
