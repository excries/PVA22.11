package org.example;

public class Auto {

    private String znacka;
    private String model;
    private int rokVyroby;
    private int rychlost;

    public Auto(String znacka, String model, int rokVyroby) {
            this.znacka = znacka;
            this.model = model;
            this.rokVyroby = rokVyroby;
            this.rychlost = 0;
    }
    public void zrychli(int oKolik) {
        rychlost += oKolik;
    }

    public void zpomal(int oKolik) {
        rychlost -= oKolik;
        if (rychlost < 0) rychlost = 0;
    }

    public void zastav() {
        rychlost = 0;
    }

    public void vypisInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return znacka + " " + model + " ( " + rokVyroby + " ), rychlost: " + rychlost + " km/h";
    }

    public String getZnacka() { return znacka; }
    public int getRokVyroby() { return rokVyroby; }
    public int getRychlost() { return rychlost;}

}
