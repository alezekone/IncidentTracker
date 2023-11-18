package com.argprograma.etapa2.incidenttracker;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String cuit;
    private String razonSocial;
    private String direccion;
    private String email;
    private String telefono;
    List<Servicio> servicios = new ArrayList<>();
    List<Incidente> Incidentes = new ArrayList<>();
    public boolean addIncidente() {
        return true;
    }
}
