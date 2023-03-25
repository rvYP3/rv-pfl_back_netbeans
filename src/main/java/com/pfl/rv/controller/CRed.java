package com.pfl.rv.controller;

import com.pfl.rv.model.Red;
import com.pfl.rv.service.ISRed;
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
@RequestMapping("red")//http:/localhost:8080/red
@CrossOrigin(origins="http://localhost:4200")
//configuracion para recepcion de solicitudes y envio de respuestas
public class CRed {
@Autowired
   private ISRed sRede;//implementa interface service
   //inyeccion de dependencias del servicio
   @GetMapping("/listar")
   @ResponseBody
   public List<Red> verRedes(){
        return sRede.verRedes();
   }
   
   @PostMapping("/crear")
   public String crearRed(@RequestBody Red red){
       sRede.crearRed(red);
       return "Red creada correctamente";//msj aviso creacion
   }
   
   @DeleteMapping("/eliminar/{id}")
   public String borrarRed(@PathVariable int id){
       sRede.borrarRed(id);
       return "Red eliminada correctamente";//msj aviso borrado
   }
   
   @PutMapping("/editar/{id}")
   public Red editarRed(@PathVariable int id,
           @RequestParam("icono") String newIcono,
           @RequestParam("url") String newUrl){
       Red red = sRede.buscarRed(id);//busca red
       red.setIcono(newIcono);//podria ir en service para desacoplar codigo
       red.setUrl(newUrl);
       sRede.crearRed(red);
       return red;//retorna nueva red
   } 
   
   @PutMapping("/editar")
   public void editarRed(@RequestBody Red red){
       sRede.editarRed(red);
   }    
}
