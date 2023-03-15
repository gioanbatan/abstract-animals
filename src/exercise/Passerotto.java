package exercise;

public class Passerotto extends Animale implements IVolare{
    @Override
    public void verso() {
        System.out.println("Cip Cip Uliveto");
    }

    @Override
    public void mangia() {
        System.out.println("Insetti, semi");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
