package Java_programs;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
        //   public static void main(String[] args) {
        //     String input  ="knknkn";

        //     int max = 0;
        //     int left = 0;

        //     HashMap<Character,Integer> position = new HashMap<>();
            
        //     for( int right =0 ; right < input.length();right++){
        //         char current = input.charAt(right);
        //         if (!position.containsKey(current)){
        //             position.put(current, right);
        //         }
        //         else{
        //             left = Math.max(left, position.get(current)+1);
        //             position.put(current,right);
        //         }
        //         max = Math.max(max, (right - left)+1);
        //     }
        //     System.out.println("Max "+max);
        //   }

        public static void main(String[] args){
            HashMap<Integer,String> map = new HashMap<>();
            map.put(1, "nan");
            map.put(2, "dhanda");
            map.put(3, "leo");

            for(Map.Entry<Integer,String> entry:map.entrySet()){
                System.out.print(" " +entry.getValue());
            }
        }
}
