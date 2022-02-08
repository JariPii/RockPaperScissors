package ec.utbildning;

import java.io.StringReader;
import java.nio.CharBuffer;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Vokalis implements Datormotståndare {

    String spelarNamn;


    public int valAvDrag() {


        //KOmmer vara input name
        String s = spelarNamn;

        int startLength = s.length();
        String noWows = s.replaceAll("[aiouey]","");
        int afterLength = noWows.length();
        int result = startLength - afterLength;

        return result;
        //numOfVows används för att välja drag.





//        Scanner sc = new Scanner(System.in);
//        System.out.println("Name");
//        String playerName = sc.nextLine();
//        int i;
//        int nameLength = playerName.length();
//        char vow;
//        int c = 0;
//        String s = playerName.toLowerCase();
//
//        for(i = 0; i < nameLength; i++) {
//            vow = s.charAt(i);
//            if (vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u' || vow == 'y')
//                c++;
//        }
//
//        System.out.println("no of vs : " + c);

        // ska implementera val av drag!
//        return 1;
    }

    public void setSpelarNamn(String spelarNamn) {
        this.spelarNamn = spelarNamn;
    }
}
