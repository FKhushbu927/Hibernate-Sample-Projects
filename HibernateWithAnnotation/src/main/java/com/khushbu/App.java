package com.khushbu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		System.out.println("session factory");
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Student student = new Student();
		student.setId(11509027);
		student.setName("Khushbu");
		student.setEmail("fkhushbu754@gmail.com");
		student.setCity("Dhaka");
		System.out.println(student);
		Session session = factory.openSession();

		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}

}
