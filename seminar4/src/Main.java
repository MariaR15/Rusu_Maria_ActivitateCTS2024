import clase.FactoryPersonal;
import clase.PersoanaSpital;
import clase.TipAngajat;

public class Main {
    public static void main(String[] args){
        FactoryPersonal factoryPersonal = new FactoryPersonal();
        PersoanaSpital medic = factoryPersonal.createAngajat(TipAngajat.MEDIC, 'Gigel', 12);
        medic.afisare();
        Persoanaspital asistent = factoryPersonal.createangajat(TipAngajat.ASISTENT, 'Ionel', 13);
        asistent.afisare();

    }
}