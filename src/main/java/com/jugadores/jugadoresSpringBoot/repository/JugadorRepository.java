package com.jugadores.jugadoresSpringBoot.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jugadores.jugadoresSpringBoot.model.Jugador;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

/**
 *
 * @author Hernán Misael
 */
@Repository
public class JugadorRepository implements IJugadorRepository{

    @Override
    public ArrayList<Jugador> traerJugadores() {        
       
        File file = null;
        
        try{
            //Obtener un archivo del path
            file = ResourceUtils.getFile(this.getClass().getResource("/jugadores.json")); 
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        //mapear objetos a partir de archivos
        ObjectMapper objectMapper = new ObjectMapper();
        //el nuevo tipo de referencia, un ArrayList de tipo Jugador
        TypeReference<ArrayList<Jugador>> typeRef = new TypeReference<>(){
   
        };
        ArrayList<Jugador> listaJugadores = null;
        //la lista va a ser igual al mapeador de objetos. 
        //ObjectMapper lee archivo y mapea a Jugador como tipo de referencia
        try{
            listaJugadores = objectMapper.readValue(file, typeRef);
        }
        catch(IOException e){
            e.printStackTrace();
        
        }
        return listaJugadores;

    }
    
   
}
