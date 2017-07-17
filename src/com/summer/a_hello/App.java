package com.summer.a_hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;


import java.util.Date;

/**
 * Created by Administrator on 2017/7/17.
 */
public class App {
    @Test
    public void testHello() throws Exception{
        Employee emp = new Employee();
        emp.setEmpName("班长");
        emp.setWorkDate(new Date());


        Configuration config = new Configuration();
        config.configure();
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(emp);
        tx.commit();

        session.close();
        sf.close();
    }
}
