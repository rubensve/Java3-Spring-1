
package com.rubens.model;

import java.util.ArrayList;

public class DAOUsuarioImpl {
    
  public static ArrayList<Usuario> implementacion(){
    ArrayList<Usuario> listaUsuarios= new ArrayList<Usuario>();
            
            Usuario usu;
         usu= new Usuario("jcampos", "xxx", 'Y');
         listaUsuarios.add(usu);
         
         usu= new Usuario("analopez", "yyy", 'Y');
         listaUsuarios.add(usu);
         
         usu= new Usuario("pedroperez", "www", 'N');
         listaUsuarios.add(usu);
         
      return listaUsuarios;
      
  }
}
