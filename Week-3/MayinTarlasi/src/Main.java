public class Main {
    public static void main(String[] args) {

        // Create a new Minesweeper object with a 5x5 grid
        // This line explains that the Minesweeper object is created with a game board with 5 rows and 5 columns.
        MineSweeper mineSweeper = new MineSweeper(5,5);

        // Start Minesweeper game
        // This line explains that the game is started by calling the "run" method of the created Minesweeper object.
        mineSweeper.run();

    }

}