package ru.hozhasaitov.entities.npc;

public class Dealer extends Person {

    public Dealer(String name, int healPoints, int currentGold, int dexterity, int experience, int strange) {
        super(name, healPoints, currentGold, dexterity, experience, strange);
    }

    @Override
    public void battleCry() {
        System.out.println("Я пацифист!!!!");
    }
}
