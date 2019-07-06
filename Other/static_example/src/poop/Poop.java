package poop;

public class Poop {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        int x;  // Just local variable in main fn
        x = 42;
        System.out.println(x); 
        
        // Now we access static members in a different class
        // Look how we call the STATIC members of our Dummy class
        // We don't have to CREATE an instance of that class !!!
        System.out.println(Dummy.shaan);
        Dummy.printAge();
   }
   
}

