package com.pfl.rv.service;

import com.pfl.rv.model.Educacion;
import com.pfl.rv.repository.IREducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//mapeo service (logica del negocio)
@Transactional//implementa metodos (en interface) para ABML
public class SEducacion implements ISEducacion {
    @Autowired
    private IREducacion rEduc;//implementa interface repository (metodos necesarios para el ABML)
    //inyeccion de dependencias del repositorio
    @Override
    public List<Educacion> verEducaciones() {
        List<Educacion> listaEducaciones = rEduc.findAll();
        return listaEducaciones;
        //return rEduc.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
        rEduc.save(edu);
    }

    @Override
    public void editarEducacion(Educacion edu) {
        rEduc.save(edu);
    }

    @Override
    public void borrarEducacion(int id) {
        rEduc.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(int id) {
        Educacion edu = rEduc.findById(id).orElse(null);//si no encuentra persona, devuelve "null"
        return edu;
        //return rEduc.findById(id).orElse(null);
    }
    
}
