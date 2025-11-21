package org.example;

public class NakladniAuto extends Auto{

    private int nosnost;        // kg
    private int aktualniNaklad; // kg

    public NakladniAuto(String znacka, String model, int rokVyroby, int nosnost) {
        super(znacka, model, rokVyroby);
        this.nosnost = nosnost;
        this.aktualniNaklad = 0;
    }

    public void naloz(int kg) {
        if (aktualniNaklad + kg <= nosnost) {
            aktualniNaklad += kg
        } else {
            System.out.println("Nelze naložit - překročení nosnosti!");
        }
    }

    public void vyloz(int kg) {
        aktualniNaklad -= kg;
        if (aktualniNaklad < 0) aktualniNaklad = 0;
    }

    @Override
    public void vypisInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                " , nosnost: " + nosnost +
                " , náklad: " + aktualniNaklad + " kg";
    }

    public int getAktualniNaklad() { return  aktualniNaklad; }
}
