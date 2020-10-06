package model;

import java.io.Serializable;
import java.text.Collator;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

public class Person implements Serializable{

	private long id;
	private String name;
	private String lastname;
	private int age;
	private Date registerDate;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String lastname, int age, Date registerDate) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.registerDate = registerDate;
	}

	public Person(long id, String name, String lastname, int age, Date registerDate) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.registerDate = registerDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", lastname=" + lastname + ", age=" + age + ", registerDate="
				+ registerDate + "]";
	}	
	
}
