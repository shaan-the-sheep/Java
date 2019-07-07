package opposites;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Opposites {

        public int score = 0;
        private static ArrayList<String> word_list1 = new ArrayList<String>(
            Arrays.asList("hot", "summer", "hard", "dry", "heavy", "light",
                    "weak", "male", "sad", "win", "small", "ignore", "buy",
                    "succeed", "reject", "prevent", "exclude"));
        private static ArrayList<String> word_list2 = new ArrayList<String>(
            Arrays.asList("cold", "winter", "soft", "wet", "light", "darkness",
                     "strong", "female", "happy", "lose", "big", 
                    "pay attention", "sell", "fail", "accept", "allow", "include"));    

        static void make_question(int number1,int number2) {
            System.out.println(word_list1.get(number1) + " is to " + word_list2.get(number1)
                    + " as " + word_list1.get(number2) + " is to ..." );
        }
        
        public static void main(String[] args) {

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter name: ");
            String name = myObj.nextLine();
            int score = 0;
            
            for (int n = 1; n < 11; n++) {
                Random pick = new Random();
                int pick1 = pick.nextInt(word_list1.size()-1);
                int pick2 = pick.nextInt(word_list2.size()-1);
            
                while (pick2 == pick1) {
                    pick2 = pick.nextInt(word_list2.size()-1);
                }
                make_question(pick1,pick2);
                String correct_answer = word_list2.get(pick2);
                Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                System.out.println("Enter answer: ");
                String user_answer = myObj2.nextLine();
                
                if (user_answer.equals(correct_answer)) {
                    System.out.println("Correct answer \n");
                    score++ ;
                }
                
                else {
                    System.out.println("Wrong answer \n");
                    
                }
            }
        
       System.out.println(name + " you got " + score + " out of 10." );
                 
    }

}
    
    

