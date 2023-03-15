package exercise;

public class Delfino extends Animale implements INuotare {
    @Override
    public void verso() {
        System.out.println("Piiiii crcrcrcrcr uioooooo uiooooo");
    }

    @Override
    public void mangia() {
        System.out.println("Pesci, crostacei, frutti di mare");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
