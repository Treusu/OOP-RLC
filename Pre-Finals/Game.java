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
interface PlayerInterface {
    String getName();
    int getHealth();
    void takeDamage(int damage);
    void heal(int amount);
}
//game interface
interface GameModeInterface {
    void start();
    void takeTurn(Player player);
    boolean isGameOver();
}
//user interface
interface UserInterface {
    void displayMessage(String message);
    void displayMessageln(String message);
    String getInput();
}

public class Game {
    private Player player;
    private GameModeInterface gameMode;
    private UserInterface ui;

    public Game() {
        ui = (UserInterface) new ConsoleUI();
        ui.displayMessage("Enter your name: ");
        String playerName = ui.getInput();
        player = new Player(playerName);

        ui.displayMessageln("Press 1 or 2 to select your game mode.");
        ui.displayMessageln("1 - Story");
        ui.displayMessageln("2 - Survival");
        int modeChoice = Integer.parseInt(ui.getInput());
        if (modeChoice == 1) {
            gameMode = (GameModeInterface) new StoryMode();
        } else if (modeChoice == 2) {
            gameMode = (GameModeInterface) new SurvivalMode() {};
        } else {
            ui.displayMessageln("Invalid choice. Defaulting to Story Mode.");
            gameMode = (GameModeInterface) new StoryMode();
        }

        ui.displayMessage("Press P to start playing, " + playerName + ".");
        String startInput = ui.getInput().toUpperCase();
        if (!startInput.equals("P")) {
            ui.displayMessageln("Invalid input. Exiting game.");
            System.exit(0);
        }
    }

    public void start() {
        gameMode.start();
        while (!gameMode.isGameOver()) {
            gameMode.takeTurn(player);
        }
        ui.displayMessageln("Game Over!");
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}