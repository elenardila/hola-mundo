package es.ejemplo.hola_mundo.controller;

import es.ejemplo.hola_mundo.entidades.Saludo;
import es.ejemplo.hola_mundo.repos.SaludoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/saludos")
public class SaludoController {

    private final SaludoRepository repo;

    public SaludoController(SaludoRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Saludo> listar() {
        return repo.findAll();
    }
}
