package org.iesch.ad.ejemploExcepciones.config;

import org.iesch.ad.ejemploExcepciones.model.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Configuracion {

    @Bean
    List<Usuario> usuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(Usuario.builder().id(1).nombre("Aitor").apellidos("Monzon").build());
        usuarios.add(Usuario.builder().id(2).nombre("Mariano").apellidos("Blesa").build());
        usuarios.add(Usuario.builder().id(3).nombre("Alberto").apellidos("Perez").build());
        usuarios.add(Usuario.builder().id(4).nombre("Paco").apellidos("Rajoy").build());
        usuarios.add(Usuario.builder().id(5).nombre("Pepe").apellidos("Abascal").build());
        usuarios.add(Usuario.builder().id(6).nombre("Franco").apellidos("Sanchez").build());
        usuarios.add(Usuario.builder().id(7).nombre("Francisco").apellidos("Errejón").build());
        return usuarios;
    }



}
