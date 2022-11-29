package com.hiber;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateCity {
	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		
		Transaction trsc = session.beginTransaction();
		
		
		Student ci1 = new Student("Pratik", "IND");
		Student ci2 = new Student("Sham", "Chaina");
		Student ci3 = new Student("Ram", "Ind");
		Student ci4 = new Student("rancho", "Canada");
		
		
		int c1 = (Integer) session.save(ci1);
		int c2 = (Integer) session.save(ci2);
		int c3 = (Integer) session.save(ci3);
		int c4 = (Integer) session.save(ci4);

		trsc.commit();
		System.out.println("");
		
		Transaction trsc2 = session.beginTransaction();
		
		List<Student> Student = session.createQuery("from Student").list();
		

		trsc2.commit();
		
		
		for(Student city : Student)
		{
			System.out.println(city.getStudentId()+" "+city.getStudentName()+" "+city.getCountry());
		}
		
	}

}

