package UserInterface;

import Service.Service;

import java.util.Scanner;

public class UI {
    Service service = new Service();
    public void run() {
        System.out.println("Bun venit in Programul de Pokemoni! :)");

        boolean conditieOprireProgram = false;

        while (conditieOprireProgram == false) {
            this.afiseazaOptiunile();
            int optiuneaAleasa = this.citireOptiune();

            switch(optiuneaAleasa) {
                case 1:
                    System.out.println("Ai ales sa citesti datele.");
                    service.citireFisier();
                    break;
                case 2:
                    System.out.println("Ai ales sa afisezi datele.");
                    service.afiseaza();
                    break;
                case 3:
                    System.out.println("Ai ales sa adaugi un Pokemon. Yay! :)");
                    service.adauga();
                    break;
                case 4:
                    System.out.println("Ai ales sa stergi un Pokemon. :(");
                    service.sterge();
                    break;
                case 5:
                    System.out.println("Ai ales sa modifici un Pokemon.");
                    service.modifica();
                    break;
                case 6:
                    System.out.println("Ai ales sa afisezi Pokemonii de foc.");
                    service.afisarePokemoniFoc();
                    break;
                case 0:
                    System.out.println("La revedere!");
                    conditieOprireProgram = true;
                    break;
                default:
                    System.out.println("Ai gresit, mai incearca! (numar invalid)");
                    break;
            }
        }
    }

    private int citireOptiune() {
        try {
            Scanner scanner= new Scanner(System.in);
            int optiune =scanner.nextInt();
            return optiune;
        }
        catch(Exception E){
            System.out.println("Ai gresit, mai incearca (nu e numar)!");
            return citireOptiune();
        }
    }

    private void afiseazaOptiunile() {
        System.out.println("----------INCEPUT OPTIUNI------------");
        System.out.println("1. Citeste datele din fisier");
        System.out.println("2. Afiseaza datele");
        System.out.println("3. Adauga un Pokemon");
        System.out.println("4. Sterge un Pokemon");
        System.out.println("5. Modifica un Pokemon");
        System.out.println("6. Afiseaza Pokemonii de Foc");
        System.out.println("0. Terminare program");
        System.out.println("----------SFARSIT OPTIUNI------------");
        System.out.println("Alege una dintre urmatoarele optiuni:");
    }


}
