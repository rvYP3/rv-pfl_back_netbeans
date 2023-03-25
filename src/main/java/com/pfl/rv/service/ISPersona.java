package com.pfl.rv.service;

import com.pfl.rv.model.Persona;
import java.util.List;

//interface: contiene los metodos necesarios para el ABML (declaracion)
public interface ISPersona {
    //metodo: traer personas
    public List<Persona> verPersonas(); 
    
    //metodo: rear persona
    public Persona buscarPersona(int id); 
    
    //metodo: alta persona
    public void crearPersona(Persona per);
    
    //metodo: editar persona
    public void editarPersona(Persona per);
    
    //metodo: borrar persona
    public void borrarPersona(int id);    

}
