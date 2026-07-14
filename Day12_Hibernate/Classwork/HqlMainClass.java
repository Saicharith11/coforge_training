package com.coforge.main;

import java.util.List;                     // ✅ correct import

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.coforge.model.Employee;

public class HqlMainClass {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Query<Employee> query = session.createQuery("from Employee", Employee.class); // better: type-safe
//		List<Employee> list = query.list();
//		System.out.println(list);
		
		//Query<Employee> query = session.createQuery("from Employee where empId = :id", Employee.class);
		//query.setParameter("id", 105);          // ✅ pass param name + actual value
		
		//List<Employee> list = query.list();
		//System.out.println(list);
		
		//Query<String> query = session.createQuery("Select empName from Employee", String.class);
		//query.setParameter("id", 105);          // ✅ pass param name + actual value
		
		//List<String> list = query.list();
		//System.out.println(list);
		
		//HQL Update
		//Query<Employee> query = session.createQuery("Update Employee set empName = :name where empId = :id");
		//query.setParameter("name", "charith");    
		//query.setParameter("id", 102);// ✅ pass param name + actual value
		
		//HQL Delete
		Query query = session.createQuery("Delete from Employee where empId = :id");
		query.setParameter("id", 105);// ✅ pass param name + actual value
		
		int rowupdated = query.executeUpdate();
		System.out.println("Rows Updates : " + rowupdated);

		
		
		transaction.commit();
		session.close();
		factory.close();
	}
}