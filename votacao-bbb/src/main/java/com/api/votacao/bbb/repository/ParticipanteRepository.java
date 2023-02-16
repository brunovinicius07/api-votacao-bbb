package com.api.votacao.bbb.repository;

import com.api.votacao.bbb.model.ParticipanteModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ParticipanteRepository extends MongoRepository<ParticipanteModel,String> {
}
