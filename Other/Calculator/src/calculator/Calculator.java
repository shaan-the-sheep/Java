package calculator;
import java.util.Scanner;

class Calculator {
    public static double add(double num1, double num2) {
        double answer = num1 + num2;
        return answer;
    }
    public static double subtract (double num1, double num2) {
        double answer = num1 - num2;
        return answer;
    }
    public static double multiply (double num1, double num2) {
        double answer = num1 * num2;
        return answer;
    }
    public static double divide (float num1, float num2) {
        float answer = num1 / num2;
        return answer;
    }
    
    private static void printAnswer(double answer){
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        while (true) {
            System.out.println("Operation? [add(1), subtract(2), multiply(3), divide(4), quit(5)] :");
            int operation = myObj.nextInt(); 
            if (operation == 5)
                break;
            System.out.println("Enter 2 numbers: ");
            float num1 = myObj.nextFloat();
            float num2 = myObj.nextFloat();
            double answer;
            if (operation == 1){ 
                answer = add(num1,num2);
                printAnswer(answer);
            }
            if (operation == 2){
                answer = subtract(num1,num2);
                printAnswer(answer);
            }
            if (operation == 3){ 
                answer = multiply(num1,num2);
                printAnswer(answer);
            }
            if (operation == 4){
                answer = divide(num1,num2);
                printAnswer(answer);
            }
        }
 
    }

}
