/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author Treus
 */
class StoryMode implements GameModeInterface {
    private boolean gameOver = false;

    @Override
    public void start() {
        System.out.println("Welcome to Story Mode! Embark on an adventure!");
    }

    @Override
    public void takeTurn(Player player) {
        System.out.println("You encounter a goblin! Fighting...");
        int playerDamage = player.attack();
        System.out.println("You dealt " + playerDamage + " damage to the monster.");
        player.takeDamage(20);
        System.out.println("You took 20 damage. Current health: " + player.getHealth());
        if (player.getHealth() <= 0) {
            System.out.println("You have fallen in battle. Game Over!");
            gameOver = true;
        }
    }

    @Override
    public boolean isGameOver() {
        return gameOver;
    }
}