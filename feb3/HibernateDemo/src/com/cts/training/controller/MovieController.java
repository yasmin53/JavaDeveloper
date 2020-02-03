package com.cts.training.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.Actor;
import com.cts.training.model.Movie;

public class MovieController {

	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Movie movie= new Movie();
		movie.setName("Surya");

		Actor actor1 = new Actor();
		
		actor1.setActorName("Prabhas");
		actor1.setMovie(movie);

		Actor actor2= new Actor();
		actor2.setActorName("Sharwa");
		actor2.setMovie(movie);

		Transaction tx1=session.getTransaction();
		
		session.save(movie);
		session.save(actor1);
		session.save(actor2);
		

		
		
		tx.commit();
		session.close();
		
		
	}
}
