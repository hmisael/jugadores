package com.jugadores.jugadoresSpringBoot.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Hernán Misael
 */

@Getter @Setter
public class Jugador {
    
   private long id;
   private int dni;
   private String nombre;
   private String apellido;
   private int edad;
   private double peso;
   private double estatura;

    public Jugador() {
    }

    public Jugador(long id, int dni, String nombre, String apellido, int edad, double peso, double estatura) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
   
    
    
}
