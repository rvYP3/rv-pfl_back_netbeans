package com.pfl.rv.controller;

import com.pfl.rv.model.Proyecto;
import com.pfl.rv.service.ISProyecto;
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
@RequestMapping("proyecto")//http:/localhost:8080/proyecto
@CrossOrigin(origins="http://localhost:4200")
//configuracion para recepcion de solicitudes y envio de respuestas
public class CProyecto {
   @Autowired
   private ISProyecto sProy;//implementa interface service
   //inyeccion de dependencias del servicio  
   
   @GetMapping("/listar")
   @ResponseBody
   public List<Proyecto> verProyectos(){
        return sProy.verProyectos();
   }
    
   @PostMapping("/crear")
   public String crearProyecto(@RequestBody Proyecto pro){
       sProy.crearProyecto(pro);
       return "Proyecto creado correctamente";//msj aviso creacion
   }
   
   @DeleteMapping("/eliminar/{id}")
   public String borrarProyecto(@PathVariable int id){
       sProy.borrarProyecto(id);
       return "Proyecto eliminado correctamente";//msj aviso borrado
   }
   
   @PutMapping("/editar/{id}")
   public Proyecto editarProyecto(@PathVariable int id,
           @RequestParam("img") String newImg,
           @RequestParam("titulo") String newTitulo,
           @RequestParam("inicio") String newInicio,
           @RequestParam("fin") String newFin,
           @RequestParam("tipo") String newTipo,
           @RequestParam("detalle") String newDetalle){
       Proyecto pro = sProy.buscarProyecto(id);//busca proyecto
       pro.setImg(newImg);//podria ir en service para desacoplar codigo
       pro.setTitulo(newTitulo);
       pro.setInicio(newInicio);
       pro.setFin(newFin);
       pro.setTipo(newTipo);
       pro.setDetalle(newDetalle);
       sProy.crearProyecto(pro);
       return pro;//retorna nuevo proyecto
   } 
   
   @PutMapping("/editar")
   public void editarProyecto(@RequestBody Proyecto pro){
       sProy.editarProyecto(pro);
   }
}
