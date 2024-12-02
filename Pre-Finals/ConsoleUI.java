/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author Treus
 */
class ConsoleUI implements UserInterface {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void displayMessageln(String message) {
        System.out.println(message);
    }
    public void displayMessage(String message) {
        System.out.print(message);
    }

    @Override
    public String getInput() {
        return scanner.nextLine();
    }
}