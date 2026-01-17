package neetcode.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DutchFlag {
    public static void main(String[] args) {
        ArrayList<Character> balls = new ArrayList<>(Arrays.asList('R'));
        System.out.println(dutchFlag(balls));
    }

    static ArrayList<Character> dutchFlag(ArrayList<Character> balls){
        Map<Character,Integer> hmap = new HashMap<>();
        for(Character c : balls){
            if(hmap.containsKey(c)){
                hmap.put(c,hmap.get(c)+1);
            }else{
                hmap.put(c,1);
            }
        }
        int redVal = hmap.containsKey('R')?hmap.get('R'):0;
        int redIdx = redVal;
        int greenVal = hmap.containsKey('G')?hmap.get('G'):0;
        int greenIdx = greenVal;
        int blueVal = hmap.containsKey('B')?hmap.get('B'):0;
        int blueIdx = blueVal;
        while(redVal>0){
            balls.set(redVal-1,'R');
            redVal--;
        }
        while(greenVal>0){
            balls.set(redIdx+greenVal-1,'G');
            greenVal--;
        }
        while(blueVal>0){
            balls.set(redIdx+greenIdx+blueVal-1,'B');
            blueVal--;
        }
        return balls;
    }
}
