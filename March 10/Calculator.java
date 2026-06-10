import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
            Write a calculator program in your main method (+, -, *, /)

            Scanner variable = new Scanner(System.in); | Definte this once at the start

            String text = scn.nextLine(); | gets user String
            int number = scn.nextInt(); | gets user int
            float float_num = scn.nextFloat(); | gets user float
        */

        Scanner scn = new Scanner(System.in);
        // System.out.println("What operation would you like to do?\n> ");
        // String input = scn.nextLine();
        String input;
        char[] operationArray = {'+', '-', '*', '/'};
        char value = '\0';

        // if (input.length() == 1) { // https://stackoverflow.com/questions/72132486/how-do-you-check-if-the-user-input-is-a-single-char
        //     value = input.charAt(0);
        // } 

        while (value == '\0') { // https://stackoverflow.com/questions/27200854/how-to-check-whether-an-element-of-a-character-array-is-empty

            System.out.println("What operation would you like to do? (+|-|*|/)");
            input = scn.nextLine();

            if (input.length() == 1) { // https://stackoverflow.com/questions/72132486/how-do-you-check-if-the-user-input-is-a-single-char
                value = input.charAt(0);
            } else {
                System.out.println("That was NOT an operation.");
            }


            if (Character.isAlphabetic(value)) {
                System.out.println("That was NOT an operation.");
                value = '\0'; // https://stackoverflow.com/questions/4047808/what-is-the-best-way-to-tell-if-a-character-is-a-letter-or-number-in-java-withou
            } else if (Character.isDigit(value)) {
                System.out.println("That was NOT an operation.");
                value = '\0';
            };

            for (int i = 0; i < operationArray.length; i++) {
                if (value == operationArray[i]) {
                    break;
                } 
            }
        }

        float number1;
        float number2;
        float answer;

        switch (value) {
            case '+':
                System.out.println("Enter first number:");
                number1 = scn.nextFloat();

                System.out.println("Enter second number:");
                number2 = scn.nextFloat();

                answer = number1 + number2;

                System.out.println("Your answer is: " + answer);
                break;

            case '-':
                System.out.println("Enter first number:");
                number1 = scn.nextFloat();

                System.out.println("Enter second number:");
                number2 = scn.nextFloat();

                answer = number1 - number2;

                System.out.println("Your answer is: " + answer);
                break;

            case '*':
                System.out.println("Enter first number:");
                number1 = scn.nextFloat();

                System.out.println("Enter second number:");
                number2 = scn.nextFloat();

                answer = number1 * number2;

                System.out.println("Your answer is: " + answer);
                break;

            case '/':
                System.out.println("Enter first number:");
                number1 = scn.nextFloat();

                System.out.println("Enter second number:");
                number2 = scn.nextFloat();

                answer = number1 / number2;

                System.out.println("Your answer is: " + answer);
                break;
        }
    }
}
    
