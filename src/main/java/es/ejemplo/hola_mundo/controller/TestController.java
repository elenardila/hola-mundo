package es.ejemplo.hola_mundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class TestController {


    @GetMapping("/saludo")
    public Map<String, String> obtenerSaludo() {
        return Map.of("saludo", "Hola mundo");
    }

}
