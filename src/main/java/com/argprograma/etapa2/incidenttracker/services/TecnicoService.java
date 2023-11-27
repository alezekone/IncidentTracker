package com.argprograma.etapa2.incidenttracker.services;

import com.argprograma.etapa2.incidenttracker.DAO.TecnicoDAO;
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

}
