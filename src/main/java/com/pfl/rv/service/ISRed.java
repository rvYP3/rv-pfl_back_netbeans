package com.pfl.rv.service;

import com.pfl.rv.model.Red;
import java.util.List;


//interface: contiene los metodos necesarios para el ABML (declaracion)
public interface ISRed {
    //metodo: traer habilidades
    public List<Red> verRedes();
    
    //metodo: alta habilidad
    public void crearRed(Red red);
    
    //metodo: editar
    public void editarRed(Red red);
    
    //metodo: borrar
    public void borrarRed(int id);
    
    //metodo: encontrar
    public Red buscarRed(int id);     
}
