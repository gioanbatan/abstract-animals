package exercise;

public class Aquila extends Animale implements IVolare {
    @Override
    public void verso() {
        System.out.println("Eeeeeeaaaah");
    }

    @Override
    public void mangia() {
        System.out.println("Carne (piccoli mammiferi e occasionalmente rettili e anfibi)");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
