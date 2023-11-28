package com.argprograma.etapa2.incidenttracker.modelo;

import com.argprograma.etapa2.incidenttracker.notificacion.Canal;
import com.argprograma.etapa2.incidenttracker.notificacion.CanalComunicacion;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter @Setter @NoArgsConstructor
public class Cliente extends Persona implements Serializable {

    @Column(name="razonSocial")
    private String razonSocial;
    @Transient
    private List<Servicio> servicios;
    @Transient
    private List<Incidente> incidentes;
    //@OneToMany
    //@JoinColumn(name = "CUIT_CUIL")
    //@Transient
    //private List<Mensaje> mensajes;

    public Cliente(Canal canal) {
        this.servicios = new ArrayList<>();
        this.incidentes = new ArrayList<>();
        this.setMensajes(new ArrayList<>());

        setCanalComunicacion(canal.crear(this));
    }

    public boolean addIncidente() {
        // TODO
        return true;
    }
    public boolean addServicio() {
        // TODO
        return true;
    }
}
