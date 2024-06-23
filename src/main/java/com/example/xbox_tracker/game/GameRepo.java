package com.example.xbox_tracker.game;

import com.example.xbox_tracker.game.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepo extends JpaRepository<GameModel, Long> {
    // Additional query methods can be defined here
}