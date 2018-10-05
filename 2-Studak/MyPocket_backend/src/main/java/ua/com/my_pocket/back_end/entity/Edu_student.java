package ua.com.my_pocket.back_end.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Edu_student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String surname;
	private String name;
	private String twosurname;

	private String series_studentID;
	private int numbers_studentID;

	public Edu_student() {
	}

	public Edu_student(String surname, String name, String twosurname, String series_studentID, int numbers_studentID) {
		super();
		this.surname = surname;
		this.name = name;
		this.twosurname = twosurname;
		this.series_studentID = series_studentID;
		this.numbers_studentID = numbers_studentID;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTwosurname() {
		return twosurname;
	}

	public void setTwosurname(String twosurname) {
		this.twosurname = twosurname;
	}

	public String getSeries_studentID() {
		return series_studentID;
	}

	public void setSeries_studentID(String series_studentID) {
		this.series_studentID = series_studentID;
	}

	public int getNumbers_studentID() {
		return numbers_studentID;
	}

	public void setNumbers_studentID(int numbers_studentID) {
		this.numbers_studentID = numbers_studentID;
	}

}
