import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Thusday_Homework2 {
    static int ans; // static global variable
    static int sub; // static global variable
    static int A = 10;  // static global variable
    static int B =20;   // static global variable

    static void add()
    {
       ans = A + B;
        System.out.println("the addition of = A + B "  +ans);
    }
     static void sub()
     {
         ans = A - B;
         System.out.println("the sub of = A - B "  +ans);
     }
      static void multi()
       {
          ans = A * B;
          System.out.println(" the multi of = A * B "  +ans);

        }
      static void div() {
          ans = A % B;
          System.out.println("the div  of = A % B " + ans);
      }

    public static void main(String[] args) {
         add();
         sub();
         multi();
         div();

    }



}
