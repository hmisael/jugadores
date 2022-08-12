package com.jugadores.jugadoresSpringBoot.repository;

import com.jugadores.jugadoresSpringBoot.model.Jugador;
import java.util.ArrayList;

/**
 *
 * @author Hernán Misael
 */
public interface IJugadorRepository {
    
    public ArrayList<Jugador> traerJugadores(); 
}
