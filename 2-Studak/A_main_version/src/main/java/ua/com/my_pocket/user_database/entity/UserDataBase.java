package ua.com.my_pocket.user_database.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * 
 * @author Kosovan Olexandr
 * @version 2.2
 * @class from information about user/ state DB
 *
 */
@Entity
public class UserDataBase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne(mappedBy = "userDataBase")
	private User user;

	private int identificationID;

	private String seriaPassport;
	private int codePassport;

	private String name;
	private String surname;
	private String dadname;

	public UserDataBase() {
	}

	public UserDataBase(int identificationID, String seriaPassport, int codePassport, String name, String surname,
			String dadname) {
		super();
		this.identificationID = identificationID;
		this.seriaPassport = seriaPassport;
		this.codePassport = codePassport;
		this.name = name;
		this.surname = surname;
		this.dadname = dadname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getIdentificationID() {
		return identificationID;
	}

	public void setIdentificationID(int identificationID) {
		this.identificationID = identificationID;
	}

	public String getSeriaPassport() {
		return seriaPassport;
	}

	public void setSeriaPassport(String seriaPassport) {
		this.seriaPassport = seriaPassport;
	}

	public int getCodePassport() {
		return codePassport;
	}

	public void setCodePassport(int codePassport) {
		this.codePassport = codePassport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDadname() {
		return dadname;
	}

	public void setDadname(String dadname) {
		this.dadname = dadname;
	}

}