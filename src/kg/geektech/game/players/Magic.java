package kg.geektech.game.players;

import java.util.Random;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0){
                int magicBoost = 5;
                heroes[i].setDamage(heroes[i].getDamage() + magicBoost);
            }

        }

    }
}
