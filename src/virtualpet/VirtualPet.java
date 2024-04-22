/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpet;

import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;

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
    public static void main(String[] args) throws Exception {
        Scanner lol = new Scanner(System.in);
        Random sui = new Random();
//Main Menu Screen        
        System.out.println("    /\\_____/\\    MAIN MENU\n"
                + "   /  o   o  \\\n"
                + "  ( ==  ^  == )    1) Start\n"
                + "   )         (     2) Instructions\n"
                + "  (           )    3) Exit\n"
                + " ( (  )   (  ) )\n"
                + "(__(__)___(__)__)\n"
                + "");

        int startScreenNum = lol.nextInt();
        switch (startScreenNum) {

            //game
            case 1:
                startGame();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Instructions: ");
                break;
            case 3:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid input");
                System.exit(0);
                break;
        }

    }

    //------------------------------------------------------------------------//
    //sign up
    public static void signUp() throws Exception {

        Scanner lol = new Scanner(System.in);
        Random sui = new Random();

        //ask for user
        System.out.println("What would you like your user to be: ");
        String user = lol.next();
        System.out.println("What would you like your password to be: ");
        String pass = lol.next();

        pets();
        petStats();
        earnMoney();

        File users = new File(user + ".txt");
        PrintWriter e = new PrintWriter(users);
        
        
        e.println(user);
        e.println(pass);
        e.println(pets());
        e.println(petStats());
        e.close();

    }

    //log in
    public static void startGame() throws Exception {

        Scanner lol = new Scanner(System.in);
        Random sui = new Random();

        //ask for user
        System.out.println("What is your user: ");
        String user = lol.next();
        File users = new File(user + ".txt");
        // PrintWriter print = new PrintWriter (users);

        if (!users.exists()) {
            System.out.println("User does not exist. Would you like to sign up? (1) Yes (2) No");
            int choice = lol.nextInt();
            if (choice == 1) {
                signUp();
            } else if (choice == 2) {
                return;
            } else if (choice > 2 || choice < 1) {
                System.out.println("Invalid input");
                System.exit(0);
            }
        } else if (users.exists()) {
            Scanner fileScan = new Scanner(users);
            fileScan.nextLine();
            String filePass = fileScan.nextLine();
            System.out.println("What is your password: ");
            for (int i = 3; i > 0; i--) {
                String pass = lol.next();

                if (pass.equals(filePass)) {
                    earnMoney();
                    break;
                } else {
//for (int userTries = 3; userTries>0; userTries--){                        
                    System.out.println("Wrong password. You have " + (i - 1) + " tries left.");
                    if (i - 1 == 0) {
                        System.exit(0);
                        break;
                    }
                    //    System.out.println("Wrong user. You have " + (userTries - 1) + " tries left.");
                    continue;
                }
            }

        }
    }

    //name Pet
    public static int pets() {
        Scanner lol = new Scanner(System.in);
        Random sui = new Random();
        int petNum = Integer.parseInt(JOptionPane.showInputDialog("You can select a pet: Cat (1)   Dog (2)   Bird (3)"));

        // Choosing names for pet
        //int petNum = lol.nextInt();
        switch (petNum) {
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
        if (nameType == 1) {
            System.out.println("What would you like your pet to be called: ");
            String petName = lol.next();
            System.out.println("Your pet, named " + petName + ", has been born!");
        }
        if (nameType == 2) {
            //Double letters thing
            String vowels = "aeiou";
            int x = (int) (sui.nextInt(5));
            char y = vowels.charAt(x);
            String consonants = "bcdfghjklmnpqrstvwxyz";
            int x1 = (int) (sui.nextInt(21));
            char y1 = consonants.charAt(x1);
            String consonant = y1 + "";

            int z = (int) (sui.nextInt(2));
            String vowel = y + "";
            if (z == 0) {
                vowel = y + "";
            } else if (z == 1) {
                vowel = y + "" + y;
            }
            String petName = consonant + vowel + consonant + vowel;
            System.out.println("You pet, named " + petName + ", has been born!");
        } else if (nameType > 2 || nameType < 1) {
            System.out.println("Invalid input");
            System.exit(0);
        }
        return nameType;
    }

    //pet stats
    public static int[] petStats() {
        Random sui = new Random();
        //Pet stats
        int points = 20;
        int health = (int) (sui.nextInt(20) + 1);
        int food = (int) (sui.nextInt(20 - health) + 1);
        int energy = 20 - health - food;
        System.out.println("Your pet has " + health + " health, " + food + " food, and " + energy + " energy.");

        int[] currentStats = new int[3];
        int[] maxStats = new int[3];

        //health
        currentStats[0] = (int) (sui.nextInt(20) + 1);
        //food
        currentStats[1] = (int) (sui.nextInt(20 - currentStats[0]) + 1);
        //energy
        currentStats[2] = 20 - currentStats[0] - currentStats[1];

        //max stats
        for (int i = 0; i < maxStats.length; i++) {
            maxStats[i] = 20;

        }
        return currentStats;
    }

    //Earning money
    public static void earnMoney() {
        Scanner lol = new Scanner(System.in);
        Random sui = new Random();
        //Earning money
        System.out.println("    /\\_____/\\      MAIN MENU\n"
                + "   /  o   o  \\\n"
                + "  ( ==  ^  == )    1) Play/Interact\n"
                + "   )         (     2) Instructions\n"
                + "  (           )    3) Exit\n"
                + " ( (  )   (  ) )\n"
                + "(__(__)___(__)__)\n"
                + "");
        int gold = 0;
        int menuNum = lol.nextInt();

        switch (menuNum) {
            case 1:

                System.out.println("Games: ");
                System.out.println("1) Number Guessing Game");
                System.out.println("2) Matching Game");
                int gameChoice = lol.nextInt();
                if (gameChoice == 1) {
                    //Guessing game
                    int a = guessingGame();
                    if (a == 1){
                        gold = gold + 100;
                    }
                    else if (a == 2){
                        gold = gold + 50;
                    }
                    else if (a == 3){
                        gold = gold + 25;
                    }
                    else{
                        gold = gold + 10;
                    }
                    System.out.println("You earned " + gold + " gold");
                    return;
                } else if (gameChoice == 2) {
                    //Matching Game
                    matchingGame();
                }
                return;
            case 2:
                JOptionPane.showMessageDialog(null, "Instructions");
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    //currency
    //play with pet
    public static int playWithPet(int playAmount) {
        int cost = 10;
        int playCost = cost * playAmount;
        return playCost;
    }

    //Feeding pet
    public static int feedPet(int feedAmount) {
        int cost = 15;
        int feedCost = cost * feedAmount;
        return feedCost;
    }

    //Groom pet
    public static int groomPet(int groomPet) {
        int cost = 15;
        int groomCost = cost * groomPet;
        return groomCost;

    }

    //guessing game
    public static int guessingGame() {
        Scanner lol = new Scanner(System.in);
        Random sui = new Random();

        System.out.println("Guess a number between 1 and 100");
        int randomNumber = sui.nextInt(100) + 1;
        int numOfTries = 5;
        int attemps = 0;
        for (int i = numOfTries; i > 0; i--) {
            int guessNumber = lol.nextInt();

            if (randomNumber < guessNumber) {
                System.out.println("Number is too high");
                System.out.println("You have " + (i - 1) + " tries left.");
                attemps++;
                continue;
            } else if (randomNumber > guessNumber) {
                System.out.println("Number is too small");
                System.out.println("You have " + (i - 1) + " tries left.");
                attemps++;
                continue;
            } else if (randomNumber == guessNumber) {
                System.out.println("You got the right number");
                break;
            }
            return attemps;
        }
        return attemps;
    }

    public static int matchingGame() {
        System.out.println("Matching game: ");
        String theLetters = "aabbccddee";
        int a = 0;
        return a;
    }

//    public static void userFiles() throws Exception {
//        File user = new File(user + ".txt");
//            PrintWriter e = new PrintWriter(user);
//            e.println("yes");
//            e.close();
//        }
//    }

}
