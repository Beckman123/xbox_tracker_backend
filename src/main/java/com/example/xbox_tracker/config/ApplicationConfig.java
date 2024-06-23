package com.example.xbox_tracker.config;

import com.example.xbox_tracker.game.GameModel;
import com.example.xbox_tracker.game.GameRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ApplicationConfig {
    @Bean
    CommandLineRunner commandLineRunner(GameRepo gameRepo) {
        return args -> {
            GameModel game1 = new GameModel(1L, "game1");
            GameModel game2 = new GameModel(2L, "game2");
            GameModel game3 = new GameModel(3L, "game3");

            gameRepo.saveAll(
                    List.of(game1, game2, game3)
            );
        };
    }
}