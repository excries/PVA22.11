package org.example;

import com.sun.source.tree.UsesTree;

import java.util.ArrayList;
import java.util.List;

public class SpravceAut {

    private ArrayList<Auto> seznamAut = new ArrayList<>();

    public void pridejAuto(Auto a) {
        seznamAut.add(a);
    }

    public void vypisVsechnaAuta() {
        for (Auto a : seznamAut) {
            a.vypisInfo();
        }
    }
    public List<Auto> najdiAutaPodleZnacky(String znacka); {
        List<Auto> vysledek = new ArrayList<>();
        for (Auto a : seznamAut) {
            if (a.getZnacka().equalsIgnoreCase(znacka)) {
                vysledek.add(a);
            }
        }
        return vysledek;
    }


    public List<Auto> najdiAutaPodleRoku(int rokOd, int rokDo); {
        List<Auto> vysledek = new ArrayList<>();
        for (Auto a : seznamAut) {
            if (a.getRokVyroby() >= rokOd &&  a.getRokVyroby() <= rokDo) {
                vysledek.add(a);
            }
        }
        return vysledek;
    }

    public List<Auto> najdiRychlaAuta(int minRychlost); {
        List<Auto> vysledek = new ArrayList<>();
        for (Auto a : seznamAut) {
            if (a.getRychlost() >= minRychlost) {
                vysledek.add(a);
            }
        }
        return vysledek;
    }

    public List<NakladniAuto> najdiNakladniAutaSNakladem(); {
        List<NakladniAuto> vysledek = new ArrayList<>();
        for (Auto a : seznamAut) {
            if (a instanceof NakladniAuto na && na.getAktualniNaklad() > 0) {
                vysledek.add(na);
            }
        }
        return vysledek;
    }

    public List<OsobniAuto> najdiOsobniAutaSPocetemMist(int min);  {
        List<OsobniAuto> vysledek = new ArrayList<>();
        for (Auto a : seznamAut) {
            if (a instanceof OsobniAuto oa && oa.getPocetMist() >= min) {
                vysledek.add(oa);
            }
        }
        return vysledek;
    }

    public double prumerneStariAut() {
        if (seznamAut.isEmpty()) return 0;

        int soucet = 0;
        int aktualniRok = java.time.LocalDate.now().getYear();

        for (Auto a : seznamAut) {
            soucet += (aktualniRok - a.getRokVyroby());
        }
        return seznamAut.isEmpty() ? 0 : (double) soucet / seznamAut.size();

    }

    public int pocetOsobnichAut() {
        int pocet = 0;
        for (Auto a : seznamAut)
            if (a instanceof OsobniAuto)
                pocet++;
        return pocet;
    }

    public int pocetNakladnichAut() {
        int pocet = 0;
        for (Auto a : seznamAut)
            if (a instanceof NakladniAuto)
                pocet++;
        return pocet;
    }

    public Auto nejnovejsiAuto() {
        if (seznamAut.isEmpty()) return null;

        Auto nej = seznamAut.get(0);
        for (Auto a : seznamAut)
            if (a.getRokVyroby() > nej.getRokVyroby())
                nej = a;

        return nej;
    }
}