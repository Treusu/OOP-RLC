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
class Player implements PlayerInterface {
    private String name;
    private int health;
    private int strength;
    private int agility;

    public Player(String name) {
        this.name = name;
        this.health = 100; // Default health
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public void heal(int amount) {
        health += amount;
        if (health > 100) {
            health = 100; // Maximum health
        }
    }
    public class Goblin {
        private int gobHealth;
        private int strength;
        private int agility;

        public Goblin() {
            // Assign random values to goblin's stats within a certain range
            this.gobHealth = (int) (Math.random() * 20) + 10;
            this.strength = (int) (Math.random() * 5) + 3;
            this.agility = (int) (Math.random() * 3) + 1;
        }
    }
        //calculate player damage with modifier
    public int attack() {
        int baseDamage = 10;
        int damageModifier = (int) (Math.random() * (agility * 2));
        return baseDamage + damageModifier;
    }
}