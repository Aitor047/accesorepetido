package org.iesch.ad.password.services;

import org.iesch.ad.password.excepciones.PasswordNotComplexException;
import org.iesch.ad.password.model.usuarioDTO.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    List<UsuarioDTO> usuarios;

    public List<UsuarioDTO> addUsuario(UsuarioDTO usuarioDTO) {

        if (compruebaComplejidadContrasena(usuarioDTO.getPassword())){
            usuarios.add(usuarioDTO);
            return usuarios;
        } else throw new PasswordNotComplexException("La contraseña no cumple complejidad");

    }

    private boolean compruebaComplejidadContrasena(String password) {

        return password.length() > 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*");

    }

    public List<UsuarioDTO> getUsuarios(){

        return usuarios;

    }

}
