package exerciseone;

public class Cane extends Animale {
    @Override
    public void verso() {
        System.out.println("Woff woff");
    }

    @Override
    public void mangia() {
        System.out.println("Carne, crocchette, cereali, le mosche");
    }
}
