package ro.fasttrackit.lab5.tema;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CodingStringA {
    public static void main(String[] args) {
        //String currentName;
        String[] nume = {"Alex", "Florin", "David", "Alexandra", "Dragos", "Alina"};
        String alt = "d";

        for (String i : nume) {
            if (i.startsWith("A")) System.out.println(i);
        }
        System.out.println();

        for (String a : nume) {
            if (a.contains(alt)) System.out.println(a);
        }
        System.out.println();

        for (String a : nume) {
            if (a.contains("r")) System.out.println(a.replace("r", "*"));
        }
        System.out.println();

        for (String x : nume) {
            System.out.println(x.substring(0, 3));
        }
        System.out.println();

        String theString = Arrays.toString(nume);
        Random ff = new Random();
        theString = nume[ff.nextInt(nume.length)];
        char c = theString.charAt(ff.nextInt(theString.length()));
        System.out.println(theString);
        System.out.println(c);

        /*Random rd = new Random();
        currentName = nume[rd.nextInt(nume.length)];
        System.out.println(currentName);
        System.out.println();
        for (int i = 0; i < nume.length; i++) {
            System.out.println(currentName.charAt(i));
        }*/ // compileaza, dar da eroare "string index out of index: i"

        String fullName = "Balaj Alexandru Alin";
        String[] splitName = fullName.split(" ");
        System.out.println(fullName + " becomes: " + splitName[0] + " " + splitName[1].charAt(0) + ". " + splitName[2]);

        // in lucru pentru a printa numele din mijloc abreviat (pentru mai mult de 3 nume)
        Scanner s = new Scanner(System.in);
        System.out.print("Introduceti numele: ");
        String numeInput = s.nextLine(); //input de tip string
        numeInput = " " + numeInput;
        int possition = numeInput.lastIndexOf(' ');

        for (int i = 0; i < possition; i++) {
            if (numeInput.charAt(i) == ' ')
                System.out.print(numeInput.charAt(i + 1) + ". "); //nu reusesc sa printez si primul nume intreg
        }
        System.out.print(numeInput.substring(possition));
    }
}