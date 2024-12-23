package org.iesch.ad.exampleBBDD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Persona {

    @Id
    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    @OneToOne
    Perfil perfil;

}
