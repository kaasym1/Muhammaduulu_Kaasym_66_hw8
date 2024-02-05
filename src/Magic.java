public class Magic extends Hero {
    private int boostDamage = 30;

    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            hero.setDamage(hero.getDamage() + this.boostDamage);
        }
    }
}
