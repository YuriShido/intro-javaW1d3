// Write a program that simulates picking a card from a deck of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card. Here is a sample run of the program:
import java.lang.Math;

public class PickCard {
  public static void main(String[] args) {
    
    // System.out.println();
    int rankNum = (int)(Math.random() * 13) + 1;
    int suit = (int)(Math.random() * 4) + 1;
    String ranklast = "";
    String suitlast = "";
    switch(rankNum) {
      case 1:
      ranklast = "Ace";
      break;
      case 2:
      ranklast = "2";
      break;
      case 3:
      ranklast = "3";
      break;
      case 4:
      ranklast = "4";
      break;
      case 5:
      ranklast = "5";
      break;
      case 6:
      ranklast = "6";
      break;
      case 7:
      ranklast = "7";
      break;
      case 8:
      ranklast = "8";
      break;
      case 9:
      ranklast = "9";
      break;
      case 10:
      ranklast = "10";
      break;
      case 11:
      ranklast = "Jack";
      break;
      case 12:
      ranklast = "Queen";
      break;
      case 13:
      ranklast = "King"; 
      break;
      // default:
      // String ranklast = rankNum.ToSting();
      
    }
    switch(suit) {
      case 1:
      suitlast = "Clubs";
      break;
      case 2:
      suitlast = "Diamonds";
      break;
      case 3:
      suitlast = "Hearts";
      break;
      case 4:
      suitlast = "Spades";
      break;
    }
    System.out.println("The card you picked is " + ranklast +  " of " + suitlast);
  }
}
