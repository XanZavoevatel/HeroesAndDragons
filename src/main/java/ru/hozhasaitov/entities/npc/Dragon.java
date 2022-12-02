package ru.hozhasaitov.entities.npc;

public class Dragon extends Person {
    public Dragon(String name, int healPoints, int currentGold, int dexterity, int experience, int strange) {
        super(name, healPoints, currentGold, dexterity, experience, strange);
    }

    @Override
    public void battleCry() {
        System.out.println("За Азерот!");
    }


}
