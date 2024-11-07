package org.iesch.org.rest1.excepciones;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String mssg){
        super(mssg);
    }

}
