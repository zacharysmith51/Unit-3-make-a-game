package net.vtcpemba.hokiezack.CSA;

import javax.swing.*;
import java.awt.event.*;
/**
 * @author Zachary Smith
 * @since version 0.2.0 (11/16/2020)
 */
public class GUI {
  /**
   * @since version 0.2.2 (11/16/2020)
   */
  JFrame frame;
  /**
   * @since version 0.2.2 (11/16/2020)
   */
  int width;
  /**
   * @since version 0.2.2 (11/16/2020)
   */
  int hight;
  /**
   * @since version 0.2.2 (11/16/2020)
   */
  public GUI(){
    width = 300;
    hight = 300;
    frame = Jframe("Rock Paper Scissors "+App.version);
  }
  /**
   * @param name Jframe name
   * @since version 0.2.2 (11/16/2020)
   */
  public GUI(String name){
    width = 300;
    hight = 300;
    frame = Jframe(name+App.version);
  }
  /**
   * @param width set JFrame width
   * @param hight set JFrame hight
   * @since version 0.2.2 (11/16/2020)
   */
  public GUI(int width, int hight){
    width = 300;
    hight = 300;
    frame = Jframe("Rock Paper Scissors "+App.version);
  }
  /**
   * @param name Jframe name
   * @param width set JFrame width
   * @param hight set JFrame hight
   * @since version 0.2.2 (11/16/2020)
   */
  public GUI(int width, int hight,String name){
    width = 300;
    hight = 300;
    frame = Jframe(name+App.version);
  }
  /**
   * @since version 0.2.2 (11/16/2020)
   */
  public void startGUI(){
    System.out.print("gui class is working");
  }
}