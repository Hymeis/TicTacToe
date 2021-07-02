import java.util.Scanner;

public class Board {
    private int[][] board = new int[3][3];//tictac board = 3 x 3 2D array
    private final int X = 0;              //X = 1st PLayer(goes first)
    private final int O = 1;              //O = 2nd Player(goes second)
    private static int step = 0;          //step = total number of steps played by both players

    //constrcutor of Board class
    public Board(){
        init();
    }

    private void init(){
        int k = -1;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
<<<<<<< HEAD
                board[i][j] = -1;         //initialize each spot of the board to be -1 = spot is available
=======
                board[i][j] = k--;
>>>>>>> cef7950fbe216a3ee69e7e037ced371ae1c05d56
            }
        }
    }
    private void place(int i, int j){
        if (board[i][j] != -1){
            board[i][j] = (step % 2 == 0) ? X : O;//if player move is even, it is the first player's turn; else the second player
            step++;                       //everytime place() is called, increment total step played
        }
    }

<<<<<<< HEAD
    //initialize game
    private void start(){
=======
    public void start(){
>>>>>>> cef7950fbe216a3ee69e7e037ced371ae1c05d56
        while(true){
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter [Row] + [ ] + [Column]");
            String out = myObj.nextLine();
            int row = -1, column= -1;
            try{
                row = Integer.parseInt(out.substring(0,1));
                column = Integer.parseInt(out.substring(2,3));
                if (row < 0 || row > 2 || column < 0 || column > 2) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e){
                System.out.println("Incorrect input. Please double check");
            } catch (IndexOutOfBoundsException e){
                System.out.println("Input too short");
            }
            place(row, column);
            printBoard();
            if (check()){
                restart();
            }
        }
    }
    
    //
    private boolean check(){
<<<<<<< HEAD
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter [Row] + [ ] + [Column]");
        String out = myObj.nextLine();   
        try{

        } catch (Exception e){

=======
        String winner = (step % 2 == 1) ? "X" : "O";
        for (int i = 0; i < 3; i++){
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]){ // horizontal
                System.out.println(winner + " wins");
                return true;
            }
        }
        for (int i = 0; i < 3; i++){
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]){ // vertical
                System.out.println(winner + " wins");
                return true;
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]
                || board[0][2] == board[1][1] && board[1][1] == board[2][0]){ // diagonal
            System.out.println(winner + " wins");
            return true;
>>>>>>> cef7950fbe216a3ee69e7e037ced371ae1c05d56
        }
        return false;
    }

    private void restart(){
        init();
    }

    private void printBoard(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Board a = new Board();
        a.start();
    }
}
