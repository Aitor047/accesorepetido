package org.iesch.ad.EjeJPA2.controler;

import org.iesch.ad.EjeJPA2.services.ClienteService;
import org.iesch.ad.EjeJPA2.services.CocheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CocheControler {

    @Autowired
    CocheService cocheService;

    @GetMapping("/coches")
    public ResponseEntity<?> getCoches() {
        return ResponseEntity.ok(cocheService.getCochesConDatos());
    }



}
