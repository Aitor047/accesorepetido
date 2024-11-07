package org.iesch.ad.password.controller;

import org.iesch.ad.password.erroresDTO.UsuarioErrorDTO;
import org.iesch.ad.password.model.Usuario;
import org.iesch.ad.password.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("getAll")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(usuarioService.getUsuarios());
    }

//    @PostMapping("add")
//    public ResponseEntity<?> add(@RequestBody UsuarioErrorDTO usuarioDTO) {
//        return ResponseEntity.ok(UsuarioService.addUsuario(usuarioDTO));
//    }

}
