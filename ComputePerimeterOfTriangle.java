import java.util.Scanner;

public class ComputePerimeterOfTriangle {
   
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is the three of triangle perimeter?");
    int perimeterA = input.nextInt();
    int perimeterB = input.nextInt();
    int perimeterC = input.nextInt();
    if (perimeterA < (perimeterB + perimeterC) && perimeterB < (perimeterA + perimeterC) && perimeterC < (perimeterB + perimeterA))
    System.out.println("The perimeter of triangle is " + (perimeterA + perimeterB + perimeterC));

    else System.out.println("invalid triangle");
  }
}