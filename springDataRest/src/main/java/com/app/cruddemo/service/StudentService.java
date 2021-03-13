package com.app.cruddemo.service;

import java.util.List;

import com.app.cruddemo.entity.Student;

public interface StudentService 
{

	public List<Student> findAll();
	public void save(Student theStudent);
    public void deleteByNo(int theNo);
	public int getCount();
	public List <Student> getStudentMax();
	public List <Student> getStudentMin();
}
