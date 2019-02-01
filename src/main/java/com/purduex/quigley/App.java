package com.purduex.quigley;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        App a = new App();
//        for (int i = 0; i < 5; i++) {
//            System.out.printf("%2d! = %d \n",i,a.Factorial(i));
//        }
        System.out.printf("%2d! = %d \n", 5, a.factorial(5));

//        System.out.println(repeatMe(2,10));
        System.out.println("All Done");
//        System.out.println(doItAgain(32));
//        System.out.println(doItAgain(100));
//        for (int i = 0; i < 17; i++) {
//            System.out.printf("%d! %d\n",i,a.pow2n(i));
//        }
//        System.out.printf("%d! %d\n", 5, a.pow2n(5));
//        System.out.printf("%d! %d\n", 5, a.pow2nPurdue(5));
        System.out.println(scrambler("fish"));
        System.out.println(scrambler("pterodactyl"));
        System.out.println(scrambler(scrambler("purdue")));
    }

    static int doItAgain(int x) {
        if (x <= 1) return 1;
        return x + doItAgain(x / 2);
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public int pow2n(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * pow2n(n - 1);
    }

    public long pow2nPurdue(long n) {
        if (n == 0)
            return 1;
        if (n == 1)
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
            return greatestCommonDivisor(b, remainder);
    }

    public static int geometricSeries(int n) {
        return Integer.MIN_VALUE;
    }

    static int repeatMe(int a, int b) {
        if (a > b) return b;
        int c;

        /*** TODO: Write a recursive call to repeatMe, passing 3 plus the remainder of b divided
         by a as the first parameter, and b minus a as the second parameter, storing the
         result in the variable, c ***/
        c = repeatMe((3 + (b / a)), (b - a));


        return a + c;
    }

    public static boolean isPalindrome(String value) {
        if (value == null || value.isEmpty()) return false;
        if (value.length() == 1) return true;
        char[] charsArray = value.toLowerCase().toCharArray();
        int halfLength = charsArray.length / 2;

        for (int i = 0; i < halfLength; i++) {
            if (charsArray[i] != charsArray[charsArray.length - 1 - i])
                return false;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String value) {
        if (value == null) return false;
        if (value.length() <=1) return true;
        value = value.toLowerCase();
        //return value.substring(0, 1) == value.substring(value.length() - 1) && isPalindromeRecursive(value.substring(1, value.length()-1));\
        return value.charAt(0) == value.charAt(value.length() - 1) && isPalindromeRecursive(value.substring(1, value.length()-1));
    }

//    public  static String scrambler(String value) {
//        if (value == null) throw new IllegalArgumentException("value");
//        int valueLength = value.length();
//        if (valueLength <= 1) {
//            return value;
//        }
//        int midPoint = valueLength/2;
//        return value.charAt(valueLength-1) + scrambler(value.substring(midPoint,valueLength-1)) + scrambler(value.substring(1,midPoint)) + value.charAt(0);
//
//    }

    public static String scrambler(String s) {
        if (s == null) throw new IllegalArgumentException("s");
        int valueLength = s.length();
        if (valueLength <= 1) {
            return s;
        }
        int midPoint = valueLength/2;
        String left=s.substring(1,midPoint);
        String right=s.substring(midPoint,valueLength-1);
        return s.charAt(valueLength-1) + scrambler(left) + scrambler(right) + s.charAt(0);
    }

    public static String scrambler2(String s) {
        if (s == null) throw new IllegalArgumentException("s");
        int valueLength = s.length();
        if (valueLength <= 1) {
            return s;
        }
        int midPoint = valueLength/2;

        return s.charAt(valueLength-1) + scrambler2(s.substring(midPoint,valueLength-1)) + scrambler2(s.substring(1,midPoint)) + s.charAt(0);



    }
}
