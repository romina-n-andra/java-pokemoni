package Domain;

public class Pokemon implements Comparable <Pokemon>{
    String nume;
    String tip;
    int putere;
    int viata;


    public Pokemon(String nume, String tip, int putere, int viata) {
        this.nume = nume;
        this.tip = tip;
        this.putere = putere;
        this.viata = viata;
    }

    public Pokemon() {

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getPutere() {
        return putere;
    }

    public void setPutere(int putere) {
        this.putere = putere;
    }

    public int getViata() {
        return viata;
    }

    public void setViata(int viata) {
        this.viata = viata;
    }

    @Override
    public int compareTo(Pokemon o) {
        return 0;
    }
}
