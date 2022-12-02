package ru.hozhasaitov.view;

import ru.hozhasaitov.entities.Hero;
import ru.hozhasaitov.entities.things.Bag;
import ru.hozhasaitov.factory.FactoryPersons;
import ru.hozhasaitov.factory.HeroFactory;
import java.util.Scanner;

public class ViewCreateHero {
    private ViewCreateHero() {
    }

    public static Hero createHero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру!\nВведите имя персонажа: ");
        String nameHero = scanner.nextLine();
        FactoryPersons heroFactory = new HeroFactory();
        Hero hero =(Hero) heroFactory.createPerson();
        hero.setName(nameHero);
        hero.setInventory(new Bag());
        return hero;
    }
}
