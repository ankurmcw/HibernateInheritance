package org.ankur.hibernate;

import org.ankur.hibernate.dto.FourWheeler;
import org.ankur.hibernate.dto.TwoWheeler;
import org.ankur.hibernate.dto.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateInheritanceTest {

	public static void main(String[] args) {

		Vehicle v = new Vehicle();
		v.setName("Vehicle");

		TwoWheeler t = new TwoWheeler();
		t.setName("Two Wheeler");
		t.setSteeringHandle("Steering Handle");

		FourWheeler f = new FourWheeler();
		f.setName("Four Wheeler");
		f.setSteeringWheel("Steering Wheel");

		SessionFactory factory = null;
		Session session = null;
		try {
			factory = new Configuration().configure().buildSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			session.save(v);
			session.save(t);
			session.save(f);
			session.getTransaction().commit();									
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
				session = null;
			}
			if (factory != null) {
				factory.close();
				factory = null;
			}
		}
	}

	@Override
	protected void finalize() {
		System.out.println("Garbage collector has been called");
	}

}
