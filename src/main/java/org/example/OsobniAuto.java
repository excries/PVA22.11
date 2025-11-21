package org.example;

public class OsobniAuto extends Auto {

    private int pocetMist;
    private int velikostKufru; // litry

    public OsobniAuto(String znacka, String model, int rokVyroby, int pocetMist, int velikostKufru) {
        super(znacka, model, rokVyroby);
        this.pocetMist = pocetMist;
        this.velikostKufru = velikostKufru;
    }

    @Override
    public void vypisInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                " , místa: " + pocetMist +
                " , kufr: " + velikostKufru + " 1";
    }

    public int getPocetMist() { return pocetMist; }
}
