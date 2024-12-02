package org.iesch.ad.EjeJPA2.controler;

import org.iesch.ad.EjeJPA2.services.RevisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RevisionControler {

    @Autowired
    RevisionService revisionService;

    @GetMapping("/revisiones")
    public ResponseEntity<?> getRevisiones() {
        return ResponseEntity.ok(revisionService.getRevisionesConDatos());
    }

}
