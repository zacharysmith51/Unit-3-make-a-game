package net.vtcpemba.hokiezack.CSA;

import java.util.Scanner;

/**
 * Main Game logic
 * 
 * @author Zachary Smith
 * @version 0.2-SNAPSHOT
 */
public class Game {
  public int runs = 0;
  public int pwins = 0;
  public int cwins = 0;
  public int ties = 0;

  /**
   * 
   * @return int this returns the computers move
   */
  int selectMove() {
    int RN = (int) (Math.random() * 3);
    return RN;// 0 = rock, 1 = paper, 2 = Scissors
  }

  /**
   * Player move input
   * @return int this returns the players move
   */
  int enterMove() {
    if (App.display_gui == false) {
      System.out.println("rock, paper, or scissors");
    }
    String I1 = App.scan.nextLine();
    if (I1.equals("Rock") || I1.equals("rock")) {
      return 0;
    } else if (I1.equals("Paper") || I1.equals("paper")) {
      return 1;
    } else if (I1.equals("Scissors") || I1.equals("scissors")) {
      return 0;
    } else {
      System.out.println("not a valid anwser please choose another anwser");/* retry if invalid anwser */
      return enterMove();
    }
  }
  /**
   * 
   * @param GUI 
   * @param move bypass console
   * @return int this returns the players move
   */
  int enterMove(boolean GUI, String move) {
    if (GUI == false) {
      String I1 = App.scan.nextLine();
      if (I1.equals("Rock") || I1.equals("rock")) {
        return 0;
      } else if (I1.equals("Paper") || I1.equals("paper")) {
        return 1;
      } else if (I1.equals("Scissors") || I1.equals("scissors")) {
        return 0;
      } else {
        System.out.println("not a valid anwser please choose another anwser");/* retry if invalid anwser */
        return enterMove();
      }
    } else {
      String I1 = move;
      if (I1.equals("Rock") || I1.equals("rock")) {
        return 0;
      } else if (I1.equals("Paper") || I1.equals("paper")) {
        return 1;
      } else if (I1.equals("Scissors") || I1.equals("scissors")) {
        return 2;
      } else {
        System.out.println("not a valid anwser please choose another anwser");/* retry if invalid anwser */
        return enterMove();
      }
    }
  }

  int checkWinner(int P1, int P2) {
    /* 0 = tie, 1 = Computer win, 2 = Player win, 4 = error */
    if (P1 == 0 && P2 == 0) {
      return 0;
    } else if (P1 == 0 && P2 == 1) {
      return 3;
    } else if (P1 == 0 && P2 == 2) {
      return 2;
    } else if (P1 == 1 && P2 == 0) {
      return 2;
    } else if (P1 == 1 && P2 == 1) {
      return 0;
    } else if (P1 == 1 && P2 == 2) {
      return 3;
    } else if (P1 == 2 && P2 == 0) {
      return 3;
    } else if (P1 == 2 && P2 == 1) {
      return 2;
    } else if (P1 == 2 && P2 == 2) {
      return 0;
    } else {
      return 4;
    }
  }

  int updateStats(int winner) {
    runs++;
    if (winner == 0) {
      ties++;
    } else if (winner == 1) {
      cwins++;
    } else if (winner == 2) {
      pwins++;
    }
    return winner;
  }
}