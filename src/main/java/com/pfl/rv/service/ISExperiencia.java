package com.pfl.rv.service;

import com.pfl.rv.model.Experiencia;
import java.util.List;


//interface: contiene los metodos necesarios para el ABML (declaracion)
public interface ISExperiencia {
    //metodo: traer experiencias
    public List<Experiencia> verExperiencias();
    
    //metodo: alta experiencia
    public void crearExperiencia(Experiencia exp);
    
    //metodo: editar
    public void editarExperiencia(Experiencia exp);
    
    //metodo: borrar
    public void borrarExperiencia(int id);
    
    //metodo: encontrar
    public Experiencia buscarExperiencia(int id);  
}
