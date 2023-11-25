package com.argprograma.etapa2.incidenttracker.notificacion;

import com.argprograma.etapa2.incidenttracker.Persona;
import com.sun.xml.fastinfoset.sax.Properties;
import jakarta.mail.Session;

public class DriverEmailJakarta implements DriverEmail {
    private Properties propiedades;
    private Session sesion;

    @Override
    public String notificar(Mensaje mensaje, Persona receptor) {
        // TODO
        return "";
    }
}
