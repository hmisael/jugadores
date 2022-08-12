package com.jugadores.jugadoresSpringBoot.service;

import com.jugadores.jugadoresSpringBoot.model.Jugador;
import com.jugadores.jugadoresSpringBoot.repository.IJugadorRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hernán Misael
 */

@Service
public class JugadorService implements IJugadorService{

    @Autowired
    private IJugadorRepository jugadorRepo;
    
    @Override
    public double calcularPromedio() {
        double suma = 0.0;
        double promedio = 0.0;
        
        ArrayList<Jugador> jugadores = this.traerJugadores();
        
        for (Jugador jugador : jugadores){
            suma =  suma + jugador.getEstatura();
        }
        
        promedio= suma / jugadores.size();
        
        return promedio;
    }

    @Override
    public ArrayList<Jugador> traerJugadores() {
        return jugadorRepo.traerJugadores();
    }
    
}
