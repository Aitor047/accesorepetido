package org.iesch.ad.Ejemplo1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Camion {

    @Id
    private String matricula;
    private String modelo;
    private String tipo;
    private int potencia;

    @ManyToMany(mappedBy = "camiones")
    private Set<Camionero> camioneros = new HashSet<>();

}
