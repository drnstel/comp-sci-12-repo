public class Main {
    public static void main(String[] args) {
        String s = "abcdef";
        String t = "ajsdjnhd";
        String u = "aksjdbha";

        // System.out.println(s.charAt(0));

        Birthday bday = new Birthday();

        bday.setMonth(14);

        bday.setDay(15);

        System.out.println(bday.getMonth());
        System.out.println(bday.getDay());
    }
}