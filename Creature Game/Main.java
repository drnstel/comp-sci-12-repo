public class Main {
    public static void main(String[] args) {

        // set up the creatures
        FireType myFireType = new FireType("a");
        WaterType myWaterType = new WaterType("b");
        GrassType myGrassType = new GrassType("c");

        FireType enemyFireType = new FireType("a");
        WaterType enemyWaterType = new WaterType("b");
        GrassType enemyGrassType = new GrassType("c");

        Creature[] myCreatures = {myFireType, myWaterType, myGrassType};
        Creature[] enemyCreatures = {enemyFireType, enemyWaterType, enemyGrassType};


        // set up the battle
        BattleSystem battleSystem = new BattleSystem();

        // run the battle
        battleSystem.battle(myCreatures, enemyCreatures);
    }
}
