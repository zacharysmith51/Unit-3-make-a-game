package net.vtcpemba.hokiezack.CSA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Zachary Smith
 * @since version 0.2.0 (11/16/2020)
 * @version 0.2.3
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
  /**
   * @since version 0.2.2 (11/16/2020)
   */
  JButton b_rock = new JButton("Rock");
  JButton b_paper = new JButton("Paper");
  JButton b_scissors = new JButton("Scissors");
  JTextField textField = new JTextField();
  public GUI(){
    width = 300;
    height = 300;
    name = "Rock Paper Scissors ";
  }
  /**
   * @param Name Jframe name
   * @since version 0.2.2 (11/16/2020)
   */
  public GUI(String Name){
    width = 300;
    height = 300;
    name = Name;
  }
  /**
   * @param Width set JFrame width
   * @param Height set JFrame hight
   * @since version 0.2.2 (11/16/2020)
   */
  public GUI(int Width, int Height){
    width = Width;
    height = Height;
    name = "Rock Paper Scissors ";
  }
  /**
   * @param Name Jframe name
   * @param Width set JFrame width
   * @param Height set JFrame hight
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
  class b_RockListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      App.game.enterMove(true,"rock");
    }
  }
  class b_PaperListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      App.game.enterMove(true,"paper");
    }
  }
  class b_ScissorsListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      App.game.enterMove(true,"scissors");
    }
  }
}