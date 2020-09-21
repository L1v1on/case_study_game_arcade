package com.ezra.arcade.repository;

import com.ezra.arcade.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {
    //Put any custom queries here
}
