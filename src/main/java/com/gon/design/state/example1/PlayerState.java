package com.gon.design.state.example1;

/**
 * Created by Adelin_Ghanayem on 10-Jul-17.
 */
public interface PlayerState {


    void moveLeft(int x);
    void moveRight(int x);
    void jump(int height);
    void standDown();
    void standUp();
    void fire();
    void throwBomb();

}
