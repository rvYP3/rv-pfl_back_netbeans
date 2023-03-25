
package com.pfl.rv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity//mapeo entidad
public class Experiencia {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;    
    private String img;   
    private String titulo;
    private String inicio;
    private String fin;
    private String puesto;
    @Column(name = "tarea", columnDefinition="VARCHAR(1200)")
    private String tarea;
    //constructor
    public Experiencia() {
    }
    //constructor
    public Experiencia(String img, String titulo, String inicio, String fin, String puesto, String tarea) {
        this.img = img;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.puesto = puesto;
        this.tarea = tarea;
    }
    //getters setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
    
    
}
