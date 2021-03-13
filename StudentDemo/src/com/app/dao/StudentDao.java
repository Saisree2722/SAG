package com.app.dao;

import com.app.bean.Student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StudentDao
{
	
	public static Student getRecordById(int id) 
	{
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		Student stud =session.get(Student.class, id);
		session.getTransaction().commit();
		return stud;		
	}

}


	
	
	 


