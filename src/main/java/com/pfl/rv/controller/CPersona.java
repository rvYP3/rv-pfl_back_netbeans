package com.pfl.rv.controller;

import com.pfl.rv.model.Persona;
import com.pfl.rv.service.ISPersona;
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
// ctrl + shift + i --> para importar todas juntas

@RestController//mapeo controller 
@RequestMapping("persona")//http:/localhost:8080/persona
@CrossOrigin(origins="http://localhost:4200")
//configuracion para recepcion de solicitudes y envio de respuestas
public class CPersona {
   @Autowired
   private ISPersona sPers;//implementa interface service
   //inyeccion de dependencias del servicio
    
   @GetMapping("/listar")
   @ResponseBody
   public List<Persona> verPersonas(){
        return sPers.verPersonas();
   }
   
   @GetMapping("/ver/[id]")
   @ResponseBody
   public Persona buscarPersona(@PathVariable int id){
       return sPers.buscarPersona(id);
   }
   
   @PostMapping("/crear")
   public String crearPersona(@RequestBody Persona per){
       sPers.crearPersona(per);
       return "Persona creada correctamente";//msj aviso creacion
   }
   
   @DeleteMapping("/eliminar/{id}")
   public String borrarPersona(@PathVariable int id){
       sPers.borrarPersona(id);
       return "Persona eliminada correctamente";//msj aviso borrado
   }
   @PutMapping("/editar")
   public void editarPersona(@RequestBody Persona per){
       sPers.editarPersona(per);
   }
   
//   @PutMapping("/editar/{id}")
//   public Persona editarPersona(@PathVariable int id,
//           @RequestParam("nombre") String newNombre,
//           @RequestParam("apellido") String newApellido,
//           @RequestParam("titulo") String newTitulo,
//           @RequestParam("sobreMi") String newSobreMi,
//           @RequestParam("foto") String newFoto,
//           @RequestParam("tituloFoto") String newTituloFoto,
//           @RequestParam("banner") String newBanner,
//           @RequestParam("tituloBanner") String newTituloBanner) {
//       Persona per = sPers.buscarPersona(id);//busca persona
//       per.setNombre(newNombre);//podria ir en service para desacoplar codigo
//       per.setApellido(newApellido);
//       per.setTitulo(newTitulo);
//       per.setSobreMi(newSobreMi);
//       per.setFoto(newFoto);
//       per.setTituloFoto(newTituloFoto);
//       per.setBanner(newBanner);
//       per.setTituloBanner(newTituloBanner);
//       sPers.crearPersona(per);
//       return per;//retorna nueva persona
//   }    
           
}
