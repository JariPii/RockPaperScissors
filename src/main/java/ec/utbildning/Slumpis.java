package ec.utbildning;

import java.util.Random;

public class Slumpis implements Datormotståndare {

    public int valAvDrag() {

        int[] valAvMove = {1, 2, 3};
        int val = valAvMove[new Random().nextInt(valAvMove.length)];

        // ska implementera val av drag!
        return 1;
    }

}
