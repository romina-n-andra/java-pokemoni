package Repository;
import Domain.Pokemon;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repository  {
    public List<Pokemon> listaPokemoni = new ArrayList<Pokemon>();

    public void citesteFisier() {
        try {
            File file = new File("/Users/romina.n.andra/Desktop/Pokemoni/src/Repository/Pokemoni.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()){
                String linie = scanner.nextLine();
                String argumente[] = linie.split(",");
                listaPokemoni.add(new Pokemon(
                        argumente[0],
                        argumente[1],
                        Integer.parseInt(argumente[2]),
                        Integer.parseInt(argumente[3])
                ));
            }

        } catch (Exception e) {
            System.out.println("Fisierul nu a fost gasit.");
        }
    }


}
