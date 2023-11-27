package com.argprograma.etapa2.incidenttracker.notificacion;

import com.argprograma.etapa2.incidenttracker.modelo.Persona;

public enum Canal {
    WHATSAPP,
    EMAIL;

    public CanalComunicacion crear(Persona receptor) {
        if(this == WHATSAPP)
            return new CanalWhatsapp(receptor);
        if(this == EMAIL)
            return new CanalEmail(receptor);
        return null;
    }
}
