package com.pfl.rv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity//mapeo entidad
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String img;   
    private String titulo;
    private String inicio;
    private String fin;
    private String tipo;
    private String detalle;
    @Column(name = "descripcion", columnDefinition="VARCHAR(1200)")
    private String descripcion;
    //constructor
    public Educacion() {
    }
    //constructor
    public Educacion(String img, String titulo, String inicio, String fin, String tipo, String detalle, String descripcion) {
        this.img = img;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.tipo = tipo;
        this.detalle = detalle;
        this.descripcion = descripcion;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
