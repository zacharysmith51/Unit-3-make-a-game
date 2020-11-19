package net.vtcpemba.hokiezack.CSA;
/**
 * console interface
 * 
 * @author Zachary Smith
 * @version 0.2.3
 * @since 11/9/2020
 */
public class Cli {
  App app = new App();
  public  void run(){
    boolean x = true;
    while (x) {
      int cmove = App.game.selectMove();
      int pmove = App.game.enterMove();
      output_winner(App.game.updateStats(App.game.checkWinner(cmove, pmove)), cmove);
      System.out.println("do you want to play again");
      String play = App.scan.nextLine();
      switch (play) {
        case "Yes":
        case "yes":
        case "Y":
        case "y":
          System.out.println("ok");
          break;
        case "No":
        case "no":
        case "N":
        case "n":
          System.out.print("you have played " + App.game.runs + " times. you have won " + App.game.pwins + " times. you have lost " + app.game.cwins + " times. you have tied " + app.game.ties + " times.");
          x = false;
          break;
      }
    }
  }
  static void output_winner(int winner, int cmove ){
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