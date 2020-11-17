package net.vtcpemba.hokiezack.CSA;

import javax.swing.*;
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
  String name;
  JButton b_rock = new JButton("Rock");
  JButton b_paper = new JButton("Paper");
  JButton b_scissors = new JButton("Scissors");
  public GUI(){
    width = 300;
    height = 300;
    name = "Rock Paper Scissors ";
  }
  /**
   * @param name Jframe name
   * @since version 0.2.2 (11/16/2020)
   */
  public GUI(String Name){
    width = 300;
    height = 300;
    name = Name;
  }
  /**
   * @param width set JFrame width
   * @param height set JFrame hight
   * @since version 0.2.2 (11/16/2020)
   */
  public GUI(int Width, int Height){
    width = Width;
    height = Height;
    name = "Rock Paper Scissors ";
  }
  /**
   * @param name Jframe name
   * @param width set JFrame width
   * @param height set JFrame hight
   * @since version 0.2.2 (11/16/2020)
   */
  public GUI(int Width, int Height,String Name){
    width = Width;
    height = Height;
    name = Name;
  }
  /**
   * @since version 0.2.2 (11/16/2020)
   */
  public void startGUI(){
    frame = new JFrame("Rock Paper Scissors "+App.version);
    System.out.print("gui class is working");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(b_rock);
    frame.getContentPane().add(b_paper);
    frame.getContentPane().add(b_scissors);
    frame.setSize(width, height);
    frame.setVisible(true);
  }
  public void startGUI(int Width, int Height){
    this.width = Width;
    this.height = Height;
    frame = new JFrame("Rock Paper Scissors "+App.version);
    System.out.print("gui class is working");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(b_rock);
    frame.getContentPane().add(b_paper);
    frame.getContentPane().add(b_scissors);
    frame.setSize(width, height);
    frame.setVisible(true);
  }
}