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
        Scanner lol = new Scanner (System.in);
        System.out.println("    /\\_____/\\\n" +
"   /  o   o  \\     Start (1)\n" +
"  ( ==  ^  == )    Introductions (2)\n" +
"   )         (     Exit (3)\n" +
"  (           )\n" +
" ( (  )   (  ) )\n" +
"(__(__)___(__)__)\n" +
"");
        int startScreenNum = lol.nextInt();
        switch(startScreenNum){
            case 1:
                System.out.println("You can select pet two pets: Cat (1)   Dog (2)   Bird (3)");
                int petNum = lol.nextInt();
                    switch(petNum){
                        case 1:
                            System.out.println("You got a cat");
                            break;
                        case 2:
                            System.out.println("You got a dog");
                            break;
                        case 3:
                            System.out.println("You got a bird");
                            break;
                    }
                break;
            case 2:
                System.out.println("Instructions: ");
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.exit(0);
                break;
        }
        
    }
    
}
