package ec.utbildning;

import java.util.Random;

public class Slumpis implements Datormotståndare {

    public int valAvDrag() {

        Random rand = new Random();

        return rand.nextInt(1,3);
    }

}
