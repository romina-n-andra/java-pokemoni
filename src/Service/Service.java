package Service;

import Domain.Pokemon;
import Repository.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Service {
    Repository repository = new Repository();
    public void citireFisier(){
        this.repository.citesteFisier();
    }

    public void afiseazaDelimitator(int numarChar){
            for (int i=0;i<numarChar;i++){
                System.out.print("=");
            }
            System.out.print("\n");
    }

    public void afiseaza(){
        System.out.println("Afisam tabela:");
        System.out.println("| Nume Pokemon | Tip Pokemon | Viata Pokemon | Putere Pokemon |");
        this.afiseazaDelimitator(63);
        for (int i = 0; i<this.repository.listaPokemoni.size();i++) {
            Pokemon p = this.repository.listaPokemoni.get(i);
//            System.out.println("| "+p.getNume()+" | "+p.getTip()+" | "+p.getViata()+" | "+p.getViata()+" |");
        System.out.format("|%-14s|%-13s|%-15d|%-16d|\n",
                p.getNume(),p.getTip(),p.getViata(),p.getPutere());
        this.afiseazaDelimitator(63);
        }
    }
    public void adauga(){
        Pokemon p = new Pokemon();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numele Pokemonului:");
        p.setNume(scanner.nextLine());
        System.out.println("Introdu tipul Pokemonului:");
        p.setTip(scanner.nextLine());
        System.out.println("Introdu viata Pokemonului:");
        p.setViata(scanner.nextInt());
        System.out.println("Introdu puterea Pokemonului:");
        p.setPutere(scanner.nextInt());
        this.repository.listaPokemoni.add(p);
    }

    public void sterge(){
        try {
            System.out.println("Introduceti pozitia Pokemonului:");
            Scanner scanner = new Scanner(System.in);
            int optiune = scanner.nextInt();
            repository.listaPokemoni.remove(optiune);
        } catch (Exception e) {
            System.out.println("Nu s-a putut sterge...");
        }
    }

    public void modifica(){
        this.sterge();
        this.adauga();
    }

    public void afisarePokemoniFoc(){
        List<Pokemon> listaPokemoni = this.repository.listaPokemoni;
        System.out.println("| Nume Pokemon | Tip Pokemon |");
        this.afiseazaDelimitator(30);
        for (int i=0; i<listaPokemoni.size();i++){
            Pokemon itr = listaPokemoni.get(i);
            if (itr.getTip().toLowerCase().equals("foc")){
                System.out.format("|%-14s|%-13s|\n",itr.getNume(),itr.getTip());
            }
        }
        this.afiseazaDelimitator(30);
    }
}
