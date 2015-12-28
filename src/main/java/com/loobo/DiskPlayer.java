package com.loobo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DiskPlayer {

    private String player;

    @Autowired
    public DiskPlayer(@Value("#{cdPlayer.play()}") String player) {
        this.player = player;
    }

    public void play() {
        System.out.println(String.format("%s plays.", player));
    }
}
