package com.argprograma.etapa2.incidenttracker.modelo;

import com.argprograma.etapa2.incidenttracker.modelo.Tecnico;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Transient;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Incidente {

    private int nroIncidente;

    private Servicio servicio;

    private List<Problema> problemas;

    private LocalDateTime horaInicio;

    private LocalDateTime horaFin;

    private List<Tecnico> tecnicos;

    public Incidente() {
        this.problemas = new ArrayList<>();
        this.tecnicos = new ArrayList<>();
    }

    public void asignarTecnico() {
        // TODO
    }
}
