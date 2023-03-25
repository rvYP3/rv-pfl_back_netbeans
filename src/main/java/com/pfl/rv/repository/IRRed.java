package com.pfl.rv.repository;

import com.pfl.rv.model.Red;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//mapeo repository
//JpaReposirory: maneja repositorios, parametros: <clase a persistir, tipo dato id>
public interface IRRed extends JpaRepository <Red, Integer>{
    //conecta a Base Datos
}
