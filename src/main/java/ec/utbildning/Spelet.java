package ec.utbildning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spelet{
    public void spelet(){

            Scanner scanner = new Scanner(System.in);

            String spelarVal;

            Tidis tidis = new Tidis();
            Slumpis slumpis = new Slumpis();
            Vokalis vokalis = new Vokalis();

            List<Object> motståndare = new ArrayList<Object>();
            motståndare.add(tidis);
            motståndare.add(slumpis);
            motståndare.add(vokalis);

            for (int i = 0; i < motståndare.size(); i++){
                System.out.println("Du möter " + ()motståndare);
                System.out.println("Välj ditt drag 1: sten 2: pause: 3: sax");
                scanner.nextInt();
                int drag = slumpis.valAvDrag();
                System.out.println(drag);
            }


            vokalis.valAvDrag();
            tidis.valAvDrag();
            slumpis.valAvDrag();

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
