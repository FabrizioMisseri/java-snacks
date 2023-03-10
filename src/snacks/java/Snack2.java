package snacks.java;

import java.util.Arrays;
import java.util.Random;

public class Snack2 {

    public static void main(String[] args){
//        Snack 2
//        Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una
//        lista di nomi e una lista di cognomi,
//                e da queste vuole mostrare a video
//        una falsa lista di invitati con nome e cognome.
    String[] nomi = {"marco", "paolo", "anna","Ottavio"};
    String[] cognomi = {"matto","matti","matta","Paolini"};
        Random rand = new Random();

    String[] nomiCompleti = new String[rand.nextInt(10)];

        for (int i = 0; i < nomiCompleti.length; i++) {
            nomiCompleti[i] = nomi[rand.nextInt(nomi.length)] + " " + cognomi[rand.nextInt(cognomi.length)];
        };

//        for (String element: nomiCompleti){
//            System.out.println(element);
//        }

        System.out.println(Arrays.toString(nomiCompleti));

        System.out.println("SASSONE");
}}
