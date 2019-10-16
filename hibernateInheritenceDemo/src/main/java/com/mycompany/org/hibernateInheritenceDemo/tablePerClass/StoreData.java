package com.mycompany.org.hibernateInheritenceDemo.tablePerClass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.addAnnotatedClass(RegularEmployee.class).addAnnotatedClass(Contract.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setName("karu");
		RegularEmployee e2 = new RegularEmployee();
		e2.setName("kavya");
		e2.setSalary(25000);
		e2.setBonus(5);

		Contract e3 = new Contract();
		e3.setName("dwithi");
		e3.setPay_per_hour(1000);
		e3.setContract_duration("7 hours");

		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		t.commit();
		session.close();
		System.out.println("success");
	}
}