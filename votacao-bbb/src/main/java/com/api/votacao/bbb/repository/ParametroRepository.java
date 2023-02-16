package com.api.votacao.bbb.repository;

import com.api.votacao.bbb.model.ParametroModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface ParametroRepository extends MongoRepository<ParametroModel, String> {
}
