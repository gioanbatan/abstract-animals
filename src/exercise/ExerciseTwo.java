package exercise;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Seleziona un animale da istanziare:");
        System.out.println("1 - Aquila");
        System.out.println("2 - Cane");
        System.out.println("3 - Delfino");
        System.out.println("4 - Passerotto");

        boolean selectionisOk = false;

        while (!selectionisOk) {
            System.out.print("-> ");
            int selection = Integer.parseInt(scan.nextLine());

            switch (selection) {
                case 1: {
                    selectionisOk = true;

                    Aquila animal = new Aquila();
                    if (animal instanceof IVolare) {
                        faiVolare(animal);
                    }
                    break;
                }
                case 2: {
                    selectionisOk = true;

                    Cane animal = new Cane();
                    if (animal instanceof INuotare) {
                        faiNuotare(animal);
                    }
                    break;
                }
                case 3: {
                    selectionisOk = true;

                    Delfino animal = new Delfino();
                    if (animal instanceof INuotare) {
                        faiNuotare(animal);
                    }
                    break;
                }
                case 4: {
                    selectionisOk = true;

                    Passerotto animal = new Passerotto();
                    if (animal instanceof IVolare) {
                        faiVolare(animal);
                    }
                    break;
                }
                default:
                    System.out.println("Errore nella selezione, seleziona un numero corretto.");
                    break;
            }
        }
        scan.close();
    }

    public static void faiVolare(IVolare animal) {
        animal.vola();
    }

    public static void faiNuotare(INuotare animal) {
        animal.nuota();
    }
}