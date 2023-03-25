package com.pfl.rv.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity//mapeo entidad
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private String titulo;    
    @Column(name = "sobreMi", columnDefinition="VARCHAR(1200)")
    private String sobreMi;
    private String foto;
    private String tituloFoto;    
    private String banner;
    private String tituloBanner;    
    //constructor
    public Persona() {
    }
    //constructor
    public Persona(String nombre, String apellido, String titulo, String sobreMi, String foto, String tituloFoto, String banner, String tituloBanner) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.sobreMi = sobreMi;
        this.foto = foto;
        this.tituloFoto = tituloFoto;
        this.banner = banner;
        this.tituloBanner = tituloBanner;
    }
    //getters setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTituloFoto() {
        return tituloFoto;
    }

    public void setTituloFoto(String tituloFoto) {
        this.tituloFoto = tituloFoto;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getTituloBanner() {
        return tituloBanner;
    }

    public void setTituloBanner(String tituloBanner) {
        this.tituloBanner = tituloBanner;
    }
       
}
