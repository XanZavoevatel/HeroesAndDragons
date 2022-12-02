package ru.hozhasaitov.factory;

import ru.hozhasaitov.entities.npc.Dealer;
import ru.hozhasaitov.entities.npc.Person;

public class DealerFactory implements FactoryPersons{
    private final String NAME = "Dealer";
    private final int HEAL_POINTS = 50;
    private final int CURRENT_GOLD = 10000;
    private final int DEXTERITY = 2;
    private final int EXPERIENCE = 10;
    private final int STRANGE = 2;
    @Override
    public Person createPerson() {
        return new Dealer(NAME, HEAL_POINTS, CURRENT_GOLD,
                DEXTERITY, EXPERIENCE, STRANGE);
    }
}
