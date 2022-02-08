package ec.utbildning;

import java.util.Random;
import java.util.Scanner;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        boolean runProgram = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Det mesta avancerade oanvändbara sten sax påse spelet!");
        System.out.println("Välkommen!");
        System.out.println("Vad heter du?");
        String name = scanner.nextLine();
        System.out.println("Välkommen " + name);

        Spelet spelet = new Spelet();

        //while loop
        while(runProgram){
        System.out.println("\nMenyval!\n 1: spela\n 2: statistik\n 3: avsluta");
        int menyVal = scanner.nextInt();

        switch (menyVal){
            case 1:
                System.out.println("Du valde 1");
                spelet.spelet(name);
                break;
            case 2:
                System.out.println("Du valde 2");
                break;
            default:
                System.out.println("Du har valt att avsluta!");
                runProgram = false;
        }
        }




//        String [] rps = {"s", "x", "p"};
//        String slumpis = rps[new Random().nextInt(rps.length)];



//        String spelarVal;
//
//        while (true) {
//            System.out.println("Välkommer! Vilket väljer du att spela, (S)ten Sa(x) eller (P)åse");
//            spelarVal = scanner.nextLine();
//            if (spelarVal.equals("s") || spelarVal.equals("x") || spelarVal.equals("p")) {
//                break;
//            }
//
//            System.out.println(spelarVal + " gör ett nytt val! s, x eller p");
//
//        }
//
//        System.out.println("Datorn väljer: " + 1);

    }

}
