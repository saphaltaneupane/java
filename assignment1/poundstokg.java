package assignment1;

import java.util.Scanner;
public class poundstokg {
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the weight in pound");
  double p = s.nextDouble();
  double k = 0.454 * p;
  System.out.println("The weight in kg is :"+k);
 }
}
