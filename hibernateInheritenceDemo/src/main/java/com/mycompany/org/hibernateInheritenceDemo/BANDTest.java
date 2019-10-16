package com.mycompany.org.hibernateInheritenceDemo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BANDTest {
	public static void main(String[] args) {
		try {
			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(BAND.class)
					.addAnnotatedClass(ModernBand.class)
					.addAnnotatedClass(InternationalBand.class).buildSessionFactory();
			Session session = factory.openSession();
			BAND cd = new BAND("Bangalore Swaggers", "Rush", "MG Road", 5);
			ModernBand secd = new ModernBand("Bangalore Swaggers", "Rush", "MG Road", 5 ,
					"Electric Guitar");
			InternationalBand icd = new InternationalBand("Bangalore Swaggers", "Rush", "MG Road", 5, "Spanish", 4);
		session.getTransaction().begin();
			session.save(cd);
			session.save(secd);
			session.save(icd);
			session.getTransaction().commit();
			System.out.println("ok..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}