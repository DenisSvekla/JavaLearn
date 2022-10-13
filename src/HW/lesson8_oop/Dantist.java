package HW.lesson8_oop;

public class Dantist extends Doctor {


    private String kakBudutLechit= "бормашины";


    @Override
    public void Lechenie() {
        super.Lechenie();
        System.out.print(kakBudutLechit);
    }
}
