package net.vtcpemba.hokiezack.CSA;

import java.util.Scanner;
public class Cli {
  App app = new App();
  public  void run(){
    boolean x = true;
    while (x){
      int cmove = app.game.selectMove();
      int pmove = app.game.enterMove();
      output_winner(app.game.updateStats(app.game.checkWinner(cmove, pmove)));
      System.out.println("do you want to play again?");            String play = App.scan.nextLine();
      if (play.equals("yes") || play.equals("Yes")){
        System.out.print("ok");
      } else if (play.equals("No") || play.equals("no")) {
        System.out.print("you have played " + app.game.runs + " times. you have won "+app.game.pwins+" times. you have lost "+app.game.cwins+" times. you have tied "+app.game.ties+" times.");
        x = false;
      }        
    }
  }
  static void output_winner(int winner){
    System.out.println("the winner was" + winner);
  }
}