package com.example.xbox_tracker.game;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepo gameRepo;

    public List<GameModel> getAllGames() {
        return gameRepo.findAll();
    }
}
