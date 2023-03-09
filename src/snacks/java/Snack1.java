package snacks.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
//        Snack 1
//        Inserisci un numero, se è pari stampa il numero,
//        se è dispari stampa il numero successivo.
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci un numero");
        int num = Integer.parseInt(scan.nextLine());

        while(num % 2 == 0){
            System.out.println("il numero è pari");

            System.out.println("inserisci un numero");
            num = Integer.parseInt(scan.nextLine());
        }

        System.out.println("in numero è dispari");
        System.out.println("FINE");


        scan.close();



}
}
