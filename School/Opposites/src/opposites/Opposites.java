package opposites;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Opposites {
   
        private static ArrayList<String> word_list1 = new ArrayList<String>(
            Arrays.asList("hot", "summer", "hard", "dry", "heavy", "light",
                    "weak", "male", "sad", "win", "small", "ignore", "buy",
                    "succeed", "reject", "prevent", "exclude"));
        
        private static ArrayList<String> word_list2 = new ArrayList<String>(
            Arrays.asList("cold", "winter", "soft", "wet", "light", "darkness",
                     "strong", "female", "happy", "lose", "big", 
                    "pay attention", "sell", "fail", "accept", "allow", "include"));
        
        private static void make_question(int number1,int number2) {
            System.out.println(word_list1.get(number1) + " is to " + word_list2.get(number1)
                    + " as " + word_list1.get(number2) + " is to ..." );
        }
        
        private static final int NUMGOES = 10;
        
        public static void main(String[] args) {

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter name: ");
            String name = myObj.nextLine();
            int score = 0;
            Random pick = new Random();
            for (int n = 1; n < NUMGOES + 1; n++) {
                int pick1 = pick.nextInt(word_list1.size()-1);
                int pick2 = pick.nextInt(word_list2.size()-1);
                // making sure the random numbers are not equal 
                while (pick2 == pick1) {
                    pick2 = pick.nextInt(word_list2.size()-1);
                }
                make_question(pick1,pick2);
                String correct_answer = word_list2.get(pick2);
                System.out.println("Enter answer: ");
                String user_answer = myObj.nextLine();
                
                if (user_answer.equals(correct_answer)) {
                    System.out.println("Correct answer\n");
                    score++ ;
                }
                else {
                    System.out.println("Wrong answer\n");
                }
            }
        
       System.out.println(name + " you got " + score + " out of " + NUMGOES);
                 
    }

}
    
    

