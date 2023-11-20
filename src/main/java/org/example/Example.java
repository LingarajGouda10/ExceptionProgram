package org.example;

 class CoustomExcpetion extends RuntimeException {
     public CoustomExcpetion(String msg) {
         super(msg);
     }
 }
 public class Example{
     public static void main(String[] args) {
         int a=10;
         int b=11;
         if (a==b) {
             throw new CoustomExcpetion("Equal");
         }else System.out.println("not equals");
     }
 }


