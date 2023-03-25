package com.pfl.rv.service;

import com.pfl.rv.model.Proyecto;
import java.util.List;

//interface: contiene los metodos necesarios para el ABML (declaracion)
public interface ISProyecto {
    //metodo: traer proyectos
    public List<Proyecto> verProyectos();
    
    //metodo: alta proyecto
    public void crearProyecto(Proyecto pro);
    
    //metodo: editar
    public void editarProyecto(Proyecto pro);
    
    //metodo: borrar
    public void borrarProyecto(int id);
    
    //metodo: encontrar
    public Proyecto buscarProyecto(int id);     
}
