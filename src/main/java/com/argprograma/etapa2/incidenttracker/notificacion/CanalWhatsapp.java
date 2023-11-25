package com.argprograma.etapa2.incidenttracker.notificacion;

public class CanalWhatsapp implements CanalComunicacion {
    DriverWhatsapp driver = new DriverWhatsappTerminal();
    //DriverWhatsapp driver = new DriverWhatsappTwilio();

    @Override
    public void enviarNotificacion(Mensaje mensaje) {
        driver.notificar(mensaje);
    }
}
