package org.iesch.ad.EjeJPA2.repository;

import org.iesch.ad.EjeJPA2.model.Revision;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RevisionRepository extends JpaRepository<Revision, Long> {
}
