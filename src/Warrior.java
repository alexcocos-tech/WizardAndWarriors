public class Warrior extends Fighter {

    @Override
    public int damagePoints(Fighter opponent) {
        if (opponent.isVulnerable()){
            return 10;
        }
        return 6;
    }

}
