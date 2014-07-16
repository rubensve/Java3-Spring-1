package com.rubens.web;

import com.rubens.model.DAOUsuario;
import com.rubens.model.Usuario;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/usuario")

public class ControllerUsuarios {
    
   @RequestMapping(value ="/prueba", method = RequestMethod.GET, headers =("Accept=Application/json") ) 
   @ResponseBody ArrayList<Usuario> leerusuarios(){
       return DAOUsuario.buscar();
   }
}
