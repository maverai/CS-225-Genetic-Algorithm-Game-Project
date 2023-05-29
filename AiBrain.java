//****************************************
// Author: Ayse Okatan
// Date Created: Nov 18, 2022
// Assignment: P5
//
// Purpose: 
//
// Attributes: pool, square.
// Methods:  
//****************************************
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class AiBrain {

   //public Calculator pool;
   //public Calculator square;
    public Genome g;
    //public static boolean status; //Game status that resets to menue screen 


    public void printMainMenu()throws InterruptedException {
		String message = "Welcome to the Artificial Intelligence Genome Calculator! \nTo get the statistics of your first child we first need to know what kind of traits the parents possess... \nPlease select if you would like to customize your parents or have them automatically generated.";
		char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            Thread.sleep(30);
        }
        System.out.println("\n\nC: Custom \n");
		System.out.println("R: Random \n");
		System.out.print("Type the letter associated: \n");
	}

    public void printCustomMenu()throws InterruptedException{
        String custMessage = "One by one enter each number of charactaristics you would like to add to your father parent.   \n";
        char[] chars = custMessage.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            Thread.sleep(40);
        }
        Genome genes = new Genome();
        genes.physGene();
    }

    public void printRandomMenu()throws InterruptedException{
        String ranMessage = "Here are the traits and charactaristics of your randomly generated parents:";
        char[] chars = ranMessage.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            Thread.sleep(40);
        }

    }

    public void runAiBrainMenus(){
        Scanner scan = new Scanner(System.in);
		String s; char c;
    
        try { printMainMenu(); } catch (InterruptedException e) { e.printStackTrace(); }

        s = scan.next(); c = s.charAt(0);	
	    if (Character.isDigit(c)) { scan.close(); throw new IllegalArgumentException("Sorry... you have to enter a letter.");}
        
			switch (c) {
				case 'C' , 'c': System.out.println("You have selected the Custom parent option.");
                    try { printCustomMenu(); } catch (InterruptedException e) { e.printStackTrace(); } break;
                case 'R' ,'r': System.out.println("You have selected the Custom parent option.");
                    try { printRandomMenu(); } catch (InterruptedException e) { e.printStackTrace(); } break;
                //case 'X': System.out.println("The AI is confused... taking you back to the main");
                //    try {
                //        printMainMenu();
                //    } catch (InterruptedException e) {
                //        e.printStackTrace();
                //    }
                //    break;
            }
    }
    
}
