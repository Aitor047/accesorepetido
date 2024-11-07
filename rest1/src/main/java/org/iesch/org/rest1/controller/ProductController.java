package org.iesch.org.rest1.controller;

import org.iesch.org.rest1.excepciones.ProductNotFoundException;
import org.iesch.org.rest1.model.Product;
import org.iesch.org.rest1.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductServices productServices;

    //CRUD
    @GetMapping("api/getAll")
    public ResponseEntity<?> getAlls(){
        return ResponseEntity.ok(productServices.obtenerProductos());
    }

    @GetMapping("api/getOne/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        return ResponseEntity.ok(productServices.obtenerOne(id).orElseThrow(() -> new ProductNotFoundException("Error: Prodcto no encontrado")));
    }

    @DeleteMapping("api/deleteOne/{id}")
    public ResponseEntity<?> deleteOne(@PathVariable Long id) {
        productServices.borrarUno(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("api/nuevoProducto")
    public ResponseEntity<?> newProduct(@RequestBody Product product) {
        Product product1 = productServices.addProduct(product);
        return ResponseEntity.ok(product1);
    }

    @PutMapping("api/actualizaProducto")
    public ResponseEntity<?> actualizaProducto(@RequestBody Product product) {
        Product product1 = productServices.actualizarProduct(product);
        return ResponseEntity.ok(product1);
    }

}
