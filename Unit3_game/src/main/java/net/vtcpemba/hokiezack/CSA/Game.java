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
            x++;
        }
    }
    int selectMove(){
        int RN = (int)(Math.random()*3);
        System.out.print(RN);
        return RN;// 0 = rock, 1 = paper, 2 = Scissors
    }
}
