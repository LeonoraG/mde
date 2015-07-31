/*
 * ARISTOSTLE UNIVERSITY OF THESSALONIKI
 * Copyright (C) 2015
 * Aristotle University of Thessaloniki
 * Department of Electrical & Computer Engineering
 * Division of Electronics & Computer Engineering
 * Intelligent Systems & Software Engineering Lab
 *
 * Project             : testService
 * WorkFile            : 
 * Compiler            : 
 * File Description    : 
 * Document Description: 
* Related Documents	   : 
* Note				   : 
* Programmer		   : RESTful MDE Engine created by Christoforos Zolotas
* Contact			   : christopherzolotas@issel.ee.auth.gr
*/


package eu.fp7.scase.testservice.utilities;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import eu.fp7.scase.testservice.bookmark.JavabookmarkModel;
import eu.fp7.scase.testservice.account.JavaaccountModel;

/* This class follows the singleton pattern in order to build once and provide a unique hibernate session instance*/

public class HibernateUtil{

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        try {
        /* Create the unique hibernate session. All resource models should be added here.*/
            return new AnnotationConfiguration().configure()
					.addAnnotatedClass(JavabookmarkModel.class)
					.addAnnotatedClass(JavaaccountModel.class)
                    .buildSessionFactory();
        }
        catch (Throwable ex){
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
