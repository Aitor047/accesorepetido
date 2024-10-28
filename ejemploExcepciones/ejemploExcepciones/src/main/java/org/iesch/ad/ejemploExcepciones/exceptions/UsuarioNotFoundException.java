package org.iesch.ad.ejemploExcepciones.exceptions;


import org.iesch.ad.ejemploExcepciones.model.Usuario;

public class UsuarioNotFoundException extends RuntimeException{
    public UsuarioNotFoundException (String s){
        super(s);
    }
}
