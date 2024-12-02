package org.iesch.ad.EjeJPA2.repository;

import org.iesch.ad.EjeJPA2.model.Cliente;
import org.iesch.ad.EjeJPA2.model.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepository extends JpaRepository<Coche, String> {
}
