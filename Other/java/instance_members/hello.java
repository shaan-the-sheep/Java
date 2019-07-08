/* */

public class hello {

   /* INSTANCE vars (bcos not static).
   Can only be accessed by creating an instance of this class
   It doesn't matter if it is public or private */
   public int public_int = 88;

   public static void main(String[] args) {

      System.out.println("Hello, World");

      /* Lesson: We cannot access INSTANCE members (vars or methods) from within a STATIC fn */
      int x;
      //x = public_int;  Wont compile
      //x = private_int;

      /* Nope even though get_public_int() promises it could give us the value
      of public_int, it is an INSTANCE method so we can not call it from within a STATIC method.
      We need an object of class hello to call this method upon */
      //x = getPrivate_int();  Wont compile

      /* OK, let's actually create an INSTANCE of this very class!
      Weird right?! */
      hello myObj = new hello();
      /* Now we have an instance of the class 'hello', we can call its instance methods */
      x = myObj.get_public_int();
      System.out.println("Value of instance variable public_int is: " + x);

      /* Can use get_public_int() to change public_int */
      myObj.set_public_int(999);
      x = myObj.get_public_int();
      System.out.println("Value of instance variable public_int is: " + x);
   }

   /* Instance method. Need an instance of this class to call it */
   public int get_public_int() {
      return public_int;
   }

   /* Instance method. Need an instance of this class to call it */
   public void set_public_int(int new_int) {
      this.public_int = new_int;
   }

}