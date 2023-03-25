package com.pfl.rv.service;

import com.pfl.rv.model.Contacto;
import com.pfl.rv.repository.IRContacto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//mapeo service (logica del negocio)
@Transactional//implementa metodos (en interface) para ABML
public class SContacto implements ISContacto{
    @Autowired
    private IRContacto rCont;//implementa interface repository (metodos necesarios para el ABML)
    //inyeccion de dependencias del repositorio
    @Override
    public List<Contacto> verContactos() {
                List<Contacto> listaContactos = rCont.findAll();
        return listaContactos; 
        //return rCont.findAll()
    }

    @Override
    public void crearContacto(Contacto con) {
        rCont.save(con);
    }

    @Override
    public void editarContacto(Contacto con) {
        rCont.save(con);
    }

    @Override
    public void borrarContacto(int id) {
        rCont.deleteById(id);
    }

    @Override
    public Contacto buscarContacto(int id) {
        Contacto con = rCont.findById(id).orElse(null);//si no encuentra persona, devuelve "null"
        return con;
        //return rCont.findById(id).orElse(null);
    }
    
}
