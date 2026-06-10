public class Card {
    private int value;

    // Define a copy constructor
    public Card(Card original) {
        this.value = original.value; // no heap considerationss
    }

    public Card(int value) {
        this.value = value;
    }
}