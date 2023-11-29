package com.argprograma.etapa2.incidenttracker.modelo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="TipoDeProblema")
@Getter @Setter
public class TipoDeProblema {
    @Id
    @Column(name="idTipoDeProblema")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idTipoDeProblema;
    @Column(name="descripcion")
    private String descripcion;
    @Column(name="maxHorasResolucion")
    private int maxHorasResolucion;

    @OneToOne
    @JoinColumn(name="idProblema", referencedColumnName="idProblema")
    private Problema problema;

    public void setMaxHoras(int horas) {
        // TODO
    }
}
