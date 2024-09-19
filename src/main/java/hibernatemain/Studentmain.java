package hibernatemain;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import hibernate.student.Student;


public class Studentmain {

	public static void main(String[] args) {
		
		Student s=new Student(1,"rajhana","rajhana@123.com","B-tech");
		
		//Configuration cfg=new Configuration().configure();
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure().build();
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf=md.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		
		
		System.out.println("done...........");
		
		

		
		
	}

}
