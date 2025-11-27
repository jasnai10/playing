package com.example.play.controller;

import com.example.play.entity.Juego;
import com.example.play.repository.JuegoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class JuegoController {
    @Autowired
    private JuegoRepository juegoRepository;

    //LISTAR JUEGOS
    @GetMapping(value = {"/juegos", "/juegos/"})
    public List<Juego> listarJuegos(){
        return juegoRepository.findAll();
    }
}
