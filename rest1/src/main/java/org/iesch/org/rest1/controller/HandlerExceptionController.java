package org.iesch.org.rest1.controller;

import org.iesch.org.rest1.erroresDTO.ProductErrorDTO;
import org.iesch.org.rest1.excepciones.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;
import java.util.Date;

@RestControllerAdvice
public class HandlerExceptionController {

    //Cuando no se encuetra el producto
    @ExceptionHandler({ProductNotFoundException.class})
    public ResponseEntity<?> ProductoNoEncontradoException(Exception ex) {
        ProductErrorDTO productErrorDTO = new ProductErrorDTO();
        productErrorDTO.setDate(new Date());
        productErrorDTO.setError("Error: Producto no encontrado");
        productErrorDTO.setMensaje(ex.getMessage());
        productErrorDTO.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(productErrorDTO);
    }

}
