package net.vtcpemba.hokiezack.CSA;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    static Scanner scan = new Scanner(System.in);
    Game game = new Game();
    static Cli cli = new Cli();
    static boolean display_gui = false; 
    public static void main( String[] args ){
      System.out.println("Do You want to play Rack Paper Scissors?");
      String play = scan.nextLine();
      App app = new App();
      if (play.equals("yes") == true || play.equals("Yes") == true){
            app.run();
        } 
    }
    void run(){
      cli.run();
    }
    // args[0] is display method
    void run(String[] args){
      if (args[0] == "false"){
        cli.run();
      }/* else if (args[0] == "true"){
        display_gui = true;
        gui.run();
      }*/
    }
}
