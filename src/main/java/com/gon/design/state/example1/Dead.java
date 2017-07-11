package com.gon.design.state.example1;

/**
 * Created by Adelin_Ghanayem on 10-Jul-17.
 */
public class Dead implements PlayerState {


    Player player;

    public Dead(Player player) {
        this.player = player;
    }

    public void moveLeft(int x) {
       player.setPlayerState(this);
       throw new IllegalStateException("Can't move, I am dead, CAN'T YOU SEE !!!" );
    }

    public void moveRight(int x) {
        player.setPlayerState(this);
        throw new IllegalStateException("Can't move, I am dead, CAN'T YOU SEE !!!" );
    }

    public void jump(int height) {
        player.setPlayerState(this);
        throw new IllegalStateException("Really ?!" );
    }

    public void standDown() {
        player.setPlayerState(this);
        throw new IllegalStateException("I am already down !!! There is no more down than down like dead !!!" );
    }

    public void standUp() {
        player.setPlayerState(this);
        throw new IllegalStateException("I am already down !!! There is no more down than down like dead !!!" );
    }

    public void fire() {
        player.setPlayerState(this);
        throw new IllegalStateException("In my next life ! ");
    }

    public void throwBomb() {
        player.setPlayerState(this);
        throw new IllegalStateException("Can't, I've just received one !!! ");
    }
}
