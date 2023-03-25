package com.pfl.rv.service;

import com.pfl.rv.model.Red;
import com.pfl.rv.repository.IRRed;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//mapeo service (logica del negocio)
@Transactional//implementa metodos (en interface) para ABML
public class SRed implements ISRed{
    @Autowired
    private IRRed rRede;//implementa interface repository (metodos necesarios para el ABML)
    //inyeccion de dependencias del repositorio
    @Override
    public List<Red> verRedes() {
                List<Red> listaRedes = rRede.findAll();
        return listaRedes;
        //return rRede.findAll();
    }

    @Override
    public void crearRed(Red red) {
        rRede.save(red);
    }

    @Override
    public void editarRed(Red red) {
        rRede.save(red);
    }

    @Override
    public void borrarRed(int id) {
        rRede.deleteById(id);
    }

    @Override
    public Red buscarRed(int id) {
        Red red = rRede.findById(id).orElse(null);//si no encuentra persona, devuelve "null"
        return red;
        //return rRede.findById(id).orElse(null);
    }
    
}
