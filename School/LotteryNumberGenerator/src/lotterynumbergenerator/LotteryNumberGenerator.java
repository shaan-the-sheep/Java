package lotterynumbergenerator;

import java.util.ArrayList;
import java.util.*; 

public class LotteryNumberGenerator {
 
    public static void main(String[] args) {
        ArrayList<Integer> ListOfNums = new ArrayList<Integer>();
        for (int i = 0; i < 49; i++) {
            ListOfNums.add(i); 
        }
        for (int i = 0; i < 6; i++) {
            Collections.shuffle(ListOfNums);
            System.out.println(ListOfNums.get(0));
            ListOfNums.remove(0);
        }
         Collections.shuffle(ListOfNums);
         System.out.println("Bonus Ball: " + ListOfNums.get(1));
 
        }

}
