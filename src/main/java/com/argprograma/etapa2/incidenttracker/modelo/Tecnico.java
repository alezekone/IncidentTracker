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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Tecnico")
@Getter @Setter
public class Tecnico extends Persona implements Serializable {
    @Transient
    private List<Especialidad> especialidades;
    @Transient
    private CanalComunicacion canalComunicacion;
    @Column(name="especialidad")
    private String especialidad;   // Solo para practicar persistencia. Luego, borrar.
    
    public Tecnico(String cuitcuil, String nombre){
        super(cuitcuil, nombre);
        this.especialidad = "Generica";
    }
    
    public Tecnico(Canal canal) {
        this.especialidades = new ArrayList<>();

        this.canalComunicacion = canal.crear(this);
    }
    public void addProblema() {
        // TODO
    }
    public void addEspecialidad() {
        // TODO
    }
}
