package com.pfl.rv.service;

import com.pfl.rv.model.Educacion;
import java.util.List;

//interface: contiene los metodos necesarios para el ABML (declaracion)
public interface ISEducacion {
    //metodo: traer educaciones
    public List<Educacion> verEducaciones();
    
    //metodo: alta educacion
    public void crearEducacion(Educacion edu);
    
    //metodo: editar
    public void editarEducacion(Educacion edu);
    
    //metodo: borrar
    public void borrarEducacion(int id);
    
    //metodo: encontrar
    public Educacion buscarEducacion(int id); 
}
