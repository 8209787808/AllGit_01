package com.basics_1;
// Java program to show the difference
// between formal and actual parameters
 
import java.io.*;
 
class GFG {
  static int sum(int a,int b) // Formal parameters
  { 
   return a+b;
  }
    public static void main (String[] args) {
       int a=5;
       int b=10;
       
    //  System.out.println(sum(a,b));  //This is actual parameters
   //    System.out.println(GFG.sum(a, b));
       
       GFG g=new GFG();
   int x =  g.sum(a, b);
   System.out.println(x);
   
    }
}