package com.argprograma.etapa2.incidenttracker.notificacion;

import com.argprograma.etapa2.incidenttracker.modelo.Incidente;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Mensaje {
    private String titulo;
    private String cuerpo;
    private Incidente incidente;
    boolean fueMandado;

}
