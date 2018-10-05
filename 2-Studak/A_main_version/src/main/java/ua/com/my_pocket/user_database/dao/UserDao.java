package ua.com.my_pocket.user_database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.com.my_pocket.user_database.entity.User;

/**
 * 
 * @author Kosovan Olexandr
 * @version 1.0
 * @interface which communicates from DB and for write query
 *
 */
public interface UserDao extends JpaRepository<User, Integer> {

	@Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM User u WHERE u.identification_code =:identification_code")
	boolean userExistsByIdentification_code(@Param("identification_code") int identification_code);

	@Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM User u WHERE u.phone =:phone")
	boolean userExistsByPhone(@Param("phone") int phone);

	@Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM User u WHERE u.email =:email")
	boolean userExistsByEmail(@Param("email") String email);

	@Query("select u from User u where u.UUID =:uuid")
	User findByUUID(@Param("uuid") String uuid);

	User findByName(String name);
}
