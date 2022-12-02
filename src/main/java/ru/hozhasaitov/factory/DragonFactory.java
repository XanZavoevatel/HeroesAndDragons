package ru.hozhasaitov.factory;

import ru.hozhasaitov.entities.npc.Dragon;
import ru.hozhasaitov.entities.npc.Person;

public class DragonFactory implements FactoryPersons{
    private final String NAME = "Dragon";
    private final int HEAL_POINTS = 1000;
    private final int CURRENT_GOLD = 100;
    private final int DEXTERITY = 10;
    private final int EXPERIENCE = 1000;
    private final int STRANGE = 20;
    @Override
    public Person createPerson() {
        return new Dragon(NAME, HEAL_POINTS, CURRENT_GOLD,
                DEXTERITY, EXPERIENCE, STRANGE);
    }
}
