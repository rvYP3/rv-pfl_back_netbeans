package com.pfl.rv.service;

import com.pfl.rv.model.HabilidadD;
import com.pfl.rv.repository.IRHabilidadD;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//mapeo service (logica del negocio)
@Transactional//implementa metodos (en interface) para ABML
public class SHabilidadD implements ISHabilidadD {
    @Autowired
    private IRHabilidadD rHabD;//implementa interface repository (metodos necesarios para el ABML)
    //inyeccion de dependencias del repositorio
    @Override
    public List<HabilidadD> verHabilidadesD() {
        List<HabilidadD> listaHabilidadesD = rHabD.findAll();
        return listaHabilidadesD;
        //return rHabD.findAll();
    }

    @Override
    public void crearHabilidadD(HabilidadD habD) {
        rHabD.save(habD);
    }

    @Override
    public void editarHabilidadD(HabilidadD habD) {
        rHabD.save(habD);
    }

    @Override
    public void borrarHabilidadD(int id) {
        rHabD.deleteById(id);
    }

    @Override
    public HabilidadD buscarHabilidadD(int id) {
        HabilidadD habD = rHabD.findById(id).orElse(null);//si no encuentra persona, devuelve "null"
        return habD;
        //return rHabD.findById(id).orElse(null);
    }
    
}
