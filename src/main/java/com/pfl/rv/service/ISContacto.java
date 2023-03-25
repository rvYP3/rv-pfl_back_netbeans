package com.pfl.rv.service;

//interface: contiene los metodos necesarios para el ABML (declaracion)

import com.pfl.rv.model.Contacto;
import java.util.List;

public interface ISContacto {
    //metodo: traer contactos
    public List<Contacto> verContactos();
    
    //metodo: alta contacto
    public void crearContacto(Contacto con);
    
    //metodo: editar
    public void editarContacto(Contacto con);
    
    //metodo: borrar
    public void borrarContacto(int id);
    
    //metodo: encontrar
    public Contacto buscarContacto(int id);    
}
