package ec.utbildning;

import java.util.ArrayList;
import java.util.List;

public class Statistik {

    private int antalMatcher;
    List<Player> spelare = new ArrayList<>();


    public void visaStatistik(){
        System.out.println("Visar statistik");
    }

    public List<Player> getSpelare() {
        return spelare;
    }

    public void setSpelare(List<Player> spelare) {
        this.spelare = spelare;
    }

    public int getAntalMatcher() {
        return antalMatcher;
    }

    public void setAntalMatcher(int antalMatcher) {
        this.antalMatcher = antalMatcher;
    }
}
