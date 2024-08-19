//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Fighter warrior = new Warrior();
        Fighter wizard = new Wizard();

        System.out.println(warrior.toString());
        System.out.println(wizard.toString());

        System.out.println(warrior.isVulnerable());
        System.out.println(wizard.isVulnerable());

        ((Wizard) wizard).prepareSpell();
        System.out.println(wizard.isVulnerable());

        System.out.println(((Wizard) wizard).damagePoints(warrior));
        System.out.println(((Warrior) warrior).damagePoints(wizard));

        wizard = new Wizard();
        System.out.println(((Wizard) wizard).damagePoints(warrior));
        System.out.println(((Warrior) warrior).damagePoints(wizard)); 
    }
}