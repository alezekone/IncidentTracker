package com.argprograma.etapa2.incidenttracker.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Servicio {
    @Id
    @Column(name="idServicio")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idServicio;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @OneToMany
    @JoinColumn(name = "idServicio")
    private List<TipoDeProblema> tiposDeProblema;

    public Servicio() {
        this.tiposDeProblema = new ArrayList<>();
    }
}
