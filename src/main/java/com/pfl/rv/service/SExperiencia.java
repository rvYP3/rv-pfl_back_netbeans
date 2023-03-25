package com.pfl.rv.service;

import com.pfl.rv.model.Experiencia;
import com.pfl.rv.repository.IRExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//mapeo service (logica del negocio)
@Transactional//implementa metodos (en interface) para ABML
public class SExperiencia implements ISExperiencia{
    @Autowired
    private IRExperiencia rExpe;//implementa interface repository (metodos necesarios para el ABML)
    //inyeccion de dependencias del repositorio
    @Override
    public List<Experiencia> verExperiencias() {
        List<Experiencia> listaExperiencias = rExpe.findAll();
        return listaExperiencias;
        //return rExpe.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        rExpe.save(exp);        
    }

    @Override
    public void editarExperiencia(Experiencia exp) {
        rExpe.save(exp);
    }

    @Override
    public void borrarExperiencia(int id) {
        rExpe.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(int id) {
        Experiencia exp = rExpe.findById(id).orElse(null);//si no encuentra experiencia, devuelve "null"
        return exp;
        //return rExpe.findById(id).orElse(null);
    }  
    
}
