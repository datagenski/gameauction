package com.datagen.gameauction.controller;

import com.datagen.gameauction.controller.request.RegisterGameRequest;
import com.datagen.gameauction.repository.gameregister.GameRegisterRepository;
import com.datagen.gameauction.repository.gameregister.entity.RegisteredGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GameRegisterController {

    private Logger log = LoggerFactory.getLogger(GameRegisterController.class);

    @Autowired
    private GameRegisterRepository registerRepository;

    @PostMapping("/create")
    private String registerGame(RegisterGameRequest request) {
        RegisteredGame game = new RegisteredGame();
        game.setCurrency(request.getCurrency());
        game.setName(request.getName());
        game.setPrice(request.getPrice());
        registerRepository.save(game);
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RegisteredGame> getGameById(@PathVariable Long id) {
        log.info("received request to get game by id: {}", id);
        Optional<RegisteredGame> game = registerRepository.findById(id);
        return game.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/{ids}")
    public ResponseEntity<RegisteredGame> getGameByIds(@PathVariable Long id) {
        log.info("received request to get game by id: {}", id);
        Optional<RegisteredGame> game = registerRepository.findById(id);
        return game.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
