package com.pfl.rv.controller;

import com.pfl.rv.model.Educacion;
import com.pfl.rv.service.ISEducacion;
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
@RequestMapping("educacion")//http:/localhost:8080/educacion
@CrossOrigin(origins="http://localhost:4200")
//configuracion para recepcion de solicitudes y envio de respuestas
public class CEducacion {
   @Autowired
   private ISEducacion sEduc;//implementa interface service
   //inyeccion de dependencias del servicio
   
   @GetMapping("/listar")
   @ResponseBody
   public List<Educacion> verEducaciones(){
        return sEduc.verEducaciones();
   }
    
   @PostMapping("/crear")
   public String crearEducacion(@RequestBody Educacion edu){
       sEduc.crearEducacion(edu);
       return "Educacion creada correctamente";//msj aviso creacion
   }
   
   @DeleteMapping("/eliminar/{id}")
   public String borrarEducacion(@PathVariable int id){
       sEduc.borrarEducacion(id);
       return "Educacion eliminada correctamente";//msj aviso borrado
   }
   
//   @PutMapping("/editar/{id}")
//   public Educacion editEducacion(@PathVariable int id,
//           @RequestParam("img") String newImg,
//           @RequestParam("titulo") String newTitulo,
//           @RequestParam("inicio") String newInicio,
//           @RequestParam("fin") String newFin,
//           @RequestParam("tipo") String newTipo,
//           @RequestParam("detalle") String newDetalle,
//           @RequestParam("descripcion") String newDescripcion){
//       Educacion edu = sEduc.buscarEducacion(id);//busca educacion
//       edu.setImg(newImg);//podria ir en service para desacoplar codigo
//       edu.setTitulo(newTitulo);
//       edu.setInicio(newInicio);
//       edu.setFin(newFin);
//       edu.setTipo(newTipo);
//       edu.setDetalle(newDetalle);
//       edu.setDescripcion(newDescripcion);
//       sEduc.crearEducacion(edu);
//       return edu;//retorna nueva educacion
//   } 
   
   @PutMapping("/editar")
   public void editarEducacion(@RequestBody Educacion edu){
       sEduc.editarEducacion(edu);
   }
}
