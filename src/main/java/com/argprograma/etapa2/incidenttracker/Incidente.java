package com.argprograma.etapa2.incidenttracker;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Incidente {
    private int nroIncidente;
    private Incidente incidente;
    List<Problema> problemas = new ArrayList<>();
    List<Tecnico> tecnicos = new ArrayList<>();

    public void asignarTecnico() {

    }
}
