package com.argprograma.etapa2.incidenttracker.services;

import com.argprograma.etapa2.incidenttracker.DAO.TecnicoDAO;
import com.argprograma.etapa2.incidenttracker.clasificacion.tecnicos.EvaluadorPorEspecialidad;
import com.argprograma.etapa2.incidenttracker.clasificacion.tecnicos.EvaluadorPorIncidentes;
import com.argprograma.etapa2.incidenttracker.clasificacion.tecnicos.EvaluadorPorRapidez;
import com.argprograma.etapa2.incidenttracker.clasificacion.tecnicos.EvaluadorTecnicos;
import com.argprograma.etapa2.incidenttracker.modelo.Especialidad;
import com.argprograma.etapa2.incidenttracker.modelo.Tecnico;
import java.util.List;

/**
 *
 * @author mye
 */
public class TecnicoService {
    private TecnicoDAO dao = new TecnicoDAO();

    public void create(Tecnico entity) {
        dao.create(entity);
    }

    public Tecnico findOne(int id) {
        return dao.findOne(id);
    }

    public List<Tecnico> findAll() {
        return dao.findAll();
    }

    public Tecnico findFastest() {
        EvaluadorTecnicos eval = new EvaluadorPorRapidez();
        return eval.evaluarTecnicos(dao.findAll());
    }

    public Tecnico findMoreIncidentsInDays(Especialidad especialidad, int days) {
        EvaluadorTecnicos eval = new EvaluadorPorIncidentes();
        return eval.evaluarTecnicos(dao.findAll());
    }

    public Tecnico findMoreSpecialties() {
        EvaluadorTecnicos eval = new EvaluadorPorEspecialidad();
        return eval.evaluarTecnicos(dao.findAll());
    }

}
