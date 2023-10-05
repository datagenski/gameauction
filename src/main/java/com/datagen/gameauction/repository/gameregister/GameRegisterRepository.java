package com.datagen.gameauction.repository.gameregister;

import com.datagen.gameauction.repository.gameregister.entity.RegisteredGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRegisterRepository extends JpaRepository<RegisteredGame, Long> {
}
