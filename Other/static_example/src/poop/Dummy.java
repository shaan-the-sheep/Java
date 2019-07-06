
package poop;

/**
 * class Dummy has static members
 * We can call static members without creating an instance of class Dummy!
 * You don't even need a Ctor! But you can have one if you want to initialise
 * your members.
 * @author shaan
 */
public class Dummy {
    public static int shaan = 16;
    
    public static void printAge(){
        System.out.println("My age is " + shaan); // Can access our own member without Dummy.shaan
    }
    
}
