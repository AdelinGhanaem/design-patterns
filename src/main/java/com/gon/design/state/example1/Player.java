package com.gon.design.state.example1;

/**
 * Created by Adelin_Ghanayem on 10-Jul-17.
 */
public class Player { // THIS IS THE CONTEXT !!!

    private PlayerState playerState;


    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
    }


    void moveLeft(int x) {
        playerState.moveLeft(x);
    }

    void moveRight(int x) {
        playerState.moveRight(x);

    }

    void jump(int height) {
        playerState.jump(height);
    }

    void standDown() {
        playerState.standDown();
        setPlayerState(new StandDown());
    }

    void standUp(){
        playerState.standUp();
        setPlayerState(new StandUp());
    }

    void fire() {

    }

    void throwBomb() {

    }
}
