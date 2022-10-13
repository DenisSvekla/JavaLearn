package HW.lesson8_oop;

public class Terapevt extends Doctor {

    private String kakBudutLechit = "Таблеток";
    private Pacient pacient;


    @Override
    public void Lechenie() {
        super.Lechenie();
        System.out.print(kakBudutLechit);
    }

    public Doctor naznachenieVracha(Pacient pacient) {
        if (pacient.getPlanlechenia() == 1) {
            return new Hirurg();
        } else if (pacient.getPlanlechenia() == 2) {
            return new Dantist();
        } else {
            return new Terapevt();
        }
    }
}
