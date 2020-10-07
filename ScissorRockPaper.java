// Write a program that plays the popular scissor-rock- paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws. Here are sample runs:
import java.util.Scanner;
import java.lang.Math;

public class ScissorRockPaper {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("scissor (0) , rock (1) , paper (2) : ");
    int person = input.nextInt();
    int computer = (int)(Math.random() * 3);

    if (person == 0)
      switch(computer) {
        case 0:
        System.out.println("The computer is scissor. You are scissor too It's a draw!");
        break;
        case 1:
        System.out.println("The computer is rock. You are scissor. You lost!");
        break;
        case 2:
        System.out.println("The computer is paper. You are scissor. You won!");
        break;
      }
      else if (person == 1)
        switch(computer) {
          case 0:
          System.out.println("The computer is scissor. You are rock! You won!");
          break;
          case 1:
          System.out.println("The computer is rock. You are rock too. It's a draw! ");
          break;
          case 2:
          System.out.println("The computer is paper. You are rock. You lost!");
          break;
        }
        else 
        switch(computer) {
          case 0:
          System.out.println("The computer is scissor. You are paper! You lost!");
          break;
          case 1:
          System.out.println("The computer is rock. You are paper. You won!");
          break;
          case 2:
          System.out.println("The computer is paper. You are paper too. It's a draw!");
          break;
        }
      
  }
}
