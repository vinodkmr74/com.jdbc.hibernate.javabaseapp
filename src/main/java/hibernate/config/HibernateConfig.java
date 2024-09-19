package hibernate.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibernateConfig {
	
	public static SessionFactory getSessionFactory()
	{
		
		//collection ke hastable ke obj
		Properties ps=new Properties();
		
		ps.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
		ps.put(Environment.URL,"jdbc:mysql://localhost:3306/javabase");
		ps.put(Environment.USER,"root");
        ps.put(Environment.PASS,"root")	;	
        ps.put(Environment.HBM2DDL_AUTO,"create");
        ps.put(Environment.SHOW_SQL,"true");
        ps.put(Environment.FORMAT_SQL,"true");
        
        
        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().applySettings(ps).build();
        MetadataSources metadatasources=new MetadataSources(ssr);
                                                          // fully class name persistent obj ke
        Metadata meta= metadatasources.addAnnotatedClass(hibernate.student.Student.class).buildMetadata();
        SessionFactory sf=meta.buildSessionFactory();
		
		
		return sf;
		
	}

}
