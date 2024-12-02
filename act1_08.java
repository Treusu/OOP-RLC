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
public class expirement {
    public interface Carnivore {
    int pieces = 10;
    public static void eatGrass() {
        System.out.println("Carnivores don't eat grass!");
    }
        public int chew();
    }
    public static void main(String[] args) {
        class Lion implements Carnivore {
            public int chew() {
                return 13; 
            }
        }

        Lion lion = new Lion();
        System.out.println(lion.chew());
        Carnivore.eatGrass(); 
    }
}
    /*
    public interface HasWings {
    int getNumberOfWings();
    }
    public abstract class Insect {
        public abstract int getNumberOfLegs();
    }

    static class Dragonfly extends Insect implements HasWings {
        public int getNumberOfLegs() {
            return 6;
        }
        public int getNumberOfWings() {
            return 4;
        }
    }

    public static void main(String[] args) {
        Dragonfly dragonfly = new Dragonfly();
        System.out.println("Number of legs: " + dragonfly.getNumberOfLegs());
        System.out.println("Number of wings: " + dragonfly.getNumberOfWings());
    }
}*/