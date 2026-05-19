public class Recursion {
    public float power(float base, int exponent) {
        if ( exponent == 0 ) {
            return 1;
        }

        return base * power(base, exponent-1);
    }

    public int summation(int end) {
        if (end == 1) {
            return 1;
        }

        return end + summation(end - 1);
    }

    public int factorial(int value) {
        if (value == 0) {
            return 1;
        }

        return value * factorial(value-1);
    }

    public int fibonnaci(int term) {
        if (term == 0 ) {
            return 0;
        } else if (term == 1) {
            return 1;
        }

        return fibonnaci(term - 1) + fibonnaci(term - 2);
    }

    public boolean palindrome(String word) {
        if (word.length() <= 1 ) {
            return true;
        }

        if (word.charAt(0) != word.charAt(word.length()-1)) {
            return false;
        }

        return palindrome(word.substring(1, word.length()-1));
    }
}