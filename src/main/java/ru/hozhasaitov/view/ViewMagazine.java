package ru.hozhasaitov.view;

import ru.hozhasaitov.entities.Hero;
import ru.hozhasaitov.entities.Magazine;
import ru.hozhasaitov.entities.npc.Dealer;
import ru.hozhasaitov.entities.things.Thing;
import ru.hozhasaitov.factory.DealerFactory;
import java.util.*;

public class ViewMagazine {
    private final Hero hero;
    private static Magazine magazine;
    public ViewMagazine(Hero hero) {
        this.hero = hero;
    }
    public void viewMagazine(){
        magazine = new Magazine((Dealer) new DealerFactory().createPerson());
        List<Thing> things = printMagazine();
        int input;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                input = scanner.nextInt();
                if (input == things.size() + 1) {
                    new ViewStartLocation(hero).startLocation();
                }else if (input > 0 && input <= things.size() + 1) {
                    buyThing(things, input);
                } else {
                    System.out.printf("Введите число от 1 до %d.", things.size() + 1);
                }
            } catch (InputMismatchException e) {
                System.out.printf("Введите число от 1 до %d.", things.size() + 1);
            }
        }
    }

    private void buyThing(List<Thing> things, int input) {
        Thing buy = things.get(input - 1);
        int heroGold = hero.getCurrentGold();
        if (heroGold >= magazine.getPrice(buy)) {
            hero.getInventory().addThing(buy);
            hero.setCurrentGold(hero.getCurrentGold() - magazine.getPrice(buy));
            System.out.printf("Вы купили %s\n", buy);
        } else {
            System.out.println("Денег нет, но вы держитесь!");
        }
        printMagazine();
    }

    private List<Thing> printMagazine() {
        System.out.println("""
                Добро пожаловать в магазин!
                Выберите товар:""" );
        List<Thing> things = magazine.getSetThings().stream().toList();
        for (int i = 0; i < things.size(); i++){
            System.out.printf("\n%d. %s x %d золота", i + 1, things.get(i), magazine.getPrice(things.get(i)));
        }
        System.out.printf("\n%d. Уйти\n", things.size() + 1);
        return things;
    }
}
