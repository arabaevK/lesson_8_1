package kg.geektech.game.players;

import static kg.geektech.game.general.RPG_Game.random;

public class Thor extends Hero{

    public Thor(int health, int damage ) {
        super(health, damage, SuperAbility.STUNNED);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
//        boolean stunned = random.nextBoolean();
//            if (this.getHealth() > 0 && stunned == true) {
//                boss.setDamage(0);
//            }else{ boss.setDamage(50);
//                System.out.println("Boss stunned");
//        }
  }
}
