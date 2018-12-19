import java.util.Random;
import javax.swing.JOptionPane;


public class RockPaperScissors{

public static boolean isBetween(double smallerValue , double biggerValue, double input){
  if(input < biggerValue && input > smallerValue ){
    return true;
  }else{
    return false;
  }
}

  public static void main(String... args){

    String winnerText = "You won!";
    String loserText = "You lose";
    String userInput = "";
    String[] items = {"Rock", "Paper", "Scissors"};

    double rockValue = 0.333;
    double paperValue = 0.6666;
    double scissorsValue = 1.0;
    double coincidenceValue  = java.lang.Math.random();

    //Start
    userInput = JOptionPane.showInputDialog(null,"Choose your item:");

    //User-Output
    System.out.println("Your input was: " + userInput);
    System.out.print(coincidenceValue + " --> ");


    //Checks if you won a game
    if(items[0].equals(userInput) && (isBetween(0.0,rockValue,coincidenceValue))){
      System.out.println(winnerText);

    }else if(items[1].equals(userInput) && (isBetween(rockValue, paperValue, coincidenceValue))){
      System.out.println(winnerText);

    }else if(items[2].equals(userInput) && (isBetween(paperValue, scissorsValue, coincidenceValue))){
      System.out.println(winnerText);

    }else{
      System.out.println(loserText);
    }
  }
}
