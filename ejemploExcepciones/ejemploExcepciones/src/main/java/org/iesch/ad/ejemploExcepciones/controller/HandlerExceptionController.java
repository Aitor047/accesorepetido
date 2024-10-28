package org.iesch.ad.ejemploExcepciones.controller;

import org.iesch.ad.ejemploExcepciones.errorresDTO.ErrorDTO;
import org.iesch.ad.ejemploExcepciones.exceptions.UsuarioNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.Date;

@RestControllerAdvice
public class HandlerExceptionController {

    @ExceptionHandler({NoHandlerFoundException.class, NoResourceFoundException.class})
    public ResponseEntity<ErrorDTO> notFoundException (Exception ex) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setDate(new Date());
        errorDTO.setError("Error: Api no encontrada");
        errorDTO.setMessage(ex.getMessage());
        errorDTO.setStatus(HttpStatus.NOT_FOUND.value());

        return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).body(errorDTO);
    }

    @ExceptionHandler({UsuarioNotFoundException.class})
    public ResponseEntity<ErrorDTO> notFoundUser (Exception ex) {
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setDate(new Date());
        errorDTO.setError("Error: Usuario no encontrado");
        errorDTO.setMessage(ex.getMessage());
        errorDTO.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(errorDTO);
    }

}
