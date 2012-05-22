/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Mk-is
 */
public class DListServices {
    
    ArrayList<Dservices> Dservices;
    
    public String create(Dservices service)
    {
        SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();        
        session.beginTransaction();
        session.save(service);
        session.getTransaction().commit();
        session.close();
        return "Adicionado com sucesso.";
    }
    
    public List<Dservices> read()
    {
        List<Dservices> services = null;
        SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();        
        session.beginTransaction();
        services = session.createQuery("from Dservices").list();
        session.close();
        return services;
    }
    
    public String update(Dservices service)
    {
        SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();        
        session.beginTransaction();
        session.update(service);
        session.getTransaction().commit();
        session.close();
        return "Actualizado com sucesso.";
    }
    
     public String remove(Dservices service)
    {
        SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();        
        session.beginTransaction();
        session.delete(service);
        session.getTransaction().commit();
        session.close();
        return "Removido com sucesso.";
    }
    
}
