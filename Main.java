package com.jetbrains;

//public class Main
//{
//    public static void main(String[] args)
//    {
//        char [] charArr = new char [] {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '0'};
//        int number = 0;
//        for (char ch: charArr)
//        {
//            // long newnumber = number * 10L + ch - '0';
//
//            int digit = ch - '0';
//            int newNumber = number * 10 + digit;
//            if ( newNumber / 10 == number && newNumber % 10 == digit) {
//                number = newNumber;
//            }
//            else
//            {
//                number = Integer.MAX_VALUE;
//            }
//
//        }
//        System.out.println(number);
//    }
//}

/*public class Main {
    public static long add(double a,double b){
        return (long)(a+b);
    }
    public static void main(String[] args){
        System.out.println(add(12.3, 4.6));
        double sum=add(12.3, 4.6);
        System.out.println(sum);

        long num = 10;
        int num2 = 20;
        System.out.print((num * num2));
    }
}*/

/*
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        //System.out.println(findMax2Numbers(nums));
        for (int i: findMax2Numbers(nums))
        {
            System.out.println(i);
        }
    }


    public static int[] findMax2Numbers(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num == max) {
                continue;
            } else {
                if (num > secondMax) {
                    secondMax = num;
                }
            }
        }
        return new int[] {max, secondMax};
    }
}
*/

public class Main{
    public static void main(String [] args)
    {
        String string = "this is a string";
        System.out.println(string.toUpperCase());
        for (int i = 0; i < string.length(); i++)
        {
            System.out.println(string.charAt(i));

        }

        //System.out.println(string.substring(0,2) == "th"); address
        System.out.println(string.substring(0,2).equals("th"));
        //System.out.println(string.substring(5,1));
        string = string.toLowerCase();
        System.out.println(string);
        //System.out.println(Character.isLetterOrDigit(string.charAt(0)));

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);
        System.out.println(s2.equals(s2));
        String s3 = new String("def");
        String s4 = new String("def");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}





