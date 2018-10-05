package ua.com.my_pocket.user_database.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.com.my_pocket.user_database.entity.UserDataBase;

/**
 * @author Kosovan Olexandr
 * @version 1.1
 */
public interface UserDataBaseDao extends JpaRepository<UserDataBase, Integer> {

	@Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END "
			+ "FROM UserDataBase u WHERE u.identificationID =:identificationID")
	boolean userDataBaseExistsByIdentificationID(@Param("identificationID") int identificationID);

	@Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END " + "FROM UserDataBase u WHERE u.name =:name")
	boolean userDataBaseExistsByName(@Param("name") String name);

	@Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END " + "FROM UserDataBase u WHERE u.surname =:surname")
	boolean userDataBaseExistsBySurname(@Param("surname") String surname);

	@Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END " + "FROM UserDataBase u WHERE u.dadname =:dadname")
	boolean userDataBaseExistsByDadname(@Param("dadname") String dadname);

	

}
