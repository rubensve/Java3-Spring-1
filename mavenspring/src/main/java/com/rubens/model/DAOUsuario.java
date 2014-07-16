/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rubens.model;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;

/**
 *
 * @author T107
 */
public class DAOUsuario {
    
    public static ArrayList<Usuario> buscar(){
        Session sesion= HibernateUtilidades.getSessionFactory().openSession();
        sesion.getTransaction().begin();
        Criteria c= sesion.createCriteria(Usuario.class);
        c.list();
        ArrayList<Usuario> usuarios = (ArrayList<Usuario>)c.list();   
    sesion.getTransaction().commit();
    sesion.close();
    return usuarios;
    }
    }
    

