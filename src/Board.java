import java.util.Scanner;

public class Board {
    private int[][] board = new int[3][3];
    private final int X = 0;
    private final int O = 1;
    private static int step = 0;
    public Board(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = -1;
            }
        }
    }
    private void place(int i, int j){
        if (board[i][j] != -1){
            board[i][j] = (step % 2 == 0) ? X : O;
            step++;
        }
    }

    private void start(){
        while(true){

        }
    }

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
