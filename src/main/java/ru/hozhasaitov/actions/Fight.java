package ru.hozhasaitov.actions;

import ru.hozhasaitov.entities.npc.Person;
import java.util.concurrent.ThreadLocalRandom;
public class Fight implements Runnable {
    private final Person person1;
    private final Person person2;
    public Fight(Person person1, Person person2) {
        this.person1 = person1;
        this.person2 = person2;
    }

    private boolean isHit(Person person) {
        return person.getDexterity() * 3 > ThreadLocalRandom.current().nextInt(0, 101);
    }

    public Person toFight() {
        person1.battleCry();
        person2.battleCry();
        while (person1.getHealPoints() > 0 || person2.getHealPoints() > 0) {
            hit(person1, person2);
            if (person2.getHealPoints() <= 0) {
                victoriousAction(person1, person2);
                return person1;
            }
            hit(person2, person1);
            if (person1.getHealPoints() <= 0) {
                victoriousAction(person2, person1);
                return person2;
            }
        }
        return  null;
    }

    private boolean hit(Person personFirst, Person personSecond) {
        if (isHit(personFirst)) {
            if (personFirst.getDexterity() >= ThreadLocalRandom.current().nextInt(0, 101)){
                personSecond.setHealPoints(personSecond.getHealPoints() - personFirst.getStrange() * 2);
            } else {
                personSecond.setHealPoints(personSecond.getHealPoints() - personFirst.getStrange());
            }
            return true;
        } else {
            return false;
        }
    }

    private void victoriousAction(Person personFirst, Person personSecond){
        personFirst.setExperience(personFirst.getExperience() + personSecond.getExperience());
        personFirst.setCurrentGold(personFirst.getCurrentGold() + personSecond.getCurrentGold());
    }

    @Override
    public void run() {
        System.out.println("Победил: " + toFight());
    }
}
