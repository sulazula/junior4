package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.sql.*;

public class Db {
    public static final String URL = "jdbc:mysql://localhost:3306";
    public static final String USER = "root";
    public static final String PASSWORD = "123qwerty";

    public static void con() {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();
        SessionFactory sf = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();
        Session session = sf.openSession();
        Person p = new Person("Andrew", "Peterson", 35);
        Person p2 = new Person("John", "Smith", 45);

        session.beginTransaction();
        session.save(p);
        session.save(p2);
        session.getTransaction().commit();
        session.close();
    }


}
