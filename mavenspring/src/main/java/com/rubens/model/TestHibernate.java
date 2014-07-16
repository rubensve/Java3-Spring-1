package com.rubens.model;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

public class TestHibernate {
    public static void main(String[] args) {
Session sesion= HibernateUtilidades.getSessionFactory().openSession();
//primer paso: Empezar una sesion

sesion.getTransaction().begin();

//update
/*Query q= sesion.createQuery("from Usuario");
ArrayList<Usuario> usuarios = (ArrayList<Usuario>)q.list();

for(Usuario usu:usuarios){
    System.out.println(usu);
}
*/

Criteria c= sesion.createCriteria(Usuario.class);
c.list();
ArrayList<Usuario> usuarios = (ArrayList<Usuario>)c.list();

for(Usuario usu:usuarios){
    System.out.println(usu);
}

//sesion.save(new Usuario("rubens", "ruben", 'V'));
sesion.getTransaction().commit();
sesion.close();
    
    }
    
}
