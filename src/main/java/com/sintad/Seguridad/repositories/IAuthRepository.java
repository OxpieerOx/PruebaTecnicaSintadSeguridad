package com.sintad.Seguridad.repositories;

import com.sintad.Seguridad.models.AccessModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthRepository extends CrudRepository<AccessModel, Long> {

}

