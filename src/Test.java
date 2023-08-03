import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Student s=new Student(103, "sham", "Python");
	
		Transaction tx = session.beginTransaction();
		session.save(s);
//		session.update(s);
		
		System.out.println("Object saved successfully.....!!");
		tx.commit();
		session.close();
		factory.close();
	
		
	}

}