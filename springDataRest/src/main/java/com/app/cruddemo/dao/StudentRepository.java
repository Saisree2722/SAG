package com.app.cruddemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.cruddemo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> 
{

	@Query(value="select count(id) from Student")
	public int getCount();
	@Query(value="select firstName,lastName,email,score from Student where score in (select max(score) from Student)")
	public List <Student> getStudentMax();
	@Query(value="select firstName,lastName,email,score from Student where score in (select min(score) from Student)")
	public List <Student> getStudentMin();
	
}
