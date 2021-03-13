package com.app.bean;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "student")
public class Student {

	@Id
	private int prn_no;
	
	@Column
	private String name;
	
	@Column
	private int sub1;
	
	@Column
	private int sub2;
	
	@Column
	private int sub3;
	
	
	public Student() {
		super();
	}

	public int getPrn_no() {
		return prn_no;
	}

	public void setPrn_no(int prn_no) {
		this.prn_no = prn_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	

	@Override
	public String toString() {
		return "Student [prn_no=" + prn_no + ", name=" + name + ", sub1=" + sub1 + ", sub2=" + sub2
				+ ", sub3=" + sub3 + "]";
	}
	
	
	
}
