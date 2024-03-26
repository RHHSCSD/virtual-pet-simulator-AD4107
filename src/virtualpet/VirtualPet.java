/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpet;
import java.util.*;
/**
 *
 * @author michael.roy-diclemen
 */
public class VirtualPet {

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
    public static void main(String[] args) {
        
//Main Menu Screen        
        Scanner lol = new Scanner (System.in);
        System.out.println("    /\\_____/\\      MAIN MENU\n" +
"   /  o   o  \\\n" +
"  ( ==  ^  == )    Start (1)\n" +
"   )         (     Introductions (2)\n" +
"  (           )    Exit (3)\n" +
" ( (  )   (  ) )\n" +
"(__(__)___(__)__)\n" +
"");
       
        int startScreenNum = lol.nextInt();
        switch(startScreenNum){
            
            //Login System
            case 1:
                System.out.println("What is your user: ");
                String user = lol.next();
                
                if (user.equals("snoopy")){
                   System.out.println("What is your password: ");
                   String password = lol.next();
                   
                   if (password.equals("toto")){
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
                    else if (nameType == 2){
                        System.out.println("");
                    }
                    else if (nameType > 2 || nameType < 1){
                        System.out.println("Invalid input");
                        System.exit(0);
                    }
                    
                break;
                   }
                }
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
