package com.shanu.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure("/com/shanu/config/pg.hibernate.cfg.xml");

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

//		---------------------------------- get users ------------------------------------

//		try {
//			User u1 = session.get(User.class, 2);
//
//			if (u1 != null) {
//				System.out.println(u1);
//			} else {
//				System.out.println("User not Found");
//			}
//
//		} catch (Exception e) {
//			System.out.println(e.getCause());
//		}

//		------------------------------------ create user --------------------------------------

//		try {
//			User u1 = new User();
//
//			u1.setName("shanu");
//			u1.setAge(21);
//
//			session.save(u1);
//			transaction.commit();
//		} catch (Exception e) {
//			System.out.println(e.getCause());
//			transaction.rollback();
//		}

//		------------------------------------ update user --------------------------------------

//		try {
//			User u1 = new User();
//
//			u1.setId(3);
//			u1.setName("shanu-123");
//			u1.setAge(21);
//
//			session.saveOrUpdate(u1);
//			transaction.commit();
//		} catch (Exception e) {
//			System.out.println(e.getCause());
//			transaction.rollback();
//		}

//		------------------------------------ delete user --------------------------------------

//		try {
//			User u1 = new User();
//
//			u1.setId(2);
//
//			session.delete(u1);
//			transaction.commit();
//		} catch (Exception e) {
//			System.out.println(e.getCause());
//			transaction.rollback();
//		}

	}
}
