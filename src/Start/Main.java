package Start;

import UserInterface.UI;

public class Main {
    public static void lansare() {
        try {
            UI ui = new UI();
            ui.run();
        } catch (Exception e) {
            System.out.println("Ceva nu a mers bine!");
            lansare();
        }
    }

    public static void main(String[] args) {
        lansare();
    }
}