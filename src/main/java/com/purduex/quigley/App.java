package com.purduex.quigley;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )    {

        App a = new App();
//        for (int i = 0; i < 5; i++) {
//            System.out.printf("%2d! = %d \n",i,a.Factorial(i));
//        }
        System.out.printf("%2d! = %d \n",5,a.factorial(5));

//        System.out.println(repeatMe(2,10));
        System.out.println("All Done");
//        System.out.println(doItAgain(32));
//        System.out.println(doItAgain(100));
//        for (int i = 0; i < 17; i++) {
//            System.out.printf("%d! %d\n",i,a.pow2n(i));
//        }
        System.out.printf("%d! %d\n",5,a.pow2n(5));
        System.out.printf("%d! %d\n",5,a.pow2nPurdue(5));
    }

      static int doItAgain(int x)
    {
        if (x <= 1) return 1;
        return x + doItAgain(x / 2);
    }

    public  int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public  int pow2n(int n){
        if (n==0){
            return 1;
        }
        return  2 * pow2n(n-1);
    }

    public long pow2nPurdue (long n){
        if (n==0)
            return 1;
        if (n==1)
            return 2;
        else {
            long t = pow2nPurdue(n / 2);
            if (n % 2 == 0)
                return t * t;
            else
                return 2 * t * t;
        }
    }

    public static int greatestCommonDivisor(int a, int b) {
        
        int remainder = a % b;
        if (remainder == 0)
            return b;
        else
            return greatestCommonDivisor(b,remainder);
    }

    static int repeatMe(int a, int b) {
        if (a > b) return b;
        int c;

        /*** TODO: Write a recursive call to repeatMe, passing 3 plus the remainder of b divided
         by a as the first parameter, and b minus a as the second parameter, storing the
         result in the variable, c ***/
        c = repeatMe((3 + (b/a)),(b-a));


        return a + c;
    }
}
