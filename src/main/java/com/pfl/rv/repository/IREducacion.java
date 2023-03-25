package com.pfl.rv.repository;

import com.pfl.rv.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//mapeo repository
//JpaReposirory: maneja repositorios, parametros: <clase a persistir, tipo dato id>
public interface IREducacion extends JpaRepository <Educacion, Integer> {
    //conecta a Base Datos
}
