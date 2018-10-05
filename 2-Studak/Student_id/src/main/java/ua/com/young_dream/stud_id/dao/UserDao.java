package ua.com.young_dream.stud_id.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.com.young_dream.stud_id.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

	@Query("select u from User u where u.UUID =:uuid")
	User findByUUID(@Param("uuid") String uuid);

	User findByName(String name);

	@Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM User u WHERE u.name =:name")
	boolean userExistsByName(@Param("name") String name);

	@Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM User u WHERE u.email =:email")
	boolean userExistsByEmail(@Param("email") String email);
}
