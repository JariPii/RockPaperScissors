package ec.utbildning;

import java.util.Random;

public class Slumpis implements Datormotståndare {

    public int valAvDrag() {

        Random rand = new Random();
//
        int rand_try = rand.nextInt(3);

        /*if(rand_try == 0) {
            System.out.println("Sten");
        }
        else if (rand_try == 1) {
            System.out.println("Sax");
        }
        else {
            System.out.println("Påse");
        }*/
        return rand_try;
    }

}
