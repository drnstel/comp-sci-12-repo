
public class Main {
    public static void main(String[] args) {
        /*
            Going to be covering:
            - Control Flow

            If statements, switch cases, loops (while, for, do-while)
        */

        // If statements

        // int x = 5;
        // if (x == 1) {
        //     System.out.println("x was 1");
        // } else if (x == 3) {
        //   System.out.println("x was 3");  
        // } else {
        //     System.out.println("x was not 1 or 3");
        // }

        // Switch case

        // int x = 3;
        // switch (x) { // x is the var that decides which code will run
        //     case 1:
        //         System.out.println("x is 1");
        //         break; // break is used to exit the switch statement
        //     case 2:
        //         System.out.println("x is 2");
        //         break;
        //     case 3:
        //         System.out.println("x is 3");
        //         break;
        //     default: // default is used if none of the cases match
        //         System.out.println("x is not 1, 2, or 3");
        //         break;             
        // }

        // While loop

        // int i = 0;
        // while (i < 10) {
        //     System.out.println(i);
        //     i++;
        // }
        
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Please enter your name.");
        // String input = scn.nextLine();

        // while (input == "") {
        //     System.out.println("Please enter your name.");
        //     input = scn.nextLine();
        // }

        // do-while loop

        // String input;
        // Scanner scn = new Scanner(System.in);

        // do { 
        //     System.out.println("Please enter your name.");
        //     input = scn.nextLine();
        //     if (true) {
        //         System.out.println(input);
        //     }
        // } while (input == "");

        // For loop

        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }

        // As a note

        String name = "H";                      // one String object that contains H
        String newname = new String("H");       // a DIFFERENT String object that contains H

        if (name.equals(newname)) { // You should use variable.equals(other_variable), as it will compare the contents of the variable rather the memory addresses.
            System.out.println("It is equal");
        }
    }
}