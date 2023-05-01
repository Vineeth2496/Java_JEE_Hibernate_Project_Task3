package com.package2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.package1.emp;

public class execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction ts=null;
		try
		{
		emp e=new emp();
		
		Configuration cfg=new Configuration();
		cfg.configure("com\\package3\\cong.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session ses=sf.openSession();
		
		ts=ses.beginTransaction();
		
		e.setId(120);
		e.setName("Vineeth");
		e.setSal(70000.00f);
		e.setDept("IT");
		System.out.println(e.toString());
		
		ses.save(e);
		ts.commit();
		//System.out.println("Record Updated");
		
		}
		catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		//	ts.rollback();
		}
		
	}

}
