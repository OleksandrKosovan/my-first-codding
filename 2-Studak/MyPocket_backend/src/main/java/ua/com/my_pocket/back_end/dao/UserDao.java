package ua.com.my_pocket.back_end.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.com.my_pocket.back_end.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

	@Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM User u WHERE u.email =:email")
	boolean userExistsByEmail(@Param("email") String email);
	
	
	@Query("select u from User u where u.UUID =:uuid")
	User findByUUID(@Param("uuid")String uuid);
	
	User findByName(String name);
}
