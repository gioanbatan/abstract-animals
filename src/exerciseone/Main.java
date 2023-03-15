package exerciseone;

public class Main {

    public static void main(String[] args) {
        Aquila animale1 = new Aquila();
        Cane animale2 = new Cane();
        Delfino animale3 = new Delfino();
        Passerotto animale4 = new Passerotto();

        System.out.print("Un'" + animale1.getClass() + " che dorme fa ");
        animale1.dormi();

        System.out.println();

        System.out.print("Un " + animale1.getClass() + " come verso fa ");
        animale2.verso();

        System.out.println();

        System.out.print("Un " + animale2.getClass() + " come verso fa ");
        animale3.verso();
        System.out.print(" e mangia: ");
        animale3.mangia();

        System.out.println();

        System.out.print("Un " + animale4.getClass() + " quando dorme fa ");
        animale4.dormi();
        System.out.print(" come verso fa ");
        animale4.verso();
        System.out.print(" e mangia: ");
        animale4.mangia();

        System.out.println("\n\nEcco tutti gli animali istaziati:");

        Animale[] animals = {animale1, animale2,animale3, animale4};

        for (Animale animal : animals) {
            System.out.print("Animale: ");
            System.out.println(animal.getClass().getSimpleName());
            System.out.print("- Dorme: ");
            animal.dormi();
            System.out.print("- Verso: ");
            animal.verso();
            System.out.print("- Mangia: ");
            animal.mangia();
            System.out.println("..........\n");
        }
    }
}