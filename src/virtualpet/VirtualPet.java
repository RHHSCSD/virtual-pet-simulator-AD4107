/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpet;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author michael.roy-diclemen
 */
public class VirtualPet {

    
    final String vowels = "aeiou";
    
    /**
     * @param args the command line arguments
     */
    
    /*
    /\_____/\
   /  o   o  \
  ( ==  ^  == )
   )         (
  (           )
 ( (  )   (  ) )
(__(__)___(__)__)
    */
    //public class InputDialogBox()
    public static void main(String[] args) {
        
//Main Menu Screen        
        Scanner lol = new Scanner (System.in);
        Random sui = new Random();
        System.out.println("    /\\_____/\\      MAIN MENU\n" +
"   /  o   o  \\\n" +
"  ( ==  ^  == )    1) Start\n" +
"   )         (     2) Instructions\n" +
"  (           )    3) Exit\n" +
" ( (  )   (  ) )\n" +
"(__(__)___(__)__)\n" +
"");
       
        int startScreenNum = lol.nextInt();
        switch(startScreenNum){
            
            //Login System
            case 1:
                //ask for user
                System.out.println("What is your user: ");
                
                final String realUser = "snoopy";
                final String realPass = "toto";
                
                for (int userTries = 3; userTries>0; userTries--){
                    String user = lol.next();
                    if (user.equals(realUser)){
                        System.out.println("What is your password: ");
                        for (int i = 3; i>0; i--){
                    String pass = lol.next();
                    if (pass.equals(realPass)){
                        System.out.println("Re-enter your password: ");
                        break;
                    }
                    else{
                        System.out.println("Wrong password. You have " + (i-1) + " tries left.");
                        if (i-1==0){
                        System.exit(0);
                        break;
                        }
                        else{
                        continue;
                        }
                    }
                }break;
                    }
                    else{
                        System.out.println("Wrong user. You have " + (userTries-1) + " tries left.");
                        if (userTries-1 == 0){
                            System.exit(0);
                            break;
                        }
                        else{
                        continue;
                        }
                    }
                }
                
                
               // if (user.equals(realUser)){
                   //System.out.println("What is your password: ");
                   String password = lol.next();

                   if (password.equals(realPass)){
                       //Select Pet
                       System.out.println("You can select a pet: Cat (1)   Dog (2)   Bird (3)");
                       
                // Choosing names for pet
                int petNum = lol.nextInt();
                    switch(petNum){
                        case 1:
                            System.out.println("You chose the cat! Do you want to type (1) in the name or random generate (2)?");
                            break;
                        case 2:
                            System.out.println("You chose the dog! Do you want to type (1) in the name or random generate (2)?");
                            break;
                        case 3:
                            System.out.println("You chose the bird! Do you want to type (1) in the name or random generate (2)?");
                            break;
                    }
                    
                    int nameType = lol.nextInt();
                    if (nameType == 1){
                        System.out.println("What would you like your pet to be called: ");
                        String petName = lol.next();
                        System.out.println("Your pet, named " + petName + ", has been born!");
                    }
                    if (nameType == 2){
                        //Double letters thing
                        String vowels = "aeiou";
                        int x = (int)(sui.nextInt(5));
                        char y = vowels.charAt(x);
                        String consonants = "bcdfghjklmnpqrstvwxyz";
                        int x1 = (int)(sui.nextInt(21));
                        char y1 = consonants.charAt(x1);
                        String consonant = y1 + "";
                        
                        int z = (int)(sui.nextInt(2));
                        String vowel = y + "";
                        if (z == 0){
                            vowel = y + "";
                        }
                        else if (z == 1){
                            vowel = y + "" + y;
                        }
                        String petName = consonant + vowel + consonant + vowel;
                        System.out.println("You pet, named " + petName + ", has been born!");
                    }
                    else if (nameType > 2 || nameType < 1){
                        System.out.println("Invalid input");
                        System.exit(0);
                    }
                    
                    //Pet stats
                    int points = 20;
                    int health = (int)(sui.nextInt(20) + 1);
                    int food = (int)(sui.nextInt(20-health) + 1);
                    int energy = 20-health-food;
                    System.out.println("Your pet has " + health + " health, " + food + " food, and " + energy + " energy.");
                    
//---------------------------------------------------------------------------------------------------------------------------//

                    //Earning money
                    System.out.println("    /\\_____/\\      MAIN MENU\n" +
"   /  o   o  \\\n" +
"  ( ==  ^  == )    1) Play/Interact\n" +
"   )         (     2) Instructions\n" +
"  (           )    3) Exit\n" +
" ( (  )   (  ) )\n" +
"(__(__)___(__)__)\n" +
"");
                    int gold = 0;
                    int menuNum = lol.nextInt();
                    System.out.println("Games: ");
                    System.out.println("1) Number Guessing Game");
                    System.out.println("2) Matching Game");
                    switch (menuNum){
                        case 1:
                            int gameChoice = lol.nextInt();
                    if (gameChoice == 1){
                        //Guessing game
                    System.out.println("Guess a number between 1 and 100");
                    int randomNumber = sui.nextInt(100)+1;
                    int numOfTries = 5;
                        for (int i = numOfTries; i>0; i--){
                            int guessNumber = lol.nextInt();
                            
                            if (randomNumber < guessNumber){
                                System.out.println("Number is too high");
                                System.out.println("You have " + (i-1) + " tries left.");
                            }
                            else if (randomNumber > guessNumber){
                                System.out.println("Number is too small");
                                System.out.println("You have " + (i-1) + " tries left.");
                            }
                            else if (randomNumber == guessNumber){
                                System.out.println("You got the right number");
                                gold = gold+50;
                                break;
                            }
                    }
                        System.out.println("You earned " + gold + " gold!");
                    }
                    else if (gameChoice == 2){
                        //Matching Game
                        String the10Letters = "aabbccddeeff";
                        
                        for (int i = 0; i<10; i++){
                            
                        }
                    }
                    return;
                        case 2:
                            System.out.println("Instructions");
                        case 3:
                    }
                    
                    
                    
                    
                    
                break;
                   }
                //}
                else{
                    System.out.println("Invalid input");
                    System.exit(0);
                }
                
            case 2:
                System.out.println("Instructions: ");
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }
        
    }
    
}
