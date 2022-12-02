package ru.hozhasaitov.view;

import ru.hozhasaitov.entities.Hero;
import ru.hozhasaitov.entities.npc.Person;

public class StartGame {

    private StartGame() {
    }

    public static void start(){
        Person hero = ViewCreateHero.createHero();
        new ViewStartLocation((Hero) hero).startLocation();
    }
}
