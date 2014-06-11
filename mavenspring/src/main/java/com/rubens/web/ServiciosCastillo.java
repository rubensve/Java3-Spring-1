package com.rubens.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiciosCastillo {
    
    @Bean
    Persona ejecutarGracia(){
        return new CuentaChistes();
    }
    
}
