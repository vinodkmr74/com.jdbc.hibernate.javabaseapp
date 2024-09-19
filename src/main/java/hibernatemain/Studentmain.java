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
		Student s2=new Student(2,"raj","raj@123.com","B-tech");
		
		//Configuration cfg=new Configuration().configure();
//		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure().build();
//		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sf=md.buildSessionFactory();
//		
	
	
		SessionFactory sf=new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).getMetadataBuilder().build().buildSessionFactory();
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(s);
		session.save(s2);
		tx.commit();
		
		
		System.out.println("done...........");
		
		

		
		
	}

}
