package com.klef.jfsd.exam.HibernateInheritance;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting Hibernate Inheritance Demo...");

        // Call the Demo class to execute the database operations
        Demo demo = new Demo();
        demo.execute();

        System.out.println("Hibernate Inheritance Demo Completed!");
    }
}
