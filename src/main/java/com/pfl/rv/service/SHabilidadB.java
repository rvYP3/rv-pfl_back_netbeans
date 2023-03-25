package com.pfl.rv.service;

import com.pfl.rv.model.HabilidadB;
import com.pfl.rv.repository.IRHabilidadB;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//mapeo service (logica del negocio)
@Transactional//implementa metodos (en interface) para ABML
public class SHabilidadB implements ISHabilidadB {
    @Autowired
    private IRHabilidadB rHabB;//implementa interface repository (metodos necesarios para el ABML)
    //inyeccion de dependencias del repositorio    
    @Override
    public List<HabilidadB> verHabilidadesB() {
                List<HabilidadB> listaHabilidadesB = rHabB.findAll();
        return listaHabilidadesB;
        //return rHabD.findAll();
    }

    @Override
    public void crearHabilidadB(HabilidadB habB) {
        rHabB.save(habB);
    }

    @Override
    public void editarHabilidadB(HabilidadB habB) {
        rHabB.save(habB);
    }

    @Override
    public void borrarHabilidadB(int id) {
        rHabB.deleteById(id);
    }

    @Override
    public HabilidadB buscarHabilidadB(int id) {
        HabilidadB habB = rHabB.findById(id).orElse(null);//si no encuentra persona, devuelve "null"
        return habB;
        //return rHabB.findById(id).orElse(null);
    }    

   }
