package ru.hozhasaitov.factory;

import ru.hozhasaitov.entities.npc.Person;
import ru.hozhasaitov.entities.npc.Skeleton;

public class SkeletonFactory implements FactoryPersons{
    private final String NAME = "Skeleton";
    private final int HEAL_POINTS = 75;
    private final int CURRENT_GOLD = 3;
    private final int DEXTERITY = 2;
    private final int EXPERIENCE = 10;
    private final int STRANGE = 5;
    @Override
    public Person createPerson() {
        return new Skeleton(NAME, HEAL_POINTS, CURRENT_GOLD,
                DEXTERITY, EXPERIENCE, STRANGE);
    }
}
