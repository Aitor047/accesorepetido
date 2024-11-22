package org.iesch.ad.exampleBBDD.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;


}
