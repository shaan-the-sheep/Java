package pin;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class PIN {

    public static void main(String[] args) {
        final int pin = 1234;
        final String word = "hello";
        
        Scanner myObj = new Scanner(System.in);  
        int n = 0;
        while (n < 3){
            System.out.println("Enter PIN");
            Integer user = myObj.nextInt();
            if (user == pin) {
                System.out.println("You are logged in");
                break;
            } else {
                System.out.println("Wrong.");
                n++;
            }
        }
        if (n == 3){    // Wrong attempts. Account is locked
            int s = 0;
            Scanner myObj2 = new Scanner(System.in);
            Random rand = new Random();
            ArrayList<Integer> nums = new ArrayList<Integer>();
            for (int i = 0; i < 3; i = i + 1) {
                int int1 = rand.nextInt(word.length());
                if (nums.contains(int1)) {
                    i = i - 1;
                }
                else{
                    nums.add(int1);
                }
            } 
            for (int i = 0; i < 3; i = i + 1) {
                System.out.println("Your account is locked. Enter character: "+ (nums.get(i)+1) + " of memorable word");
                char l = myObj2.next().charAt(0);
                if (l == (word.charAt(nums.get(i)))){
                    s++;
                }
            }
            if (s==3){
                System.out.println("Pin: " + pin);
            }
            else{
                System.out.println("One or more characters incorrect. Account still locked.");
            }
        }
    }
}
