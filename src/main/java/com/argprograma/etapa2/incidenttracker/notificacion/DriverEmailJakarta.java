package com.argprograma.etapa2.incidenttracker.notificacion;

import com.sun.xml.fastinfoset.sax.Properties;
import jakarta.mail.Session;

public class DriverEmailJakarta implements DriverEmail {
    private Properties propiedades;
    private Session sesion;

    @Override
    public void notificar(Mensaje mensaje) {
        // TODO
    }
}
