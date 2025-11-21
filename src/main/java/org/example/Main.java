package org.example;

public class Main {
    static void main(String[] args) {

        SpravceAut s = new SpravceAut();

        s.pridejAuto(new OsobniAuto("Škoda", "Superb", 2020, 5, 600));
        s.pridejAuto(new OsobniAuto("Opel", "Zafira", 2017, 5, 500));

        NakladniAuto na = new NakladniAuto("MAN", "TGL", "2015", 5000);
        na.naloz(1500);
        s.pridejAuto(na);
        }

        s.vypisVsechnaAuta();

        System.out.println()

    }
    }
}
