package com.pfl.rv.controller;


import com.pfl.rv.model.HabilidadB;
import com.pfl.rv.service.ISHabilidadB;
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
@RequestMapping("habilidadB")//http:/localhost:8080/habilidadB
@CrossOrigin(origins="http://localhost:4200")
//configuracion para recepcion de solicitudes y envio de respuestas
public class CHabilidadB {
   @Autowired
   private ISHabilidadB sHabB;//implementa interface service
   //inyeccion de dependencias del servicio
   @GetMapping("/listar")
   @ResponseBody
   public List<HabilidadB> verHabilidadesB(){
        return sHabB.verHabilidadesB();
   }
   
   @PostMapping("/crear")
   public String crearHabilidadB(@RequestBody HabilidadB habB){
       sHabB.crearHabilidadB(habB);
       return "Habilidad Blanda creada correctamente";//msj aviso creacion
   }
   
   @DeleteMapping("/eliminar/{id}")
   public String borrarHabilidadB(@PathVariable int id){
       sHabB.borrarHabilidadB(id);
       return "Habilidad Blanda eliminada correctamente";//msj aviso borrado
   }
   
   @PutMapping("/editar/{id}")
   public HabilidadB editarHabilidadB(@PathVariable int id,
           @RequestParam("nombre") String newNombre,
           @RequestParam("porcentaje") String newPorcentaje){
       HabilidadB habB = sHabB.buscarHabilidadB(id);//busca habilidad blanda
       habB.setNombre(newNombre);//podria ir en service para desacoplar codigo
       habB.setPorcentaje(newPorcentaje);
       sHabB.crearHabilidadB(habB);
       return habB;//retorna nueva habilidad blanda
   } 
   
   @PutMapping("/editar")
   public void editarHabilidadB(@RequestBody HabilidadB habB){
       sHabB.editarHabilidadB(habB);
   }
}
