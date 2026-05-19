public class Creature {
    private float health = 100f;
    private String name;
    protected String action;
    protected int[] attacks = {0,1,2,3}; // Attacks 1-4, writen in indices.
    protected int critRate;
    protected String[] statusEffects = new String[4];
    public String type;

    public Creature(String name, float health) {
        this.name = name;
        this.health = health;
    }

    public Creature() {
    }

    public String getName() {
        return name;
    }


    // Returns the damage done by the Creature
    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked with power " + power + "!";
        return power;
    }

    public void defend(float incomingPower) {

        // 10 % chance of reducing damage taken
        if (Rand.randomInt(0, 10) < 1) {
            incomingPower = incomingPower * 0.8f;
            action = name + " defended and reduced damage taken to " + incomingPower;
        }
        else
        {
            action = name + " did not defend.";
        }

        health -= incomingPower;
    }

    public String readAction() {
        return action;
    }

    @Override
    public String toString() {
        return getClass() + "{name: " + name + ", health: " + health + "}";
    }
}

class FireType extends Creature {
    // Attacklist is formatted this way: Attack name / type, 
    // General damage range from 0 - the number, which is then divided by a fixed number, UNLESS it rolls a number higher than crit rate, in which it will not be divided and do the full damage (crit chance), 
    // fixed number, 
    // chance of hitting.
    private String[][] attackList = { {"DoT", "21", "40", "4"}, {"AoE", "36", "70", "8"} };

    public FireType(String name, float health) {
        super(name, health);
        super.critRate = Rand.randomInt(60, 99);
    }

    @Override
    public float attack() {

        int randomizer = Rand.randomInt(0, 2); // generates betweek 0 - 3
        String attackName = attackList[randomizer][0];
        int attackDamage = Integer.parseInt(attackList[randomizer][1]);
        int attackChance = Integer.parseInt(attackList[randomizer][3]);

        if (Rand.randomInt(0, 10) >= attackChance) {
            action = getName() + " missed using a" + attackName + " attack!";
            return 0;
        }

        if (Rand.randomInt(0, 100 ) > critRate) {
            action = getName() + " attacked using " + attackName + "and hit the opponent for " + attackDamage + "!";
            return attackDamage;
        } else {
            return attackDamage / Integer.parseInt(attackList[randomizer][2]);
        }
    }
}

class WaterType extends Creature {
    public WaterType(String name, float health) {
        super(name, health);
    }

    @Override
    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked with power " + power + "!";
        return power;
    }
}

class GrassType extends Creature {
    public GrassType(String name) {
        super.health = 100;
        super.name = name;
    }

    @Override
    public float attack() {

        // 20% chance of missing
        if (Rand.randomInt(0, 10) < 2) {
            action = name + " missed!";
            return 0;
        }

        // otherwise, do damage between 10-20
        float power = Rand.randomFloat(10, 20);
        action = name + " attacked with power " + power + "!";
        return power;
    }
}