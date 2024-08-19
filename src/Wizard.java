public class Wizard extends Fighter {

    public boolean spellPrepared = false;

    public void prepareSpell(){
        this.spellPrepared = true;
    }

    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    public int damagePoints(Fighter opponent) {
        if(spellPrepared){
            return 12;
        }
        return 3;
    }
}
