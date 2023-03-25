package com.pfl.rv.controller;

import com.pfl.rv.model.Contacto;
import com.pfl.rv.service.ISContacto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController//mapeo controller 
@RequestMapping("contacto")//http:/localhost:8080/contacto
@CrossOrigin(origins="http://localhost:4200")
//configuracion para recepcion de solicitudes y envio de respuestas
public class CContacto {
   @Autowired
   private ISContacto sCont;//implementa interface service
   //inyeccion de dependencias del servicio
    
   @GetMapping("/listar")
   @ResponseBody
   public List<Contacto> verContactos(){
        return sCont.verContactos();
   }
    
   @PostMapping("/crear")
   public String crearContacto(@RequestBody Contacto con){
       sCont.crearContacto(con);
       return "Contacto creado correctamente";//msj aviso creacion
   }
   
   @DeleteMapping("/eliminar/{id}")
   public String borrarContacto(@PathVariable int id){
       sCont.borrarContacto(id);
       return "Contacto eliminado correctamente";//msj aviso borrado
   }
   
   @PutMapping("/editar/{id}")
   public Contacto editarContacto(@PathVariable int id,
           @RequestParam("ciudad") String newCiudad,
           @RequestParam("provincia") String newProvincia,
           @RequestParam("telefono") String newTelefono,
           @RequestParam("correo") String newCorreo) {
       Contacto con = sCont.buscarContacto(id);//busca contacto
       con.setCiudad(newCiudad);//podria ir en service para desacoplar codigo
       con.setProvincia(newProvincia);
       con.setTelefono(newTelefono);
       con.setCorreo(newCorreo);
       sCont.crearContacto(con);
       return con;//retorna nuevo contacto
   } 
   
   @PutMapping("/editar")
   public void editarContacto(@RequestBody Contacto con){
       sCont.editarContacto(con);
   }    
}
