public class Witcher extends Hero {

    public Witcher(int health, int damage, SuperAbility ability, String name) {
        super(health, damage, ability, name);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <= 0 && this != heroes[i]) {
                heroes[i].setHealth(heroes[i].getHealth() + this.getHealth());
                this.setHealth(0);
                System.out.println("Witcher revived " + heroes[i]);
            }
        }
    }
}
