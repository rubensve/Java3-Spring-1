package com.rubens.web;

import com.rubens.model.Guardar;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author campitos
 */
@Controller
@RequestMapping("/")
public class ControladorUsuario {


    @RequestMapping(value="/usuario/{nombre}/{password}/{admin_rol}", method=RequestMethod.GET, headers={"Accept=text/html"})
    public @ResponseBody String metodo(@PathVariable String nombre, @PathVariable String password, @PathVariable char admin_rol ){
        /*
        Esto esta mal, alerta de lo que no se debe hacer, esta clase que le puse de nombre Guarda NO USA UNA SESION A PRUEBA DE THREASD NI NADA
        ES SOLO UN EJEMPLO DE  CONTROLADOR, LE PASAMOS UN PARAMETRO NOMBRE Y LA LO GUADA, TU LABOR ES HACER QUE FUNCIONE 
        A PRUEBA DE TREADS JIJIJI
        */
    Guardar g=new Guardar();
      g.guardar(nombre, password, admin_rol);
        return nombre +" ya se ha guardado, este esta pesimo, no es thead safe, no maneja nada de TheradsLocal ni nada, CORRIGELOOOOO!!!";
    }
    
}

