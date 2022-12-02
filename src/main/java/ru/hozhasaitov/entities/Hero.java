package ru.hozhasaitov.entities;

import ru.hozhasaitov.entities.npc.Person;
import ru.hozhasaitov.entities.things.Bag;
public class Hero extends Person {
    private Bag inventory;
    public Hero(String name, int healPoints, int currentGold, int dexterity, int experience, int strange) {
        super(name, healPoints, currentGold, dexterity, experience, strange);
    }
    @Override
    public void battleCry() {
        System.out.println("За Альянс!!!");
    }
    public void setInventory(Bag inventory) {
        this.inventory = inventory;
    }
    public Bag getInventory() {
        return inventory;
    }
}
