package com.khushbu;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String email;
	private String city;

	public Student(int id, String name, String email, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
	}

	public Student() {
		super();

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return this.id + " : " + this.name + " : " + this.email + " : " + this.city + " : ";
	}

}
