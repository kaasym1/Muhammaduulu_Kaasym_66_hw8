public class Hacker extends Hero {
    private int takeHealth = 20;

    public Hacker(int health, int damage, SuperAbility ability, String name) {
        super(health, damage, ability, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            boss.setHealth(boss.getHealth() - this.takeHealth);
            heroes[i].setHealth(heroes[i].getHealth() + this.takeHealth);
        }
        System.out.println("Hacker hacked the system");
    }
}
