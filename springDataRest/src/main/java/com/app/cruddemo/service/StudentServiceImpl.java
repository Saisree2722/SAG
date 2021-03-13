package com.app.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.cruddemo.dao.StudentRepository;
import com.app.cruddemo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService 
{

    private StudentRepository studentRepository;
    
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository)
    {
    	this.studentRepository = studentRepository;
    }
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	@Override
	public void save(Student theStudent) {
		// TODO Auto-generated method stub
		studentRepository.save(theStudent);
	}
	@Override
	public void deleteByNo(int theNo) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(theNo);
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return studentRepository.getCount();
	}
	@Override
	public List <Student> getStudentMax() {
		// TODO Auto-generated method stub
		return studentRepository.getStudentMax();
	}
	@Override
	public List <Student> getStudentMin() {
		// TODO Auto-generated method stub
		return studentRepository.getStudentMin();
	}

}
