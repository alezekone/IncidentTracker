package com.argprograma.etapa2.incidenttracker;

import com.argprograma.etapa2.incidenttracker.notificacion.Canal;
import com.argprograma.etapa2.incidenttracker.notificacion.CanalComunicacion;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Tecnico extends Persona {
    private List<Especialidad> especialidades;
    private CanalComunicacion canalComunicacion;

    public Tecnico(Canal canal) {
        this.especialidades = new ArrayList<>();

        this.canalComunicacion = canal.crear(this);
    }
    public void addProblema() {
        // TODO
    }
    public void addEspecialidad() {
        // TODO
    }
}
