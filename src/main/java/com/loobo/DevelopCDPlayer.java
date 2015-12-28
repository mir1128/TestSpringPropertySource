package com.loobo;

public class DevelopCDPlayer implements CDPlayer{

    private String player;

    public DevelopCDPlayer(String player) {
        this.player = player;
    }

    public void play() {
        System.out.println(String.format("%s plays.", player));
    }
}
