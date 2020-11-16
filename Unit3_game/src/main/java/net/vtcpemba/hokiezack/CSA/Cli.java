package net.vtcpemba.hokiezack.CSA;

import java.util.Scanner;
public class Cli {
  App app = new App();
  public  void run(){
    boolean x = true;
    while (x){
      int cmove = app.game.selectMove();
      int pmove = app.game.enterMove();
      output_winner(app.game.updateStats(app.game.checkWinner(cmove, pmove)),cmove);
      System.out.println("do you want to play again?");            String play = App.scan.nextLine();
      if (play.equals("yes") || play.equals("Yes")){
        System.out.print("ok");
      } else if (play.equals("No") || play.equals("no")) {
        System.out.print("you have played " + app.game.runs + " times. you have won "+app.game.pwins+" times. you have lost "+app.game.cwins+" times. you have tied "+app.game.ties+" times.");
        x = false;
      }        
    }
  }
  static void output_winner(int winner, int cmove){
    if (cmove == 0){
        System.out.println("the computers move was Rock");
    } else if (cmove == 1){
        System.out.println("the computers move was Paper");
    } else if (cmove == 2){
        System.out.println("the computers move was Scissors");
    }
    if (winner == 0){
        System.out.println("\nit was a tie");
    } else if (winner == 1){
        System.out.println("\nyou lost the computer won");
    } else if (winner == 2){
        System.out.println("\nyou won the computer lost");
    }
  }

}