package es.ejemplo.hola_mundo.entidades;

import jakarta.persistence.*;

@Entity @Table(name = "saludos")
public class Saludo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String mensaje;

    public Long getId() { return id; }
    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }
}
