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
class Bird extends Animal {
    void eat() {
        System.out.print("Birds love to eat seeds. ");
    }

    void sleep() {
        System.out.println("And sleep for 10-12 hours a day.");
    }

    void makeSound() {
        System.out.println("Tweet tweet");
    }
}