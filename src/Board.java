import java.util.Scanner;

public class Board {
    private int[][] board = new int[3][3];
    private final int X = 0;
    private final int O = 1;
    private static int step = 0;
    public Board(){
        init();
    }

    private void init(){
        int k = -1;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = k--;
            }
        }
    }
    private void place(int i, int j){
        if (board[i][j] != -1){
            board[i][j] = (step % 2 == 0) ? X : O;
            step++;
        }
    }

    public void start(){
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

    private boolean check(){
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
