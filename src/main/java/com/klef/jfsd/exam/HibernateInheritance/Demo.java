package com.klef.jfsd.exam.HibernateInheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {
    public void execute() {
        // Set up Hibernate session factory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
            // Insert Device
            Device device = new Device();
            device.setBrand("Generic");
            device.setModel("Model X");
            device.setPrice(10000);
            session.save(device);

            // Insert Smartphone
            Smartphone smartphone = new Smartphone();
            smartphone.setBrand("Samsung");
            smartphone.setModel("Galaxy S21");
            smartphone.setPrice(70000);
            smartphone.setOperatingSystem("Android");
            smartphone.setCameraResolution(108);
            session.save(smartphone);

            // Insert Tablet
            Tablet tablet = new Tablet();
            tablet.setBrand("Hello");
            tablet.setModel("Hi");
            tablet.setPrice(55000);
            tablet.setScreenSize(10.5);
            tablet.setBatteryLife(10);
            session.save(tablet);

            transaction.commit();
            System.out.println("Records inserted successfully!");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
