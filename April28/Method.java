public class Method {
    static void method(int m, int n) {
        int i = m;

        System.out.println(i);
        while (i < n) {
            i++;
            System.out.println(i);
        }
    }

    static int[] createArray(int m, int n) {
        int end = n - 1;
        int[] array = new int[end];
        int index = 0;
        int start = m;

        while (index < end) {
            array[index] = start + index;
            index++;
        }

        return array;
    }
}
