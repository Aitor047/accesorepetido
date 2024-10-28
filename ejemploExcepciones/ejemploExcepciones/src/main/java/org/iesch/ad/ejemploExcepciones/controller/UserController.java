package org.iesch.ad.ejemploExcepciones.controller;

import org.iesch.ad.ejemploExcepciones.exceptions.UsuarioNotFoundException;
import org.iesch.ad.ejemploExcepciones.model.Usuario;
import org.iesch.ad.ejemploExcepciones.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("api/findall")
    public ResponseEntity<?> devuelveTodos(){
        List<Usuario> lista = usuarioService.buscarTodos();
        if (lista.isEmpty()){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(lista);
        }
    }

    @GetMapping("api/findID/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable long id){
        Usuario usuario = usuarioService.buscaPorId(id).orElseThrow(() -> new UsuarioNotFoundException("El usuario no existe!!"));
        return ResponseEntity.ok(usuario);
    }

}
