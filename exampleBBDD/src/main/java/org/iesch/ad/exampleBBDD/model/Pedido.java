package org.iesch.ad.exampleBBDD.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Pedido {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    String contenido;
    @ManyToOne
    Cliente cliente;
}
