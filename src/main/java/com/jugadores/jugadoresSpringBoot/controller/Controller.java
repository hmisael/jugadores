package com.jugadores.jugadoresSpringBoot.controller;

import com.jugadores.jugadoresSpringBoot.service.IJugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hernán Misael
 */
@RestController
public class Controller {
      
    @Autowired
    public IJugadorService jugadorService;
    
    @GetMapping ("/jugadores")
    public String calcularPromedioEstatura(){   
        double promedio = jugadorService.calcularPromedio();
        return ("El promedio de estatura de los jugadores es "+promedio);
    }
    
    
}
