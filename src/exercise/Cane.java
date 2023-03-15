package exercise;

public class Cane extends Animale implements INuotare {
    @Override
    public void verso() {
        System.out.println("Woff woff");
    }

    @Override
    public void mangia() {
        System.out.println("Carne, crocchette, cereali, le mosche");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando (un po' a fatica)!!!");
    }
}
