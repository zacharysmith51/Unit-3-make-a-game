package net.vtcpemba.hokiezack.CSA;

import java.util.Scanner;
public class Cli {
  App app = new App();
  public  void run(){
    int x = 0;
      while (x < 3){
        int cmove = app.game.selectMove();
        int pmove = app.game.enterMove();
        app.game.updateStats(app.game.checkWinner(cmove, pmove));
        System.out.println("do you want to play again?");            String play = App.scan.nextLine();
        play = App.scan.nextLine();
        if (play.equals("yes") || play.equals("Yes")){
          System.out.print("ok");
          x=0;
        } else if (play == "No" || play == "no") {
          System.out.print(app.game.runs+" "+app.game.pwins+" "+app.game.cwins+" "+app.game.ties);
          break;
        }
        
      }
    }
}