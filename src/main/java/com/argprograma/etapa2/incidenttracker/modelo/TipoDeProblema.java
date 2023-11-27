package com.argprograma.etapa2.incidenttracker.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TipoDeProblema {
    private int idTipoDeProblema;
    private int maxHorasResolucion;

    public void setMaxHoras(int horas) {
        // TODO
    }
}
