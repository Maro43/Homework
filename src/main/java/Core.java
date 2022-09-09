package main.java;

import java.time.LocalDate;
import java.util.Scanner;

class Core {

    private final Scanner sc = new Scanner(System.in);
    private String name;

    void run() {
        Menu.display();
        getChoice();
    }

    private void getChoice() {
        int choice = sc.nextInt();
        doAction(choice);
    }

    private void doAction(int choice) {
        switch (choice) {
            case 1:
                System.out.println(LocalDate.now());
                run();
                break;
            case 2:
                System.out.println("Write your name");
                name = sc.next();
                run();
                break;
            case 3:
                System.out.println(name);
                run();
                break;
            case 4:
                System.out.println("You chose " + choice + ", see you later");
                break;
            default:
                System.out.println("You should choice number between 1 and 4");
                run();
        }
    }
}
