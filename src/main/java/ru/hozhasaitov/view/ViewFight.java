package ru.hozhasaitov.view;

import ru.hozhasaitov.actions.Fight;
import ru.hozhasaitov.entities.Hero;
import ru.hozhasaitov.entities.npc.Person;
import ru.hozhasaitov.factory.DragonFactory;
import ru.hozhasaitov.factory.OrcFactory;
import ru.hozhasaitov.factory.SkeletonFactory;
import java.util.concurrent.ThreadLocalRandom;

public class ViewFight {
    private final Hero hero;
    private final Person mob;

    public ViewFight(Hero hero) {
        this.hero = hero;
        this.mob = randomMob();
    }

    private Person randomMob() {
      int random = ThreadLocalRandom.current().nextInt(0,101);
      if (random >0 && random < 33) {
          return new SkeletonFactory().createPerson();
      } else if (random > 33 && random < 67) {
          return new OrcFactory().createPerson();
      } else {
          return new DragonFactory().createPerson();
      }
    }
    public void startFight() {
        Thread fight = new Thread(new Fight(hero, mob));
        fight.start();
        try {
            fight.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (hero.getHealPoints() <= 0) {
            System.out.println("Game over!");
        } else {
            new ViewStartLocation(hero).startLocation();
        }
    }
}
