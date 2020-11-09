package net.vtcpemba.hokiezack.CSA;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    static Scanner scan = new Scanner(System.in);
    public static void main( String[] args )
    {
        Game game = new Game();
        System.out.println("Do You want to play Rack Paper Scissors?");
        String play = scan.nextLine();
        game.run();
        if (play == "yes" || play == "Yes"){
            game.run();
        }
    }
}
