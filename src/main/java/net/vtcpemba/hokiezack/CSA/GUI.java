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
  int height;
  /**
   * @since version 0.2.2 (11/16/2020)
   */
  JButton b_rock = new JButton("Rock");
  JButton b_paper = new JButton("Paper");
  JButton b_scissors = new JButton("Scissors");
  public GUI(){
    width = 300;
    height = 300;
    frame = JFrame("Rock Paper Scissors "+App.version);
  }
  /**
   * @param name Jframe name
   * @since version 0.2.2 (11/16/2020)
   */
  public GUI(String name){
    width = 300;
    height = 300;
    frame = JFrame(name+App.version);
  }
  /**
   * @param width set JFrame width
   * @param height set JFrame hight
   * @since version 0.2.2 (11/16/2020)
   */
  public GUI(int width, int height){
    width = 300;
    height = 300;
    frame = JFrame("Rock Paper Scissors "+App.version);
  }
  /**
   * @param name Jframe name
   * @param width set JFrame width
   * @param height set JFrame hight
   * @since version 0.2.2 (11/16/2020)
   */
  public GUI(int width, int height,String name){
    width = 300;
    height = 300;
    frame = JFrame(name+App.version);
  }
  /**
   * @since version 0.2.2 (11/16/2020)
   */
  public void startGUI(){
    System.out.print("gui class is working");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(b_rock);
    frame.getContentPane().add(b_paper);
    frame.getContentPane().add(b_scissors);
    frame.setSize(width, height);
    frame.setVisible(true);
  }
}