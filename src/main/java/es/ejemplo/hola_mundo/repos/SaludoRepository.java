package es.ejemplo.hola_mundo.repos;

import es.ejemplo.hola_mundo.entidades.Saludo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaludoRepository extends JpaRepository<Saludo, Long> {}
