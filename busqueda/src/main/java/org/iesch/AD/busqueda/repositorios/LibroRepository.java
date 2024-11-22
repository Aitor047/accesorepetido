package org.iesch.AD.busqueda.repositorios;

import org.iesch.AD.busqueda.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {



}
