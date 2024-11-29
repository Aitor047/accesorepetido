package org.iesch.ad.Ejemplo1.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Paquete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String descripcion;
    private String destinatario;
    private String direccionDestinatario;

    @ManyToOne
    @JoinColumn(name = "camionero_dni")
    private Camionero camionero;

    @ManyToOne
    @JoinColumn(name = "provincia_id")
    private Provincia provincia;

}
