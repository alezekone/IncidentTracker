package com.argprograma.etapa2.incidenttracker;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Cliente extends Persona {
    private String razonSocial;
    private List<Servicio> servicios = new ArrayList<>();
    private List<Incidente> incidentes = new ArrayList<>();

    public boolean addIncidente() {
        return true;
    }
}
