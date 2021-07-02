import java.util.Scanner;

public class Board {
    private int[][] board = new int[3][3];//tictac board = 3 x 3 2D array
    private final int X = 0;              //X = 1st PLayer(goes first)
    private final int O = 1;              //O = 2nd Player(goes second)
    private static int step = 0;          //step = total number of steps played by both players

    //constrcutor of Board class
    public Board(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = -1;         //initialize each spot of the board to be -1 = spot is available
            }
        }
    }
    private void place(int i, int j){
        if (board[i][j] != -1){
            board[i][j] = (step % 2 == 0) ? X : O;//if player move is even, it is the first player's turn; else the second player
            step++;                       //everytime place() is called, increment total step played
        }
    }

    //initialize game
    private void start(){
        while(true){

        }
    }
    
    //
    private boolean check(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter [Row] + [ ] + [Column]");
        String out = myObj.nextLine();   
        try{

        } catch (Exception e){

        }
    }

    private void restart(){

    }
}
