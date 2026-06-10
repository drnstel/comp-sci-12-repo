public class Main {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        Birthday bday1 = new Birthday(1, 2);

        Birthday bday2 = new Birthday(5, 17);

        Birthday bday3 = bday2;

        System.out.println(bday1);
        System.out.println(bday2);
        System.out.println(bday3);

        bday2.day = 12;
        bday2.month = 4;
        System.out.println(bday3.day);

        String a = "hello";
        String[] arr = {a, "hello"};
        System.out.println(arr[0] == arr[1]);
    }
}