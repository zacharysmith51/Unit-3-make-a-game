package net.vtcpemba.hokiezack.CSA;
/**
 * Main Game logic
 * 
 * @author Zachary Smith
 * @version 0.2-SNAPSHOT
 * @since 11/9/2020
 */
public class Game {
  /**
   * @since 11/16/2020
   */
  public int runs = 0;
  /**
   * @since 11/16/2020
   */
  public int pwins = 0;
  /**
   * @since 11/16/2020
   */
  public int cwins = 0;
  /**
   * @since 11/16/2020
   */
  public int ties = 0;

  /**
   * selection of computers move
   * @return int this returns the computers move
   */
  int selectMove() {
    int RN = (int) (Math.random() * 3);
    return RN;// 0 = rock, 1 = paper, 2 = Scissors
  }

  /**
   * Player move input
   * 
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
   * @param GUI set if useing GUI
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
  /**
   * the code to check who wins
   * @param P1 first player/computer input
   * @param P2 second player input
   * @return returns the winner
   * @since 11/9/20
   */
  int checkWinner(int P1, int P2) {
    /* 0 = tie, 1 = Computer win, 2 = Player win, 4 = error */
    if (P1 == 0 && P2 == 0) {
      return 0;
    } else if (P1 == 0 && P2 == 1) {
      return 2;
    } else if (P1 == 0 && P2 == 2) {
      return 2;
    } else if (P1 == 1 && P2 == 0) {
      return 2;
    } else if (P1 == 1 && P2 == 1) {
      return 0;
    } else if (P1 == 1 && P2 == 2) {
      return 2;
    } else if (P1 == 2 && P2 == 0) {
      return 2;
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
    } else if (winner == 4 || winner == 3){
      System.out.println("!!!logic error!!!");
    }
    return winner;
  }
}
