package com.argprograma.etapa2.incidenttracker.modelo;

import com.argprograma.etapa2.incidenttracker.modelo.Persona;
import com.argprograma.etapa2.incidenttracker.notificacion.Canal;
import com.argprograma.etapa2.incidenttracker.notificacion.CanalComunicacion;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
// Quizás conviente "import javax.persistentce.*;"  // Lo sugieren las diapos.
import javax.persistence.*;

@Entity
@Table(name="Tecnico")
@Getter @Setter
public class Tecnico extends Persona implements Serializable {

    @OneToMany
    @JoinColumn(name = "CUIT_CUIL")
    private List<Especialidad> especialidades;
    @Column(name="especialidad")
    private String especialidad;   // Solo para practicar persistencia. Luego, borrar.
    //@OneToMany
    //@JoinColumn(name = "CUIT_CUIL")
    //rivate List<Mensaje> mensajes;

    public Tecnico(String cuitcuil, String nombre, Canal canal){
        //super(cuitcuil, nombre, canal);
        this.setCuit_cuil(cuitcuil);
        this.setNombre(nombre);
        this.setCanal(canal);
        this.setMensajes(new ArrayList<>());
        this.especialidad = "Generica";
        setCanalComunicacion(canal.crear(this));
    }

    public void addProblema() {
        // TODO
    }
    public void addEspecialidad() {
        // TODO
    }
}
