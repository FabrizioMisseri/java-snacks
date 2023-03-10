package snacks.java;

import java.util.Random;
import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args){
//        Snack 4 (Bonus)
//        Crea due array che hanno un numero di elementi diversi.
//        Mostra a video dei nuovi elementi random finchè il numero di elementi
//        presenti nell’array che ne ha di meno + quelli mostrati a video non è uguale al
//        numero di elementi presenti nell’array che ne ha di più

        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci numero di elementi che vuoi inserire");
        Integer size = Integer.parseInt(scan.nextLine());
        Integer[] lista1 = new Integer[size];

        for (Integer num: lista1){
            System.out.println("inserisci numero");
            num = Integer.parseInt(scan.nextLine());
        }
        System.out.println("************************");

        Integer[] lista2 = {0,1,2,3,4,5,6,7,8,9};

        Random rand = new Random();

        if (lista1.length != lista2.length) {
            int numberRandomElements = lista1.length - lista2.length;
            //numberRandomElements < 0 ? numberRandomElements = (-1 * (numberRandomElements)) : numberRandomElements = numberRandomElements;
            if (numberRandomElements < 0){
                numberRandomElements = -1*numberRandomElements;
            }

            for (int i = 0; i < numberRandomElements; i++) {
                System.out.println(rand.nextInt(9));
            }
        }

        scan.close();
        System.out.println("SASSONE");
    }
}
