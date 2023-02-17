package com.api.votacao.bbb.repository;

import com.api.votacao.bbb.model.ParametroModel;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ParametroRepository extends MongoRepository<ParametroModel, String> {

}
