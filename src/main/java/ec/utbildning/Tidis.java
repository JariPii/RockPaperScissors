package ec.utbildning;

import java.time.LocalTime;

public class Tidis implements Datormotståndare {

    public int valAvDrag() {

       // int minute = time.getMinute();
        // ska implementera val av drag!

        LocalTime time = LocalTime.now();
        int second = time.getSecond();

        if(second < 20){
            System.out.println("Sten");
        }
        else if(second < 40){
            System.out.println("Sax");
        }
        else {
            System.out.println("Påse");
        }
//
        return 2;
    }

}
