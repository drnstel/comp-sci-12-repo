import java.util.Scanner;

public class BattleSystem {
    private Scanner input = new Scanner(System.in);
    private int count = 0;
    private boolean cont = true;

    private Creature myCreature;
    private Creature enemyCreature;

    public void selectCreature(Creature[] creatureListOne) {
        int selection = 0;
        if (myCreature == null) {
            System.out.println();
            selection = input.nextInt();
        }

        myCreature = creatureListOne[selection];
    }

    public void battle(Creature[] creatureListOne, Creature[] creatureListTwo) {
        if (enemyCreature == null) {
            int sel = Rand.randomInt(0, 3);
            enemyCreature = creatureListTwo[sel];
        }

        while (cont) {
            count += 1;
            System.out.println("TURN " + count);
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

            float attackPower = myCreature.attack();
            enemyCreature.defend(attackPower);

            if (myCreature.health < 0) {
                cont = false;
                System.out.println("Creature B has won!");
                System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                break;
            } else if (enemyCreature.health < 0) {
                cont = false;
                System.out.println("Creature A has won!");
                System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                break;
            }

            System.out.println(myCreature.readAction());
            System.out.println(enemyCreature.readAction());

            System.out.println(myCreature);
            System.out.println(enemyCreature);

            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println("Press any key to play next turn.");
            input.nextLine();

            // swap turns
            Creature temp = myCreature;
            myCreature = enemyCreature;
            enemyCreature = temp;
        }
    }
}
