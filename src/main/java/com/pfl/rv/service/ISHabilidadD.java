package com.pfl.rv.service;

import com.pfl.rv.model.HabilidadD;
import java.util.List;


//interface: contiene los metodos necesarios para el ABML (declaracion)
public interface ISHabilidadD {
    //metodo: traer habilidades
    public List<HabilidadD> verHabilidadesD();
    
    //metodo: alta habilidad
    public void crearHabilidadD(HabilidadD habD);
    
    //metodo: editar
    public void editarHabilidadD(HabilidadD habD);
    
    //metodo: borrar
    public void borrarHabilidadD(int id);
    
    //metodo: encontrar
    public HabilidadD buscarHabilidadD(int id);     
}
