package com.example.play.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "juegos")
public class Juego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idjuego", nullable = false)
    private Integer id;

    @Column(name = "nombre", length =  50)
    private String nombre;

    @Column(name = "descripcion", length = 448)
    private String descripcion;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "image", length = 400)
    private String image;

    @ManyToOne
    @JoinColumn(name = "idgenero")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "idplataforma")
    private Plataforma plataforma;

    @ManyToOne
    @JoinColumn(name = "iddistribuidora")
    private Distribuidora distribuidora;

    @ManyToOne
    @JoinColumn(name = "ideditora")
    private Editora editora;
}
