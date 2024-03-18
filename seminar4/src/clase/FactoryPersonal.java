package clase;

public class FactoryPersonal {
    public PersoanaSpital createTip(TipAngajat tipAngajat){
        switch (tipangajat) {
            case BRACANDIER:
                return new Brancadier(nume, salariu);
            case ASISTENT:
                return new Asistent(nume, salariul);
            case MEDIC:
                return new Medic(nume, salariul);
            case INFERMIER:
                return new Infermier(nume, salariul);
        }
    }
}
