package net.vtcpemba.hokiezack.CSA;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static final String version = "0.2.2-SNAPSHOT";
	static Scanner scan = new Scanner(System.in);
    Game game = new Game();
    static Cli cli = new Cli();
    static GUI gui = new GUI();
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
        //gui.startGUI();//temp dev code
      }/* else if (args[0] == "true"){
        display_gui = true;
        gui.run();
      }*/
    }
}
