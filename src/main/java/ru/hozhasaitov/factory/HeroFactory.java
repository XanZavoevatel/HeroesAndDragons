package ru.hozhasaitov.factory;

import ru.hozhasaitov.entities.npc.Person;

public class HeroFactory implements FactoryPersons{
    private final String NAME = "Hero";
    private final int HEAL_POINTS = 100;
    private final int CURRENT_GOLD = 15;
    private final int DEXTERITY = 8;
    private final int EXPERIENCE = 10;
    private final int STRANGE = 8;

    @Override
    public Person createPerson() {
        return new ru.hozhasaitov.entities.Hero(NAME, HEAL_POINTS, CURRENT_GOLD,
                DEXTERITY, EXPERIENCE, STRANGE);
    }
}
