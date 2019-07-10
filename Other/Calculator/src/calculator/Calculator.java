package calculator;
import java.util.Scanner;

class Calculator {
    public static void add(double num1, double num2) {
        double answer = num1 + num2;
        System.out.println(answer);
    }
    public static void subtract (double num1, double num2) {
        double answer = num1 - num2;
        System.out.println(answer);
    }
        public static void multiply (double num1, double num2) {
        double answer = num1 * num2;
        System.out.println(answer);
    }
        public static void divide (float num1, float num2) {
        float answer = num1 / num2;
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Operation? [add(1), subtract(2), multiply(3), divide(4)] :");
        int operation = myObj.nextInt(); 
        System.out.println("Enter 2 numbers: ");
        float num1 = myObj.nextFloat();
        float num2 = myObj.nextFloat();
        if (operation == 1) 
            add(num1,num2);
        if (operation == 2)
            subtract(num1,num2);
        if (operation == 3) 
            multiply(num1,num2); 
        if (operation == 4)
            divide(num1,num2);
 
    }

}
