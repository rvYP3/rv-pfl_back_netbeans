package com.pfl.rv.service;

//interface: contiene los metodos necesarios para el ABML (declaracion)

import com.pfl.rv.model.HabilidadB;
import java.util.List;

public interface ISHabilidadB {
    //metodo: traer habilidades
    public List<HabilidadB> verHabilidadesB();
    
    //metodo: alta habilidad
    public void crearHabilidadB(HabilidadB habB);
    
    //metodo: editar
    public void editarHabilidadB(HabilidadB habB);
    
    //metodo: borrar
    public void borrarHabilidadB(int id);
    
    //metodo: encontrar
    public HabilidadB buscarHabilidadB(int id);    

}
