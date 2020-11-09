package net.vtcpemba.hokiezack.CSA;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Game 
{
    public int runs = 0;
    public int wins = 0;
    public int losses = 0;
    Scanner scan = new Scanner(System.in);
    public  void run(){
        int x = 0;
        while (x < 20){
            int cmove = selectMove();
            int pmove = 
            x++;
        }
    }
    int selectMove(){
        int RN = (int)(Math.random()*3);
        System.out.println(RN);
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
}
