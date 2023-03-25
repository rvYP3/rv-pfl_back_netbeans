package com.pfl.rv.service;

import com.pfl.rv.model.Proyecto;
import com.pfl.rv.repository.IRProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//mapeo service (logica del negocio)
@Transactional//implementa metodos (en interface) para ABML
public class SProyecto implements ISProyecto{
    @Autowired
    private IRProyecto rProy;//implementa interface repository (metodos necesarios para el ABML)
    //inyeccion de dependencias del repositorio
    @Override
    public List<Proyecto> verProyectos() {
                List<Proyecto> listaProyectos = rProy.findAll();
        return listaProyectos;
        //return rProy.findAll();
    }

    @Override
    public void crearProyecto(Proyecto pro) {
            rProy.save(pro);
    }

    @Override
    public void editarProyecto(Proyecto pro) {
            rProy.save(pro);
    }

    @Override
    public void borrarProyecto(int id) {
        rProy.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(int id) {
        Proyecto pro = rProy.findById(id).orElse(null);//si no encuentra persona, devuelve "null"
        return pro;
        //return rProy.findById(id).orElse(null);
    }
    
}
