package com.api.votacao.bbb.controller;

import com.api.votacao.bbb.model.ParticipanteModel;
import com.api.votacao.bbb.repository.ParticipanteRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/participantes")
@AllArgsConstructor
@CrossOrigin
public class ParticipanteController {

    private final ParticipanteRepository repository;

    @PostMapping("/salvar")
    public ResponseEntity<ParticipanteModel> salvar(@RequestBody ParticipanteModel participante) {
        ParticipanteModel entidade = repository.save(participante);
        return ResponseEntity.ok(entidade);
    }

    @GetMapping("/consultar")
    public ResponseEntity<ParticipanteModel> consulta(@RequestParam String id) {
        Optional<ParticipanteModel> opt = repository.findById(id);
        if (opt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(opt.get());
    }

    @GetMapping("/todos")
    public ResponseEntity<List<ParticipanteModel>> todos() {
        List<ParticipanteModel> list = repository.findAll();
        return ResponseEntity.ok(list);
    }
}