package com.argprograma.etapa2.incidenttracker;

import com.argprograma.etapa2.incidenttracker.modelo.Persona;
import com.argprograma.etapa2.incidenttracker.notificacion.Canal;
import com.argprograma.etapa2.incidenttracker.notificacion.CanalComunicacion;
import com.argprograma.etapa2.incidenttracker.modelo.Mensaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanalWhatsappTest {
    @Test
    public void EnviarWhatsappAReceptor() {
        Persona receptor = new Persona();
        receptor.setTelefono("+541109876543");

        Mensaje msj = new Mensaje();
        msj.setCuerpo("Mensaje personalizado");

        CanalComunicacion canal = Canal.WHATSAPP.crear(receptor);

        String esperado = """
                **Whatsapp
                **TO: +541109876543**
                Mensaje: Mensaje personalizado""";

        assert canal != null;
        String enviado = canal.enviarNotificacion(msj);

        Assertions.assertEquals(esperado, enviado);
    }
}
