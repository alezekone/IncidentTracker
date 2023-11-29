package com.argprograma.etapa2.incidenttracker.modelo;

import com.argprograma.etapa2.incidenttracker.modelo.Estado;
import com.argprograma.etapa2.incidenttracker.modelo.Complejidad;
import com.argprograma.etapa2.incidenttracker.modelo.Tecnico;
import com.argprograma.etapa2.incidenttracker.notificacion.Canal;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name="Problema")
@Getter @Setter
public class Problema {
    @Id
    @Column(name="idProblema")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProblema;
    @Column(name="tiempoEstimadoResolucion")
    private int tiempoEstimadoResolucion;
    @Column(name="horaInicio")
    private LocalDateTime horaInicio;
    @Column(name="horaFin")
    private LocalDateTime horaFin;
    @Column(name="descripcion")
    private String descripcion;
    @Enumerated(value = EnumType.STRING)
    private Complejidad complejidad;
    @Enumerated(value = EnumType.STRING)
    private Estado estado;
    @OneToOne
    private Tecnico tecnico;
    @OneToOne
    private TipoDeProblema tipoDeProblema;
    @OneToOne
    private Servicio servicio;

    public void agregarHorasPorComplejidad(Complejidad complejidad) {
        // TODO
    }
    public void agregarHorasAdicionales(int horas) {
        // TODO
    }
}
