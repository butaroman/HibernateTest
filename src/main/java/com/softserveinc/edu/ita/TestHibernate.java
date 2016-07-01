package com.softserveinc.edu.ita;

/**
 * Created by Roman on 29.06.2016.
 */
import org.hibernate.Session;

public class TestHibernate {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        // Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setEmail("new111@mail.ru");
        emp.setFirstName("Ira111");
        emp.setLastName("Ss111");

        session.save(emp);

        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}