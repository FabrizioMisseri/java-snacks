package snacks.java;

import java.util.Random;

public class Snack4 {
    public static void main(String[] args){
//        Snack 4 (Bonus)
//        Crea due array che hanno un numero di elementi diversi.
//        Mostra a video dei nuovi elementi random finchè il numero di elementi
//        presenti nell’array che ne ha di meno + quelli mostrati a video non è uguale al
//        numero di elementi presenti nell’array che ne ha di più

        Integer[] lista1 = {1,2,3,4,5};
        Integer[] lista2 = {1,2,3,4,5,6,7,8,9};

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

        System.out.println("SASSONE");
    }
}
