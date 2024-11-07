package org.iesch.ad.password.config;

import org.iesch.ad.password.model.Usuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class Configuracion {

    @Bean
    public ArrayList<Usuario> inicializa(){
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("admin@iesch.org", "admin"));
        usuarios.add(new Usuario("user@iesch.org", "admin23"));
        usuarios.add(new Usuario("aitor@iesch.org", "admin1313"));
        return usuarios;
    }



}
