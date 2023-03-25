package com.pfl.rv.controller;

import com.pfl.rv.model.HabilidadD;
import com.pfl.rv.service.ISHabilidadD;
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
@RequestMapping("habilidadD")//http:/localhost:8080/habilidadD
@CrossOrigin(origins="http://localhost:4200")
//configuracion para recepcion de solicitudes y envio de respuestas
public class CHabilidadD {
   @Autowired
   private ISHabilidadD sHabD;//implementa interface service
   //inyeccion de dependencias del servicio
   @GetMapping("/listar")
   @ResponseBody
   public List<HabilidadD> verHabilidadesD(){
        return sHabD.verHabilidadesD();
   }
   
   @PostMapping("/crear")
   public String crearHabilidadD(@RequestBody HabilidadD habD){
       sHabD.crearHabilidadD(habD);
       return "Habilidad Dura creada correctamente";//msj aviso creacion
   }
   
   @DeleteMapping("/eliminar/{id}")
   public String borrarHabilidadD(@PathVariable int id){
       sHabD.borrarHabilidadD(id);
       return "Habilidad Dura eliminada correctamente";//msj aviso borrado
   }
   
   @PutMapping("/editar/{id}")
   public HabilidadD editarHabilidadD(@PathVariable int id,
           @RequestParam("nombre") String newNombre,
           @RequestParam("porcentaje") String newPorcentaje){
       HabilidadD habD = sHabD.buscarHabilidadD(id);//busca habilidad dura
       habD.setNombre(newNombre);//podria ir en service para desacoplar codigo
       habD.setPorcentaje(newPorcentaje);
       sHabD.crearHabilidadD(habD);
       return habD;//retorna nueva habilidad dura
   } 
   
   @PutMapping("/editar")
   public void editarHabilidadD(@RequestBody HabilidadD habD){
       sHabD.editarHabilidadD(habD);
   }
}
