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
class Cat extends Animal {
    void eat() {
        System.out.print("Cats love to eat fish. ");
    }

    void sleep() {
        System.out.println(" And sleep for 12-16 hours a day.");
    }

    void makeSound() {
        System.out.println("Meow");
    }
}