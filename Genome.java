
//****************************************
// Author: Ayse Okatan
// Date Created: Nov 18, 2022
// Assignment: P5
//
// Purpose: 
//
// Attributes: phys[], mental[], description.
// Methods: createPhys, createMental.
//****************************************
import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Genome {

    private boolean[] selectedBool;
    static String[] printPhys = { "x"," Cancer", " Dwarfism", " Albino", " Back Acne", " Mutated Toe", " Glaucoma", " Scoliosis", " Fetal Alchohol Syndrome", " Bodybuilding Genetics"};   //Assigning physical Conditions
    static String[] printMental = { "x"," Down Syndrome", " ADHD", " Schizophrenia", " Depression", " Cerebral Palsy", " Alzheimers", " Eating Disorder", " Addiction", " Multiple Personality"};  //Assigning mental Conditions
    static String[] printEyes = {"Blue", "Green", "Brown", "Hazel", "Black"};
    static String[] printHair = {"White", "Black", "Brown", "Blonde", "Blue"}; 
    static String[] printBody = {"Ecto-Morph", "Meso-Morph", "Endo-Morph"};
    //public AiBrain ai;

    public void randomGene(){   //only needed for UserAuto() class
        selectedBool = new boolean[30];

        Random rd = new Random();
        for (int i = 0; i < selectedBool.length; i++ ){
            selectedBool[i] = rd.nextBoolean();
        }
    }
    
    public void physGene()throws InterruptedException{
        
        int num[] = new int[9];
            for(int i = 1; i < num.length ; i++){
                System.out.println(i + printPhys[i]);
            }
        String custMessage = "When you are done selecting, press 0 and enter.   \n";
        char[] chars = custMessage.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            Thread.sleep(40);
        }
        physScan();
    }
    
    

    public void mentalGene()throws InterruptedException{
        
        int num[] = new int[10];
            for(int i = 1; i < num.length ; i++){
                System.out.println(i + printMental[i]);
            }
            
        String custMessage = "When you are done selecting, press 0 and enter.   \n";
        char[] chars = custMessage.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            Thread.sleep(40);
        }
        mentalScan();
    }


    // Setting the static array attributes that represent gronomic charactaristics to boolean
  
    public static void physScan() {
        
        Scanner scan = new Scanner(System.in);
        
        int[] userInput = new int[9];
        try{ 
            for(int i=0; i<9; i++ ) { userInput[i] = scan.nextInt();    

            if (userInput[i] == 0){ boolean[] secondArray = new boolean[userInput.length];
                for (int j : userInput) { secondArray[j] = true; secondArray[0] = false;}
            
                ArrayList<String> physChoice = new ArrayList<>();
                    for (i= 0; i < 9; i++){
                        if(secondArray[i]) physChoice.add(printPhys[i]);}
                         System.out.println( (physChoice )) ; }}
                
                       

        }catch (Exception e) {
            
            //Displaying an error message for invalid user input
            System.out.println("\nInvalid input!");
         }
            
     }
 

    public static void mentalScan(){
        
        
        Scanner scan = new Scanner(System.in);
        
        int[] userInput = new int[9];
        try{ 
            for(int i=1; i<9; i++ ) { userInput[i] = scan.nextInt();    

            if (userInput[i] == 0){ boolean[] secondArray = new boolean[userInput.length];
                for (int j : userInput) { secondArray[j] = true; secondArray[0] = false;}
            
                ArrayList<String> mentalChoice = new ArrayList<>();
                    for (i= 0; i < 9; i++){
                        if(secondArray[i]) mentalChoice.add(printMental[i]);}}}
                      //   System.out.println(mentailChoice ) ; }}
        

        }catch (Exception e) {
            
            //Displaying an error message for invalid user input
            System.out.println("\nInvalid input!"); }
    
         }   

    }
