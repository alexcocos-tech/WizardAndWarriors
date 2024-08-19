abstract class Fighter {

    public boolean isVulnerable(){
        return false;
    }
    public abstract int damagePoints(Fighter opponent);

    @Override
    public String toString(){
        return "The fighter is " + this.getClass().getSimpleName();
    }
}