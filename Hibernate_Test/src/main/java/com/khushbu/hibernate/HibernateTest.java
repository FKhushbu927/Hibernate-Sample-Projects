package com.khushbu.hibernate;
//import com.khushbu.hibernate.Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
	
		
		Configuration config=new Configuration();
        config.setProperty("hibernate.connection.driver_class","oracle.jdbc.OracleDriver");
        config.setProperty("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:xe");
        config.setProperty("hibernate.connection.username","system");
        config.setProperty("hibernate.connection.password","1234");
       
        config.setProperty("hibernate.dialect","org.hibernate.dialect.Oracle10gDialect");
        config.setProperty("hibernate.show_sql","true");
        
        config.addAnnotatedClass(Customer.class);
        
        
        SessionFactory sessionFactory= config.buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();
        session.save(new Customer("khushbu","fkhushbu754@gmail.com"));
        session.save(new Customer("Farzana","farzana@gmail.com"));
        
        transaction.commit();
        session.close();
        sessionFactory.close();

	}

}
