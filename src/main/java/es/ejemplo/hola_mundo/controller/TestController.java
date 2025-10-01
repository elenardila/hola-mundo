package es.ejemplo.hola_mundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.Map;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TestController {


    @GetMapping("/saludo")
    public Map<String, String> obtenerSaludo() {
        return Map.of("saludo", "Hola mundo");
    }

}
