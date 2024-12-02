package org.iesch.ad.EjeJPA2.services;

import org.iesch.ad.EjeJPA2.model.Cliente;
import org.iesch.ad.EjeJPA2.model.Coche;
import org.iesch.ad.EjeJPA2.repository.CocheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocheService {

    @Autowired
    CocheRepository cocheRepository;

    public List<Coche> getCochesConDatos() {
        return cocheRepository.findAll();
    }

    

}
