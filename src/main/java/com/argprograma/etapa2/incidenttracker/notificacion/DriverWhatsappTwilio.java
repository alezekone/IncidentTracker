package com.argprograma.etapa2.incidenttracker.notificacion;

import com.argprograma.etapa2.incidenttracker.modelo.Persona;

public class DriverWhatsappTwilio implements DriverWhatsapp {
    private String ACCOUNT_SID;
    private String AUTH_TOKEN;

    @Override
    public String notificar(Mensaje mensaje, Persona receptor) {
        // TODO
        return "";
    }
}
