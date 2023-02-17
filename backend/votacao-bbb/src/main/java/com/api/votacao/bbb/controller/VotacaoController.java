package com.api.votacao.bbb.controller;

import com.api.votacao.bbb.model.ParticipanteModel;
import com.api.votacao.bbb.repository.ParticipanteRepository;
import com.api.votacao.bbb.service.VotacaoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/votacao")
@AllArgsConstructor
@CrossOrigin
public class VotacaoController {

    private final VotacaoService servico;
    private final ParticipanteRepository repository;

    @PostMapping
    public ResponseEntity<ParticipanteModel> votar(@RequestBody ParticipanteModel participante) {

        Optional<ParticipanteModel> responseOpt = repository.findById(participante.getId());
        if (responseOpt.isEmpty()) {
            throw new RuntimeException("Código [" + participante.getId() + "] inválido para votação");
        }

        ParticipanteModel response = responseOpt.get();
        servico.adicionarEvento(response);
        return ResponseEntity.ok(response);
    }

}