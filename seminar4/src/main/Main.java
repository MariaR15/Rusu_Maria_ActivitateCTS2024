package main;

import fabrici.FactoryAngajat;

public class Main {
    public static void main(String[] args) {
        FactoryAngajat factoryAngajat = new FactoryAsisent();
        PersonalSpital angajat = factoryAngajat (nume , salariul);
        angajat.afisare();

    }
    public static void persoaneAngajat(factoryAngajati factory, String nume, int salariul){
        PersonalSpital angajat = factory.creareAngajat(nume, salariul);
        angajat.afisare();
    }
}
