package com.rubens.web;
import com.rubens.model.DAOUsuarioImpl;
import com.rubens.model.Usuario;
import java.util.ArrayList;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/servicio-usuario")
public class ControllerUsuario {

@RequestMapping(value="/todos", method=RequestMethod.GET, headers=("Accept=text/html"))

public @ResponseBody String buscarTodos(){
String mensaje="Probando el metodo get para enviar a todos los usuarios";    
return mensaje;
}

@RequestMapping(value="/usuario", method=RequestMethod.GET, headers=("Accept=Application/json"))

@ResponseBody String mijason(){
ObjectMapper mapeadorjson= new ObjectMapper();
    
    return null;
};

@RequestMapping(value ="/nuevo", method = RequestMethod.GET, headers =("Accept=Application/json"))
@ResponseBody ArrayList<Usuario> leerarray(){
   
 return  DAOUsuarioImpl.implementacion();
}







}
