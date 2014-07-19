package com.rubens.model;

import org.hibernate.Session;


/**
 *
 * @author campitos
 */
public class Guardar {
    public void guardar(String nombre, String password, char admin_rol){
            
Session sesion=  HibernateUtilidades.getSessionFactory().openSession();
// primer paso: Empezar una sesion


sesion.getTransaction().begin();
sesion.save(new Usuario("ruben","rubens",'Y'));


sesion.getTransaction().commit();
System.out.println("Se inserto adecuadamente");
sesion.close();
    }
    
}
