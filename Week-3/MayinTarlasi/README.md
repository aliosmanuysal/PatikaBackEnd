# Minesweeper Game
## Technologies used
* Java version 21 is used
## Game rules and operation
* This game is a 5x5 minefield game. The aim of the game is to open all squares without mines. At the start of the game, there are 6 mines in the game. When the player clicks on a square without mines, the number of mines around that square is printed on the screen. If there are mines in the clicked square, the game ends. The end states of the game are:

1. The player opens all non-mined squares and wins the game.
2. The player clicks on a mine and loses the game.

## Start screen
```
MAP
- - * - - 
- * * - - 
- - - - - 
- * - - - 
* - - - * 
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
- - - - - 
- - - - - 
- - - - - 
- - - - - 
- - - - - 
Enter the number of rows: 
```
## Losing scenario
```
MAP
- - - * - 
- * * - - 
- - * - - 
- - - * - 
- - - * - 
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
- - - - - 
- - - - - 
- - - - - 
- - - - - 
- - - - - 
Enter the number of rows: 1
Enter the number of columns: 4
MAP
- - - * - 
- * * - - 
- - * - - 
- - - * - 
- - - * - 
You exploded.
You Lost the Game.
```
## Winning scenario
```
MAP
- - * - - 
- * - * - 
* - - - - 
- - - * - 
- - - * - 
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
- - - - - 
- - - - - 
- - - - - 
- - - - - 
- - - - - 
Enter the number of rows: 1
Enter the number of columns: 1
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 - - - - 
- - - - - 
- - - - - 
- - - - - 
- - - - - 
Enter the number of rows: 1
Enter the number of columns: 2
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - - - 
- - - - - 
- - - - - 
- - - - - 
- - - - - 
Enter the number of rows: 1
Enter the number of columns: 4
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 - 
- - - - - 
- - - - - 
- - - - - 
- - - - - 
Enter the number of rows: 1
Enter the number of columns: 5
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
- - - - - 
- - - - - 
- - - - - 
- - - - - 
Enter the number of rows: 2
Enter the number of columns: 1
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
2 - - - - 
- - - - - 
- - - - - 
- - - - - 
Enter the number of rows: 2
Enter the number of columns: 3
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
2 - 3 - - 
- - - - - 
- - - - - 
- - - - - 
Enter the number of rows: 2
Enter the number of columns: 5
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
2 - 3 - 1 
- - - - - 
- - - - - 
- - - - - 
Enter the number of rows: 3
Enter the number of columns: 2
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
2 - 3 - 1 
- 2 - - - 
- - - - - 
- - - - - 
Enter the number of rows: 3
Enter the number of columns: 3
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
2 - 3 - 1 
- 2 3 - - 
- - - - - 
- - - - - 
Enter the number of rows: 3
Enter the number of columns: 4
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
2 - 3 - 1 
- 2 3 2 - 
- - - - - 
- - - - - 
Enter the number of rows: 3
Enter the number of columns: 5
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
2 - 3 - 1 
- 2 3 2 2 
- - - - - 
- - - - - 
Enter the number of rows: 4
Enter the number of columns: 2
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
2 - 3 - 1 
- 2 3 2 2 
- 1 - - - 
- - - - - 
Enter the number of rows: 4
Enter the number of columns: 1
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
2 - 3 - 1 
- 2 3 2 2 
1 1 - - - 
- - - - - 
Enter the number of rows: 4
Enter the number of columns: 3
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
2 - 3 - 1 
- 2 3 2 2 
1 1 2 - - 
- - - - - 
Enter the number of rows: 4
Enter the number of columns: 5
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
2 - 3 - 1 
- 2 3 2 2 
1 1 2 - 2 
- - - - - 
Enter the number of rows: 5
Enter the number of columns: 2
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
2 - 3 - 1 
- 2 3 2 2 
1 1 2 - 2 
- 0 - - - 
Enter the number of rows: 5
Enter the number of columns: 1
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
2 - 3 - 1 
- 2 3 2 2 
1 1 2 - 2 
0 0 - - - 
Enter the number of rows: 5
Enter the number of columns: 3
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
1 2 - 2 1 
2 - 3 - 1 
- 2 3 2 2 
1 1 2 - 2 
0 0 2 - - 
Enter the number of rows: 5
Enter the number of columns: 5
Final table
1 2 - 2 1 
2 - 3 - 1 
- 2 3 2 2 
1 1 2 - 2 
0 0 2 - 2 
==========================
Congratulations. You've won.
```
## Error screen
```
MAP
- - * - - 
- - - - - 
- * - - * 
- - - - - 
* * - - * 
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
- - - - - 
- - - - - 
- - - - - 
- - - - - 
- - - - - 
Enter the number of rows: 7
Enter the number of columns: 8
==Enter valid range.==
==================================
Welcome to the Minesweeper Game :) 
GAME BOARD
- - - - - 
- - - - - 
- - - - - 
- - - - - 
- - - - - 
Enter the number of rows: 
```
#### Author: ALİ OSMAN UYSAL - 2024








