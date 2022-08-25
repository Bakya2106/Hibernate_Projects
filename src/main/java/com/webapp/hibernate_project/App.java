package com.webapp.hibernate_project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PersonName pn= new PersonName();
    	pn.setFname("Bakya");
    	pn.setLname("Pandiarajan");
    	
    	
    	//adding property
    	Person p1=new Person();
  	    p1.setId(4);
        p1.setName(pn);
        p1.setCity("Chennai");
     
      // Person p2=null;
        
Configuration  con=new Configuration().configure().addAnnotatedClass(Person.class); //give the name of the config file name if its not default(hibernate.cfg.xml)

SessionFactory sf=con.buildSessionFactory();

Session s=sf.openSession();

Transaction tx=s.beginTransaction();

s.save(p1);

//p2=(Person) s.get(Person.class, 4); //fetching a data from db
tx.commit();

//System.out.println(p2);
    }
}
