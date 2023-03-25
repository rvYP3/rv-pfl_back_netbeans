package com.pfl.rv.controller;

import com.pfl.rv.model.Experiencia;
import com.pfl.rv.service.ISExperiencia;
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
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController//mapeo controller 
@RequestMapping("experiencia")//http:/localhost:8080/experiencia
@CrossOrigin(origins="http://localhost:4200")
//configuracion para recepcion de solicitudes y envio de respuestas
public class CExperiencia {
   @Autowired
   private ISExperiencia sExpe;//implementa interface service
   //inyeccion de dependencias del servicio
    
   @GetMapping("/listar")
   @ResponseBody
   public List<Experiencia> verExperiencias(){
        return sExpe.verExperiencias();
   }
   
   @GetMapping("/buscar/{id}")
   @ResponseBody
   public Experiencia buscarExperiencia(@PathVariable int id){
       return sExpe.buscarExperiencia(id);
   }
    
   @PostMapping("/crear")
   public String crearExperiencia(@RequestBody Experiencia exp){
       sExpe.crearExperiencia(exp);
       return "Experiencia creada correctamente";//msj aviso creacion
   }   
  
   @DeleteMapping("/eliminar/{id}")
   public String borrarExperiencia(@PathVariable ("id") int id){
       sExpe.borrarExperiencia(id);
       return "Experiencia eliminada correctamente";//msj aviso borrado
   }
   
   @PutMapping("/editar")
   public void editarExperiencia(@RequestBody Experiencia exp){
       sExpe.editarExperiencia(exp);
   }
   
//   @PutMapping("/editar/{id}")
//   public Experiencia editarExperiencia(@PathVariable int id,
//           @RequestParam("img") String newImg,
//           @RequestParam("titulo") String newTitulo,
//           @RequestParam("inicio") String newInicio,
//           @RequestParam("fin") String newFin,
//           @RequestParam("puesto") String newPuesto,
//           @RequestParam("tarea") String newTarea) {
//       Experiencia exp = sExpe.buscarExperiencia(id);//busca experiencia
//       exp.setImg(newImg);//podria ir en service para desacoplar codigo
//       exp.setTitulo(newTitulo);
//       exp.setInicio(newInicio);
//       exp.setFin(newFin);
//       exp.setPuesto(newPuesto);
//       exp.setTarea(newTarea);
//       sExpe.crearExperiencia(exp);
//       return exp;//retorna nueva experiencia
//   } 
    
}
