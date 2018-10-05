package ua.com.my_pocket.user_database.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 
 * @author Kosovan Olexandr
 * @version 2.0
 * @class entity for user;
 */
@Entity
public class User implements UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	private UserDataBase userDataBase;

	private int identification_code;
	private String name;
	private String surname;
	private String dadsurname;

	private String email;
	private String password;
	private int phone;

	private boolean enabled;
	private String UUID;

	@Enumerated
	private Role role;

	public User() {
	}

	public User(int identification_code, String name, String surname, String dadsurname, String email, String password,
			int phone) {
		super();
		this.identification_code = identification_code;
		this.name = name;
		this.surname = surname;
		this.dadsurname = dadsurname;
		this.email = email;
		this.password = password;
		this.phone = phone;
	}

	public UserDataBase getUserDataBase() {
		return userDataBase;
	}

	public void setUserDataBase(UserDataBase userDataBase) {
		this.userDataBase = userDataBase;
	}

	public String getDadsurname() {
		return dadsurname;
	}

	public void setDadsurname(String dadsurname) {
		this.dadsurname = dadsurname;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdentification_code() {
		return identification_code;
	}

	public void setIdentification_code(int identification_code) {
		this.identification_code = identification_code;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getUUID() {
		return UUID;
	}

	public void setUUID(String uUID) {
		UUID = uUID;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(role.name()));
		return null;
	}

	@Override
	public String getUsername() {
		return String.valueOf(id);
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
}
