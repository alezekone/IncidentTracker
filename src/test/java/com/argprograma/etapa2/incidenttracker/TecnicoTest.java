package com.argprograma.etapa2.incidenttracker;

import com.argprograma.etapa2.incidenttracker.modelo.Tecnico;
import com.argprograma.etapa2.incidenttracker.notificacion.Canal;
import com.argprograma.etapa2.incidenttracker.modelo.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TecnicoTest {
    @Test
    public void enviaEmailATecnico1() {

        Mensaje msj = new Mensaje();
        msj.setCuerpo("Mensaje personalizado");

        Tecnico tecnico1 = new Tecnico("33333", "Leo", Canal.EMAIL);
        tecnico1.setEmail("tecnico1@gmail.com");

        String esperado = """
                **Email
                **TO: tecnico1@gmail.com**
                Mensaje: Mensaje personalizado""";

        String enviado = tecnico1.getCanalComunicacion().enviarNotificacion(msj);

        Assertions.assertEquals(esperado, enviado);
    }
    @Test
    public void enviaWhatsappATecnico2() {

        Mensaje msj = new Mensaje();
        msj.setCuerpo("Mensaje personalizado");

        Tecnico tecnico2 = new Tecnico("444444", "Maria",Canal.WHATSAPP);
        tecnico2.setTelefono("+541143219423");

        String esperado = """
                **Whatsapp
                **TO: +541143219423**
                Mensaje: Mensaje personalizado""";

        String enviado = tecnico2.getCanalComunicacion().enviarNotificacion(msj);

        Assertions.assertEquals(esperado, enviado);
    }
}
