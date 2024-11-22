package org.iesch.AD.busqueda.servicios;

import org.iesch.AD.busqueda.repositorios.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    public Object devuelveTodos() {

        return autorRepository.findAll();

    }
}
