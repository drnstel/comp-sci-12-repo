import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // #1
        int i = 0;
        while (i < 100) {
            i++;
            System.out.println(i);
        }

        // #2
        Method.method(14, 67);

        // #3
        int[] array = Method.createArray(2, 61);
        System.out.println(Arrays.toString(array));
    }
}