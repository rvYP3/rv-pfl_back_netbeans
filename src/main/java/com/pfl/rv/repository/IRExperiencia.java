package com.pfl.rv.repository;

import com.pfl.rv.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//mapeo repository
//JpaReposirory: maneja repositorios, parametros: <clase a persistir, tipo dato id>
public interface IRExperiencia extends JpaRepository <Experiencia,Integer>{
    //conecta a Base Datos
}
