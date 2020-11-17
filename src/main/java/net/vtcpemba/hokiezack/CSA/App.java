package net.vtcpemba.hokiezack.CSA;

import java.util.Scanner;

/**
 * Main app lanching
 * 
 * @author Zachary Smith
 * @version 0.2.3
 * @since 11/9/2020
 */
public class App {
    public static final String version = "0.2.2-SNAPSHOT";
    static Scanner scan = new Scanner(System.in);
    Game game = new Game();
    static Cli cli = new Cli();
    static GUI gui = new GUI(400, 400);
    static String[] dargs = {"false"};
    static boolean display_gui = false;
    public static void main( String[] args ){
      System.out.println("Do You want to play Rack Paper Scissors?");
      String play = scan.nextLine();
      App app = new App();
      if (play.equals("yes") || play.equals("Yes")){
            app.run(dargs);
        } 
    }
    /*void run(){
      cli.run();
    }*/
    // args[0] is display method
    /**
     * Start function
     * @param args display arguments
     * @since 11/16/2020
     */
    void run(String[] args){
      if (args[0].equals("false")){
        cli.run();
        //gui.startGUI();//temp dev code
      }else if (args[0].equals("true")){
        display_gui = true;
        gui.startGUI();
      }
    }
}
