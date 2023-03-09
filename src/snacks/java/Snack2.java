package snacks.java;

public class Snack2 {

    public static void main(String[] args){
//        Snack 2
//        Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una
//        lista di nomi e una lista di cognomi,
//                e da queste vuole mostrare a video
//        una falsa lista di invitati con nome e cognome.
    String[] nomi = {"marco", "paolo", "anna"};
    String[] cognomi = {"matto","matti","matta"};

    String[] nomiCompleti = new String[3];

        for (int i = 0; i < nomiCompleti.length; i++) {
            nomiCompleti[i] = nomi[i] + " " + cognomi[i];
        };

        for (String element: nomiCompleti){
            System.out.println(element);
        }

        System.out.println("SASSONE");
}}
