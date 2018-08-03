package com.jetbrains;

/*
public class Main {

    public static void main(String[] args)
    {
	// write your code here
        Person person = new Person("jessica",22,"female");
        System.out.println(person.getName());
    }
}


class Person
{
    String name;
    int age;
    String sex;

    Person(String name, int age, String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    String getName()
    {
        return name;
    }
}
*/

//class ListNode
//{
//    String name;
//    ListNode next;
//    ListNode (String name)
//    {
//        this.name = name;
//        this.next = null;
//    }
//}

//public class Main{
//    public static int func(int n){
//        if (n > 0){
//            return n * func(n - 1);
//        }
//        else{
//            return 2;
//        }
//    }
//    public static void main(String[] args){
//        int n = func(func(2));
//        System.out.println(n);
//    }
//}

 /*
public class TreeNode
{
    public int val;
    public int num;
    public TreeNode left, right;

    public TreeNode(int val)
    {
        this.val = val;
        this.left = this.right = null;
    }
}

public class BST
{

    public TreeNode find(TreeNode root, int val)
    {
        if (root == null)
        {
            return null;
        }

        if (root.val == val)
        {
            return root;
        }

        if (val < root.val)
        {
            return find(root.left, val);
        }
        else
        {
            return find(root.right, val);
        }
    }

    public TreeNode insert (TreeNode root, TreeNode x)
    {
        if (root == null)
        {
            return x;
        }

        if (root.val == x.val)
        {
            root.num += 1;
        }

        if (root.val > x.val)
        {
            root.left = insert(root.left, x);
        }
        else
        {
            root.right = insert(root.right, x);
        }

        return root;
    }
}
*/

import java.util.HashMap;

public class Main
 {
     public static void main (String [] args)
     {
        System.out.println(testMyMap(MyMapLinearProbingHasingImpl()));
        System.out.println(testMyMap(MyMapChainedHashingImpl()))
     }
    // testcase Junit
     private static boolean testMyMap (MyMap myMap) // testcase
     {
         //MyMapArrayListImpl map = new MyMapArrayListImpl();
         //MyMapBSTImpl map = new MyMapBSTImpl();
        // MyMapLinearProbingHasingImpl map = new MyMapLinearProbingHasingImpl();
         //MyMapChainedHashingImpl map = new MyMapChainedHashingImpl();
         myMap.put("Jack", "CMU");
         myMap.put ("Rose", "MIT");

         if (!"CMU".equals(myMap.get("Jack")))
         {
             System.out.println("Expected: CMU, result:" + myMap.get("Jack"));
             return false;
         }

         System.out.println("Jack".equals(myMap.get("Rose")));

         myMap.put("Aa", "1");
         myMap.put("BB", "2");

         System.out.println("1".equals(myMap.get("Aa")));
         System.out.println("2".equals(myMap.get("BB")));

         myMap.put("Aa", "3");
         System.out.println("3".equals(myMap.get("Aa")));

         return true;
     }
 }
