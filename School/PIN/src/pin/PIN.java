package pin;
import java.util.Scanner;

public class PIN {

    public static void main(String[] args) {
        int pin = 1234;
        String word = "hello";
        Scanner myObj = new Scanner(System.in);  
        int n = 0;
        while (n < 3){
            System.out.println("Enter PIN");
            Integer user = myObj.nextInt();
            if (user == pin) {
                System.out.println("You are logged in");
                break;
            } else {
                System.out.println("Wrong. Try again");
                n++;
            }
        }
        if (n == 3){
            Scanner myObj2 = new Scanner(System.in);
            for (int i = 0; i < 3; i = i + 1) {
                System.out.println("Your account is locked. Enter three characters from memorable word: ");
                String l = myObj2.nextLine();
                if (word.contains(l)){
                    System.out.println("Pin: " + pin);
                    break;
                }
                
                
            }
                
        }
    }
}
