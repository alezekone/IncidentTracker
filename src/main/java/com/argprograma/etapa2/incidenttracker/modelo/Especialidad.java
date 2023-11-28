package com.argprograma.etapa2.incidenttracker.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Especialidad")
@Getter @Setter
public class Especialidad {
    @Id
    @Column(name="idEspecialidad")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEspecialidad;
    @Column(name="nombre")
    private String nombre;
    @Column(name="descripcion")
    private String descripcion;
    @OneToMany
    @JoinColumn(name = "idEspecialidad")
    private List<TipoDeProblema> tiposDeProblema;

    public Especialidad() {
        this.tiposDeProblema = new ArrayList<>();
    }
}
