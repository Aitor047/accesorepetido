package org.iesch.AD.busqueda.controlador;

import org.iesch.AD.busqueda.servicios.AutorService;
import org.iesch.AD.busqueda.servicios.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutorControler {

    @Autowired
    AutorService autorService;

    @GetMapping("/api/autores")
    public ResponseEntity<?> devuelveTodos(){
        return ResponseEntity.ok(autorService.devuelveTodos());
    }

}
