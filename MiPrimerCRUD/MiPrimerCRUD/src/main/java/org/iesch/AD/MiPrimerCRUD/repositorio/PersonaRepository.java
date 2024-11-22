package org.iesch.AD.MiPrimerCRUD.repositorio;

import org.iesch.AD.MiPrimerCRUD.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

    public List<Persona> findByCiudad(String ciudad);

//    public List<Persona> findByCiudadOrDirecccion(String ciudad, String direcccion);
//
//    @Query("select * from Persona where ciudad =?1 and email =?2")
//    public List<Persona> buscarPorCiudadEmail(String ciudad, String email);
}
