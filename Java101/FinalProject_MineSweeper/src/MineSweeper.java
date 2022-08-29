import java.util.Scanner;

public class MineSweeper {
    char[][] gameBoard;
    boolean isGameFinished = false;
    Scanner inp = new Scanner(System.in);


    MineSweeper(int row,int column){
        this.gameBoard = new char[row][column];

        for(int i = 0; i < gameBoard.length; i++){
            for (int j = 0; j < gameBoard[0].length; j++){
                this.gameBoard[i][j] = '-';
            }
        }
    }

    
    public void start(){

        randomizeMinesInitialGameBoard();

        while(!this.isGameFinished){

            int row = 0, column = 0;

            while(row <= 0 || column <= 0 ||
                    row > this.gameBoard.length ||
                    column > this.gameBoard.length){

                System.out.print("Enter the row : ");
                row = inp.nextInt();

                System.out.print("Enter the column : ");
                column = inp.nextInt();
            }

            if (this.gameBoard[row-1][column-1] == '*') {

                printGameBoardWithMines();

                System.out.println("You found the mine! You LOST!! :((");
                System.out.println();

                this.isGameFinished = true;
            }

            else{
                this.gameBoard[row-1][column-1] = (char) gameBoardMineCounter(row,column);
                printGameBoardWithoutMines();

                if(!NotWin()){

                    System.out.println();
                    System.out.println("Congrats!! You WIN!!!");
                    System.out.println();

                    printGameBoardWithMines();

                    this.isGameFinished = true;
                }
            }
        }
    }


    public void randomizeMinesInitialGameBoard(){

        int quantityOfMines = gameBoard.length * gameBoard[0].length / 4;
        int minesQuantity = quantityOfMines;
        while(quantityOfMines > 0){

            int randomRow = (int) (Math.random() * gameBoard.length);
            int randomColumn = (int) (Math.random() * gameBoard[0].length);

            if (this.gameBoard[randomRow][randomColumn] == '-') {
                this.gameBoard[randomRow][randomColumn] = '*';
                quantityOfMines--;
            }
        }
            printGameBoardWithoutMines();
    }


    public void printGameBoardWithoutMines(){

        for(int i = 0; i < gameBoard.length; i++){
            for (int j = 0; j < gameBoard[0].length; j++){

                if (this.gameBoard[i][j] == '*')
                    System.out.print("- ");
                else
                    System.out.print(this.gameBoard[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }


    public int gameBoardMineCounter(int row,int column){
        int firstRow;
        int endRow;
        int firstColumn;
        int endColumn;
        int mineCounter = 0;

        firstRow = row - 1;

        if (row == 1)
            firstRow = row - 1;
        else
            firstRow = row - 2;

        if (row == this.gameBoard.length)
            endRow = this.gameBoard.length - 1;
        else
            endRow = row;

        if (column == 1)
            firstColumn = column - 1;
        else
            firstColumn = column - 2;

        if (column == this.gameBoard[0].length)
            endColumn = this.gameBoard[0].length - 1;
        else
            endColumn = column;

        for(int i = firstRow; i <= endRow; i++)
            for (int j = firstColumn; j <= endColumn; j++)
                if (this.gameBoard[i][j] == '*')
                    mineCounter ++;

        return (char) (48 + mineCounter);
    }


    public void printGameBoardWithMines() {

        for (int i = 0; i < this.gameBoard.length; i++) {
            for (int j = 0; j < this.gameBoard[0].length; j++) {
                System.out.print(this.gameBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public boolean NotWin(){

        boolean NotWin = false;
        int stripeCounter = 0;

        for (int i = 0; i < this.gameBoard.length; i++)
            for (int j = 0; j < this.gameBoard[0].length; j++)
                if(gameBoard[i][j] == '-')
                    NotWin = true;

        return NotWin;
    }
}
