import java.util.Scanner;

public class MineSweeper {

    // The playing field and the number of mines are determined.
    int rowNumber;
    int colNumber;
    int mineNumber;

    // The playing field and the actual situation in which the player plays
    String[][] answerBoard;
    String[][] board;

    // Number of correct predictions and row and column information received from the user
    int correctAnswer = 0;
    int row;
    int column;

    // Borders used to control mines
    int rowMaxLimit;
    int rowMinLimit;
    int columnMaxLimit;
    int columnMinLimit;

    // Variable that holds the number of mines and the input received from the user
    int mineCount=0;

    // Oyun başlatıcı
    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mineNumber = rowNumber * colNumber / 4;
        this.board = new String[rowNumber][colNumber];
        this.answerBoard = new String[rowNumber][colNumber];
    }

    // Relevant methods in the classroom
    // Method that fills the playing field with "-"
    void fillArr() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                this.answerBoard[i][j] = "-";
                this.board[i][j] = "-";
            }
        }

    }

    // Method for randomly placing mines
    void placeMines() {
        for (int i = 0; i < this.mineNumber; i++) {
            int row = (int) (Math.random() * this.rowNumber);
            int column = (int) (Math.random() * this.colNumber);
            if (this.answerBoard[row][column].equals("*")) {
                i--;
            }
            this.answerBoard[row][column] = "*";
        }
    }

    // Method that prints the playing field to the screen
    void showBoard() {
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(this.board[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Method that prints the actual state to the screen
    void showAnswerBoard() {
        System.out.println("MAP");
        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                System.out.print(this.answerBoard[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    // Method to find the number of mines around the selected cell
    void findMines() {
        this.rowMaxLimit = this.row + 1;
        this.rowMinLimit = this.row - 1;
        this.columnMinLimit = this.column - 1;
        this.columnMaxLimit = this.column + 1;

        // Correction by checking borders
        if (this.rowMinLimit < 0) {
            this.rowMinLimit++;
        }
        if (this.rowMaxLimit > this.answerBoard[0].length - 1) {
            this.rowMaxLimit--;
        }
        if (this.columnMinLimit < 0) {
            this.columnMinLimit++;
        }
        if (this.columnMaxLimit > this.answerBoard.length - 1) {
            this.columnMaxLimit--;
        }

        // Find the number of mines around the selected cell
        for (int i = this.rowMinLimit; i <= this.rowMaxLimit; i++) {
            for (int j = this.columnMinLimit; j <= this.columnMaxLimit; j++) {
                if (this.answerBoard[i][j].equals("*")) {
                    this.mineCount++;
                }
            }
        }

        // Update the playground with the number of mines found
        this.board[this.row][this.column] = Integer.toString(this.mineCount);
        this.mineCount = 0;
    }

    // Method that runs the game
    void run() {
        Scanner input = new Scanner(System.in);
        this.fillArr();
        this.placeMines();
        this.showAnswerBoard();

        // Continue until all unmined cells are cleared
        while (this.correctAnswer < this.rowNumber * this.colNumber - this.mineNumber) {
            System.out.println("==================================");
            System.out.println("Welcome to the Minesweeper Game :) ");
            System.out.println("GAME BOARD");
            this.showBoard();
            System.out.print("Enter the number of rows: ");
            this.row = input.nextInt()-1;
            System.out.print("Enter the number of columns: ");
            this.column = input.nextInt()-1;

            // Check if the input coordinates are within the valid range
            if (this.row >= 0 && this.row < this.board[0].length) {
                if (this.column >= 0 && this.column < this.board.length) {
                    this.findMines();
                    correctAnswer++;

                    // Check if the player has won
                    if (this.correctAnswer == this.rowNumber * this.colNumber - this.mineNumber) {
                        System.out.println("Final table");
                        this.showBoard();
                        System.out.println("==========================");
                        System.out.println("Congratulations. You've won.");

                    }

                    // Check for mines in the selected cell
                    if (this.answerBoard[this.row][this.column].equals("*")) {
                        this.showAnswerBoard();
                        System.out.println("You exploded.");
                        System.out.println("You Lost the Game.");
                        return;
                    }
                } else {
                    System.out.println("==Enter valid range.==");
                }
            } else {
                System.out.println("==Enter valid range.==");
            }
        }
    }
}