package challenge401;

import java.util.HashSet;
import java.util.Set;

public class Dice {
    private int dice;
    public int[] roll(int n){
        int count =0;
        int[] rollValues = new int[n];
        while (count < n){
            rollValues[count] = (int) (Math.random()*6) +1;
            count++;
        }
        return rollValues;
    }
    public boolean containsDuplicates (int[] arr){
        boolean test = false;
        Set<Integer> store = new HashSet<>();
        for(int val : arr){
            if (!store.add(val)){
                test = true;
            }
        }
        return test;
    }
}
