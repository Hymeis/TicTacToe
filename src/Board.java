import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JPanel {
    private String[][] board = new String[3][3];
    private final int X = 0;
    private final int O = 1;
    private static int step = 0;
    private boolean gameEnded = false;
    private Scanner myObj = new Scanner(System.in);
    JButton[] buttons = new JButton[board.length * board[0].length];

    // Dimensions of the window panel
    public static final int SCREEN_WIDTH = 1000;
    public static final int SCREEN_LENGTH = 1000;


public class Board {
    private int[][] board = new int[3][3];//tictac board = 3 x 3 2D array
    private final int X = 0;              //X = 1st PLayer(goes first)
    private final int O = 1;              //O = 2nd Player(goes second)
    private static int step = 0;          //step = total number of steps played by both players

    //constrcutor of Board class
    public Board(){
        init();
        //initializeButtons();
        
    }

    private void init(){
        int k = -1;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
<<<<<<< HEAD
                board[i][j] = ""+ k--;
=======
<<<<<<< HEAD
                board[i][j] = -1;         //initialize each spot of the board to be -1 = spot is available
=======
                board[i][j] = k--;
>>>>>>> cef7950fbe216a3ee69e7e037ced371ae1c05d56
>>>>>>> da8333e2a8488ba94e6a8be2546b0d15862e2939
            }
        }
        step = 0;
    }

    public void initializeButtons(JPanel J) {
        for (int i = 0; i < board.length * board[0].length; i++) {
            buttons[i] = new JButton();
            buttons[i].setText("--");
            buttons[i].setBackground(Color.decode("#D0E2E3"));
            buttons[i].setFocusable(false);
            buttons[i].setFont(new Font("Chela One", Font.BOLD, 120));
            buttons[i].addActionListener(new TTTbuttonListener());
            J.add(buttons[i]);

        }

    }

    public void createAndShowGui(){
        // Board mainPanel = new Board();

        JFrame frame = new JFrame("Tic Tac Toe made by Timothy and Andy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.getContentPane().add(this);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        
        frame.setLocationByPlatform(true);
        JPanel title_panel = new JPanel();
        JPanel button_panel = new JPanel();
        JLabel textfield = new JLabel();
       

        textfield.setBackground(Color.decode("#D9FEF8"));
        textfield.setForeground(Color.decode("#3483AD"));
        textfield.setFont(new Font("Sans-Serif", Font.BOLD, SCREEN_WIDTH / 12));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic Tac Toe by A&T");
        //textfield.setMargin(new Insets(10, 10, 10, 10));
        textfield.setOpaque(true);


        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, SCREEN_LENGTH, SCREEN_WIDTH / 6);
        title_panel.add(textfield);

        button_panel.setLayout(new GridLayout(board.length, board[0].length));
        button_panel.setBackground(Color.decode("#4D4D4D"));
        initializeButtons(button_panel);
        //button_panel.setBounds();
    

        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);
        frame.setVisible(true);
        frame.pack();
    }

    @Override
    public Dimension getPreferredSize() {
        // so that our GUI is big enough
        return new Dimension(SCREEN_WIDTH, SCREEN_LENGTH);
    }

    private void place(int i, int j){
<<<<<<< HEAD
        if (Integer.parseInt(board[i][j]) < 0){
            board[i][j] = (step % 2 == 0) ? " X" : " O";
            step++;
        }
    }

    //initialize the game
    public void start(){
        while(gameEnded != true){
            String player = (step % 2 == 0) ? "Player1" : "Player2";
            int row = -1, column = -1;

            do{
                
                System.out.println(player + ", Please Enter where you want to place your mark: [Row] + [ ] + [Column]");
                String out = myObj.nextLine();
            
            
                try {
                    row = Integer.parseInt(out.substring(0, 1));
                    column = Integer.parseInt(out.substring(2, 3));

                    if (board[row][column] == " X" || board[row][column] == " O") {
                        throw new IllegalAccessException();
                    }
                    else if (row < 0 || row > 2 || column < 0 || column > 2) {
                        throw new NumberFormatException();
                    }

                   
                } catch (NumberFormatException e) {
                    System.out.println("Incorrect input. Please double check");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Input too short");
                }catch (IllegalAccessException e) {
                    System.out.println("The spot is already taken, please try another spot!");
=======
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
>>>>>>> da8333e2a8488ba94e6a8be2546b0d15862e2939
                }

                //System.out.println("Column: " + column);
                //System.out.println("Row: " + row);
                //System.out.println("value for board row/column:" + board[row][column]);

                if(row < 0 || row > 2 || column < 0 || column > 2)
                    System.out.println("Incorrect input, please try again!");
            }while(row < 0 || row > 2 || column < 0 || column > 2 || board[row][column] ==" X" || board[row][column] ==" O");
            
            //System.out.println("step: " + step);
            place(row, column);
            //System.out.println("step: " + step);
            System.out.println("value for board row/column:" + board[row][column]);
            printBoard();
            if (check()){
                restart();
            }
        }
    }
<<<<<<< HEAD

    //checks if any player wins
=======
    
    //
>>>>>>> da8333e2a8488ba94e6a8be2546b0d15862e2939
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

        if(step >= board.length * board[0].length)
        {
            System.out.println( "It is a draw");
            return true;
        }
        return false;
    }

    private void restart(){
        init();

        System.out.println("Do you want to restart the game? yes / no?");
        String answer = myObj.nextLine();

        if(answer.contains("no"))
        {
            gameEnded = true;
            myObj.close();
        }
        
    }

    private void printBoard(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String askPlayerPreference(){
        String answer = "";
        do{
            System.out.println("Do you prefer playing on terminal or with Graphics? please type (T) for terminal and (G) for graphics");
            answer = myObj.nextLine();
        }while(!answer.contains("T") && !answer.contains("G"));
    
        return answer;
    }

    public void showTTTgame(String displaytype){
        if(displaytype.contains("G"))
        {
            this.createAndShowGui();
        }
        this.start();

    }



    class TTTbuttonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e)
        {
            JButton buttonClicked = (JButton) e.getSource();
            String player = (step % 2 == 0) ? "X" : "O";
            buttonClicked.setFont(new Font("Sans-Serif", Font.BOLD, 40));
            buttonClicked.setText(player);
            
            if(player =="X")
                buttonClicked.setBackground(Color.DARK_GRAY);
            if(player =="O")
                buttonClicked.setBackground(Color.MAGENTA);
        }
    }

    public static void main(String[] args){
        Board a = new Board();
        String preference = a.askPlayerPreference();
        a.showTTTgame(preference);
        System.out.println("Thank You for playing Tic Tac Toe!");
    }
}

