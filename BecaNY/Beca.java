package Ejercicios.BecaNY;

public class Beca {
    // Print numbers from 1 to 100
    public static void main(String args[]) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
        Crackle crackle = new Crackle();

        crackle.divisibleBy3();
    }
}