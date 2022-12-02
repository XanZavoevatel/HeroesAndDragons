package ru.hozhasaitov.entities.things;

import ru.hozhasaitov.entities.npc.Person;

public class PotionHP implements Thing {
    private Person person;

    @Override
    public void use() {
        person.setHealPoints(person.getHealPoints() + 25);
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PotionHP");
        return sb.toString();
    }
}
