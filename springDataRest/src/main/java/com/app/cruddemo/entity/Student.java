package com.app.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="student")
public class Student
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int rollno;
	@Column(name = "first_name")
	@NotNull(message="First name cannot be null")
	private String firstName;
	@Column(name = "last_name")
	@NotNull(message="Last name cannot be null")
	private String lastName;
	@Column(name = "email")
	@NotNull(message="Email cannot be null")
	@Email
	private String email;
	@Column(name="score")
	@NotNull(message="Scores cannot be null")
	private int score;
	
	public Student() {}
	
	public Student(int rollno,String firstName,String lastName,String email,int score)
	{
		super();
		this.rollno = rollno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.score = score;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", score=" + score + "]";
	}

}
