package ru.hozhasaitov.view;

import ru.hozhasaitov.entities.Hero;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewStartLocation {
    private final Hero hero;
    public ViewStartLocation(Hero hero) {
        this.hero=hero;
    }
    public void startLocation(){
        String out = """
                        Куда вы хотите пойти?
                        1. К торговцу
                        2. В тёмный лес
                        3. На выход""";
            System.out.println(out);
            int input;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                input = scanner.nextInt();
                if (input > 0 && input < 4) {
                    break;
                } else {
                    System.out.println("Введите число от 1 до 3.");
                    System.out.println(out);
                }
                } catch (InputMismatchException e) {
                    System.out.println("Введите число от 1 до 3.");
                }
            }
            switch (input) {
                case 1 -> new ViewMagazine(hero).viewMagazine();
                case 2 -> new ViewFight(hero).startFight();
                case 3 -> System.out.println("Удачи!");
            }
    }
}
