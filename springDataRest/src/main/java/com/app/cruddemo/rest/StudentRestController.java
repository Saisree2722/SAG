package com.app.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.cruddemo.entity.Student;
import com.app.cruddemo.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentRestController 
{

	private StudentService studentService;
	
	@Autowired
	public StudentRestController(StudentService studentService)
	{
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public List<Student> findAll()
	{
		return studentService.findAll();
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student theStudent) {
		theStudent.setRollno(0);
		studentService.save(theStudent);
		return theStudent;		
	}
	
	 @PutMapping("/students")
	 public Student updateStudent(@RequestBody Student theStudent)
	 {
		 studentService.save(theStudent);
		 return theStudent;
	 }
	 
	 @DeleteMapping("/students/{studentId}")
		public String deleteStudent(@PathVariable int studentId)
		{
			studentService.deleteByNo(studentId);
			return "Delete student ID = "+studentId ;
			
		}
	 
	 @GetMapping("/getCount")
	 public String getCount()
	 {
		 int count = studentService.getCount();
		 return "Total student count ="+count;
	 }
	 
	 @GetMapping("/max")
	 public List <Student> getStudentMax() {
		 
		 return studentService.getStudentMax();
	 }
	 
	 @GetMapping("/min")
	 public List <Student> getStudentMin() {
		 
		 return studentService.getStudentMin();
	 }
	 
}
