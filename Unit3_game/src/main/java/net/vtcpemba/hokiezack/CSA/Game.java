package net.vtcpemba.hokiezack.CSA;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Game 
{
    public int runs = 0;
    public int pwins = 0;
    public int cwins = 0;
    public int ties = 0;
    Scanner scan = new Scanner(System.in);
    public  void run(){
        int x = 0;
        while (x < 20){
            int cmove = selectMove();
            int pmove = enterMove();
            
            x++;
        }
    }
    int selectMove(){
        int RN = (int)(Math.random()*3);
        return RN;// 0 = rock, 1 = paper, 2 = Scissors
    }
    int enterMove(){
        String move = "";
        String I1 = scan.nextLine();
        if (I1 == "Rock" || I1 == "rock") {
            return 0;
        } else if (I1 == "Paper" || I1 == "paper") {
            return 1;
        }else if (I1 == "Scissors" || I1 == "scissors") {
            return 0;
        }else {
            System.out.println("not a valid anwser please choose another anwser");/*retry if invalid anwser*/
            return enterMove();
        }
    }
    int checkWinner(int P1, int P2){
        /*0 = tie, 1 = Computer win, 2 = Player win, 4 = error*/
        if (cmove == 0 && pmove == 0){
            return 0; 
        } else if (cmove == 0 && pmove == 1){
            return 3; 
        } else if (cmove == 0 && pmove == 2){
            return 2; 
        } else if (cmove == 1 && pmove == 0){
            return 2; 
        } else if (cmove == 1 && pmove == 1){
            return 0; 
        } else if (cmove == 1 && pmove == 2){
            return 3; 
        } else if (cmove == 2 && pmove == 0){
            return 3; 
        } else if (cmove == 2 && pmove == 1){
            return 2; 
        } else if (cmove == 2 && pmove == 2){
            return 0; 
        } else {
            return 4;
        }
    }
}
