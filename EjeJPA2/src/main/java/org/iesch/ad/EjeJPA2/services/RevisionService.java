package org.iesch.ad.EjeJPA2.services;

import org.iesch.ad.EjeJPA2.model.Revision;
import org.iesch.ad.EjeJPA2.repository.RevisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RevisionService {

    @Autowired
    RevisionRepository revisionRepository;

    public List<Revision> getRevisionesConDatos() {
        return revisionRepository.findAll();
    }

}
