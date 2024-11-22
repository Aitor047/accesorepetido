package org.iesch.ad.exampleBBDD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name="perfil_usuario")
@Data
public class Perfil {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) //AutoIncremental
    Long id;
    String detalles;


}
