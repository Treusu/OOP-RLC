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
import java.util.Random;

public abstract class SurvivalMode implements GameModeInterface {
    private boolean gameOver = false;
    private Random random = new Random();

    @Override
    public void start() {
        System.out.println("Welcome to Survival Mode! Survive as long as you can!");
    }

    @Override
    public void takeTurn(Player player) {
        int randomEvent = random.nextInt(3); // Generate a random number between 0 and 2

        if (randomEvent == 0) {
            //poison event
            int poisonDamage = random.nextInt(10) + 5;
            player.takeDamage(poisonDamage);
            System.out.println("You were poisoned! Lost " + poisonDamage + " health. Current health: " + player.getHealth());
        } else if (randomEvent == 1) {
            //trap event
            int trapDamage = random.nextInt(15) + 10;
            player.takeDamage(trapDamage);
            System.out.println("You stepped on a trap! Lost " + trapDamage + " health. Current health: " + player.getHealth());
        } else {
            player.heal(10);
            System.out.println("You found some food and healed 10 health. Current health: " + player.getHealth());
        }

        if (player.getHealth() <= 0) {
            System.out.println("You have succumbed to the dangers. Game Over!");
            gameOver = true;
        }
    }

    @Override
    public boolean isGameOver() {
        return gameOver;
    }
}