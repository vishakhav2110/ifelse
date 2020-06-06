public class Abc {  // class name
      int a = 20; // global variable
    int b = 40;  // global instance variable
    int ans;

    public void add(){  // instance method
        ans = a+b; // local variable

        System.out.println("a+b"  +ans ); // print out ans value for add

    }
     public void sub(){ // instance method
         ans = a-b;
         System.out.println("a-b" +ans); // print out ans value foe sub
 }
     public static void main(String[] args) { // main method
        Abc abc = new Abc(); // create abc object
        abc.add();
        abc.sub();

    }
}
