package org.iesch.AD.busqueda.repositorios;

import org.iesch.AD.busqueda.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {



}
