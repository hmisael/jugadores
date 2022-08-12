package com.jugadores.jugadoresSpringBoot.service;

import com.jugadores.jugadoresSpringBoot.model.Jugador;
import java.util.ArrayList;

/**
 *
 * @author Hernán Misael
 */
public interface IJugadorService {
     public double calcularPromedio ();
    public ArrayList<Jugador> traerJugadores();
}
