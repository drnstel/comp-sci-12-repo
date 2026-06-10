// import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // ----- PRIMITIVE TYPES -----
        // Integer types
        byte b = 127; // 1 byte
        short s = 32767; // 2 bytes
        int i = 837623; // 4 bytes
        long l = 1237874L; // 8 bytes
        
        // Decimal types
        float f = 123.283f; // 4 bytes
        double d = 3234.1237; // 8 ytes

        // Other types
        boolean bo = true; // 1 byte
        char c = 'f'; // 2 bytes

        /*
            "formula" for assigning primitive types:
            [DataType] [variable name] = [byte];
        */

        /*
            If a value is not assigned an initial value, it is uninitialized.
        */

        /*
            Primitive datatypes have lowercase first letters.
            Reference datatypes have uppercase first letters. 
        */

        String str = "hello"; // String
        
        int[] ia = {4, 6, 1, 0, 6}; // Arrays
        ia[0]= 100;

        float[] fa = new float[5];
        String[] sa = new String[100];

        sa[0] = "no";
        sa[4] = "yes";

        int j = 0;
        while (j < 5) {
            System.out.println(sa[j]);

            j++; 
        }

        // Strings and arrays are SPECIAL
        String anotherString = "Define this string directly";
        double[] doubleArray = new double[9];

        // Most reference types are NOT special
        // Scanner scanner = new Scanner(); // Scanner (A class that allows you to get input)
        ArrayList myGreatPythonList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        /* 
            "formula" for assigning a value to reference types:
            [DataType] [variable name] = new DataType(); 
        */

        /*
            If a value is not assigned an initial value, it is uninitialized.
        */


    }

}