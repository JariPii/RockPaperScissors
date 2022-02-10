package ec.utbildning;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Spelet{
    public void spelet(String name) {

        Result result = new Result();

        Scanner scanner = new Scanner(System.in);

        Player spelare = new Player(name);

        List<Player> motståndare = List.of(
                new Player("Slumpis"),
                new Player("Vokalis"),
                new Player("Tidis")
        );


        for (int i = 0; i < motståndare.size(); i++) {
            System.out.println("Du möter : " + motståndare.get(i).name);
            System.out.println("Välj ditt drag \n1: sten \n2: sax \n3: påse");
            int användarensDrag = scanner.nextInt();
            motDrag(spelare.name);
            switch (användarensDrag) {
                case 1:
                    spelare.setDrag(1);
                    break;
                case 2:
                    spelare.setDrag(2);
                    break;
                case 3:
                    spelare.setDrag(3);
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

            result.beslutaVinnare(spelare, motståndare.get(i));
            if(i == 0){
                result.beslutaVinnare(motståndare.get(i + 1), motståndare.get(i + 2));
            } else if ( i == 1) {
                result.beslutaVinnare(motståndare.get(0), motståndare.get(i + 1));
            }else {
                result.beslutaVinnare(motståndare.get(0), motståndare.get(1));
            }
            result.antalMatcher++;

        }

        Statistik statistik = new Statistik();
        List<Player> allaSpelare = new ArrayList<>();

        for(Player bot : motståndare){
                  allaSpelare.add(bot);
        };

        allaSpelare.add(spelare);
        statistik.setSpelare(allaSpelare);


        System.out.println("Matcher spelade: " + result.antalMatcher);
        System.out.println("Du vann: " + spelare.vinster + " Matcher");
        for(Player bot : motståndare){
            System.out.println(bot.name + "Har " + bot.vinster + " Vinster \n");
        }
    }

    public static int motDrag(String name){

        Tidis tidis = new Tidis();
        Slumpis slumpis = new Slumpis();
        Vokalis vokalis = new Vokalis();

        vokalis.setSpelarNamn(name);

        int tidisDrag = tidis.valAvDrag();
        int slumpisDrag = slumpis.valAvDrag();
        int vokalisDrag = vokalis.valAvDrag();


        switch(name){
            case "Slumpis" :
                return slumpisDrag;
            case "Vokalis" :
                return vokalisDrag;
            default:
                return tidisDrag;

        }

    }

}

class Result{
    int antalMatcher;

    public void beslutaVinnare(Player a, Player b){

        int playerADrag = a.getDrag();
        int playerBDrag = b.getDrag();

        System.out.println(a.name + " HAR VALT DRAGET " + a.getDrag() + "\n" + b.name + " HAR VALT DRAGET " + b.getDrag());

        if(playerADrag  == playerBDrag ){
            System.out.println("Det BLEV LIKA");
            a.lika++;
            b.lika++;
        }else if ((playerADrag +1) % 3 == playerBDrag % 3){
            System.out.println(a.name + " <-VANN" + " " + b.name + " <-FÖRLORADE");
            a.vinster++;
            b.förluster++;
        }else {
            System.out.println(a.name + " <-FÖRLORADE " + b.name + " <-VANN");
            a.förluster++;
            b.vinster++;
        }

    }
}

class Player{
    String name;
    int vinster;
    int lika;
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



