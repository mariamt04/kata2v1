
package kata2;

import java.util.HashMap;

public class Kata2 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] vector = {1,5,6,4,46,2100,3,56,1,2,3};
    
        HashMap<Integer, Integer> histogram = new HashMap <>();
        
        
        for(int Key : vector){
            if(histogram.containsKey(Key)){
                histogram.put(Key, histogram.get(Key)+1);
            } else {
                histogram.put(Key,1);
            }
        }
        
        for(int Key : histogram.keySet()){
            System.out.println(Key + " -> " +  histogram.get(Key));
        }
    }
}
