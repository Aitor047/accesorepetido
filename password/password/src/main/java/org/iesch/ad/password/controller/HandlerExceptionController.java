package org.iesch.ad.password.controller;

import org.iesch.ad.password.erroresDTO.UsuarioErrorDTO;
import org.iesch.ad.password.excepciones.PasswordNotComplexException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class HandlerExceptionController {

    @ExceptionHandler({PasswordNotComplexException.class})
    public ResponseEntity<?> ContraseñaNoComplejaExcepcion(Exception ex) {
        UsuarioErrorDTO usuarioErrorDTO = new UsuarioErrorDTO();
        usuarioErrorDTO.setMessage(ex.getMessage());
        usuarioErrorDTO.setDate(LocalDateTime.now());
        usuarioErrorDTO.setError("Contraseña sin complejidad");
        usuarioErrorDTO.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(usuarioErrorDTO);
    }

}
