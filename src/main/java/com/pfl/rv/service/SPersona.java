package com.pfl.rv.service;

import com.pfl.rv.model.Persona;
import com.pfl.rv.repository.IRPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//mapeo service (logica del negocio)
@Transactional//implementa metodos (en interface) para ABML
public class SPersona implements ISPersona {
    @Autowired
    private IRPersona rPers;//implementa interface repository (metodos necesarios para el ABML)
    //inyeccion de dependencias del repositorio
    
    @Override
    public List<Persona> verPersonas() {
        List<Persona> listaPersonas = rPers.findAll();
        return listaPersonas; 
        //return rPers.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        rPers.save(per);
    }
    
    @Override
    public void editarPersona(Persona per) {
        rPers.save(per);
    }

    @Override
    public void borrarPersona(int id) {
        rPers.deleteById(id);
    }

    @Override
    public Persona buscarPersona(int id) {
        Persona per = rPers.findById(id).orElse(null);//si no encuentra persona, devuelve "null"
        return per;
        //return rPers.findById(id).orElse(null);
    }
    
}
