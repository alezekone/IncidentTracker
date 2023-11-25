package com.argprograma.etapa2.incidenttracker.notificacion;

public class DriverWhatsappTerminal implements DriverWhatsapp {
    @Override
    public void notificar(Mensaje mensaje) {
        System.out.println("**Whatsapp**");
        System.out.println("Mensaje: " + mensaje.getCuerpo());
    }
}
