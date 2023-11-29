package com.argprograma.etapa2.incidenttracker.modelo;

import com.argprograma.etapa2.incidenttracker.modelo.Tecnico;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="incidente")
@Getter @Setter
public class Incidente {
    @Id
    @Column(name="idIncidente")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int nroIncidente;
    @OneToOne
    private Servicio servicio;
    @OneToMany
    @JoinColumn(name = "idIncidente")
    private List<Problema> problemas;
    @Column(name="horaInicio")
    private LocalDateTime horaInicio;
    @Column(name="horaFin")
    private LocalDateTime horaFin;
    @OneToMany
    @JoinColumn(name = "idIncidente")
    private List<Tecnico> tecnicos;

    public Incidente() {
        this.problemas = new ArrayList<>();
        this.tecnicos = new ArrayList<>();
    }

    public void asignarTecnico() {
        // TODO
    }
}
