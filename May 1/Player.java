public class Player {
    private float health;

    private Card primaryCard;
    private Card secondaryCard;

    public Player(float startingHealth) {
        this.health = startingHealth;
        this.primaryCard = null;
        this.secondaryCard = null;
    }

    public Player(Player original) {
        this.health = original.health;
        this.primaryCard = original.primaryCard;
        this.secondaryCard = original.secondaryCard;
    }
}