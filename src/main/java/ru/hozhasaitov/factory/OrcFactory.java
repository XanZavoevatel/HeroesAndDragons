package ru.hozhasaitov.factory;

import ru.hozhasaitov.entities.npc.Orc;
import ru.hozhasaitov.entities.npc.Person;

public class OrcFactory implements FactoryPersons{
    private final String NAME = "Orc";
    private final int HEAL_POINTS = 100;
    private final int CURRENT_GOLD = 5;
    private final int DEXTERITY = 5;
    private final int EXPERIENCE = 10;
    private final int STRANGE = 10;

    @Override
    public Person createPerson() {
        return new Orc(NAME, HEAL_POINTS, CURRENT_GOLD,
                DEXTERITY,EXPERIENCE,STRANGE);
    }
}
