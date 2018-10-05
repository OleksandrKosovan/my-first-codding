package ua.com.my_pocket.back_end.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Edu_university {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int codeLocation;

	public Edu_university() {
	}

	public Edu_university(String name, int codeLocation) {
		super();
		this.name = name;
		this.codeLocation = codeLocation;
	}

	public int getCodeLocation() {
		return codeLocation;
	}

	public void setCodeLocation(int codeLocation) {
		this.codeLocation = codeLocation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
