package com.argprograma.etapa2.incidenttracker;

import com.argprograma.etapa2.incidenttracker.notificacion.CanalComunicacion;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Tecnico extends Persona {
    private List<Especialidad> especialidades = new ArrayList<>();
    private CanalComunicacion canalComunicacion;

    public void addProblema() {
        // TODO
    }
    public void addEspecialidad() {
        // TODO
    }
}
