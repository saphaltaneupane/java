package assignment1;
import java.util.*;
import java.math.*;
import java.util.Scanner;
public class CylinderVolume {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius and height of the cylinder");
		int r = s.nextInt();
		int h = s.nextInt();
		System.out.println("The  volume of the cylinder is :"+ Math.PI*r*r*h);
	}
}
