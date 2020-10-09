package exercise2;

import java.util.Scanner;

public class EvenOrOddNmber {
  public static void main (String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("Type a Number");
  int a = input.nextInt();
  if (a%2==0){
   System.out.println("Number is even");
   } else {
   System.out.println("Number is odd");
   }
 }
}




