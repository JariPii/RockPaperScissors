package ec.utbildning;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Spelet{
    public void spelet(String name) {

        int antalMatcher;

        Scanner scanner = new Scanner(System.in);

        Player spelare = new Player(name);

        List<Player> motståndare = List.of(
                new Player("Slumpis"),
                new Player("Vokalis"),
                new Player("Tidis")
        );



        for (Player namn : motståndare) {
            System.out.println("Du möter " + namn.name);
            System.out.println("Välj ditt drag \n1: sten \n2: sax \n3: påse");
            int användarensDrag = scanner.nextInt();

            switch (användarensDrag) {
                case 1:
                    spelare.setDrag(0);
                    break;
                case 2:
                    spelare.setDrag(1);
                    break;
                case 3:
                    spelare.setDrag(2);
                    break;
                default:
                    System.out.println("Vänligen ange en siffra för ditt val");

            }
            for(Player valAvDrag : motståndare){
                valAvDrag.setDrag(motDrag(valAvDrag.name));
            }

            switch (motståndare.get(i).getDrag()) {
                case 1:
                    motståndare.get(i).setDrag(1);
                    System.out.println(motståndare.get(i).name + " Har valt Sten");
                    break;
                case 2:
                    motståndare.get(i).setDrag(2);
                    System.out.println(motståndare.get(i).name + " Har valt sax");
                    break;
                case 3:
                    motståndare.get(i).setDrag(3);
                    System.out.println(motståndare.get(i).name + " Har valt påse");
                    break;
            }

            result(spelare.getDrag(), namn.getDrag());

        }
    }



    public void result(int choiceOne, int choiceTwo){
        int compare = choiceOne - choiceTwo;

        switch(compare){
            case -1:
                System.out.println("Du vann \n");
                break;
            case 0:
                System.out.println("Det blev lika \n");
                break;
            case 1:
                System.out.println("Du förlorade \n");
                break;
        }

        //System.out.println(compare);
        //  -1 - 2;
        //  -1 choicetvå vinner
        //  0 oavgjort
        //  1 choceett vinner
        //

    }
    public static int motDrag(String name){

        Tidis tidis = new Tidis();
        Slumpis slumpis = new Slumpis();
        Vokalis vokalis = new Vokalis();

        vokalis.setSpelarNamn(name);

        int tidisDrag = tidis.valAvDrag();
        int slumpisDrag = slumpis.valAvDrag();
        int vokalisDrag = vokalis.valAvDrag();

        System.out.println("Du möter " + name);

        switch(name){
            case "Slumpis" :
                return slumpis.valAvDrag();
            case "Vokalis" :
                return vokalis.valAvDrag();
                //val av drag
            default:
                return tidis.valAvDrag();
                //val av drag


        }

    }

}

class Player{
    String name;
    int vinster;
    int förluster;
    int drag;

    public Player(String name){
        this.name = name;
    }

    public int setDrag(int drag){
        return this.drag = drag;
    }

    public int getDrag(){
        return drag;
    }

    public int getVinster() {
        return vinster;
    }

    public int getFörluster() {
        return förluster;
    }

}







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
