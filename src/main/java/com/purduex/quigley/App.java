package com.purduex.quigley;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )    {

        App a = new App();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d! = %d \n",i,a.Factorial(i));
        }

        System.out.println("All Done");
    }

    public  int Factorial(int n){
       if (n==0) return 1;
       return n * Factorial(n-1);
    }
}
