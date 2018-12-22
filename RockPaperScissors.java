import javax.swing.JOptionPane;
public class RockPaperScissors{


  public static boolean isBetween(double smallerValue , double biggerValue, double input){
    if(input < biggerValue && input > smallerValue ){
      return true;
    }else{
      return false;
    }
  }

  public static boolean isReversed(String input){
    String reversed = "";
    for(int i = input.length()-1; i >= 0; i--){
      reversed += input.charAt(i);
    }

    if(input.toLowerCase().equals(reversed.toLowerCase())){
      return true;
    }else{
      return false;
    }
  }

  /*
    Possible combinations:
    rr, rp, rs, pr, pp, ps,sr, sp, ss

    same input : rr,pp,ss

    individual request: rp,rs,pr,ps,sr,sp

    real individual because not reversed
    rp,rs,ps

    example
    rp ,pr
    rock paper or paper rock

    */

  public static void main(String... args){

    //Variable declarations
    String userInput = "";
    String computerValue = "";
    String winnerText = "You won :) ";
    String loserText = "You lost :( ";
    String[] items = {"rock", "paper", "scissors"};

    double rockValue = 0.3;
    double paperValue = 0.6;
    double scissorsValue = 1.0;
    double randomValue = 0;

    while(true){
      //Get initial user input
      userInput = JOptionPane.showInputDialog(null,"Enter your choise:");
      userInput = userInput.toLowerCase();
      //Get a random number for the computer
      randomValue = java.lang.Math.random();

      //Check which item the computer got
      if(isBetween(0.0,rockValue, randomValue)){
        computerValue = "rock";
      }else if (isBetween(rockValue, paperValue, randomValue)){
        computerValue = "paper";
      } else{
        computerValue = "scissors";
      }

      //Game logic
      if(userInput.equals(computerValue)){
        JOptionPane.showMessageDialog(null, "You tied with " + userInput);

      } else if(items[0].equals(userInput) && items[1].equals(computerValue)){
        JOptionPane.showMessageDialog(null, loserText + "\nYour input: " + userInput + "\nComputer: "  +computerValue);
      } else if(items[0].equals(userInput) && items[2].equals(computerValue)){
        JOptionPane.showMessageDialog(null, winnerText + "\nYour input: " + userInput + "\nComputer: "  +computerValue);
      }

      else if(items[1].equals(userInput) && items[0].equals(computerValue)){
        JOptionPane.showMessageDialog(null, winnerText + "\nYour input: " + userInput + "\nComputer: "  +computerValue);
      } else if(items[1].equals(userInput) && items[2].equals(computerValue)){
        JOptionPane.showMessageDialog(null, loserText + "\nYour input: " + userInput + "\nComputer: "  +computerValue);
      }

      else if(items[2].equals(userInput) && items[0].equals(computerValue)){
        JOptionPane.showMessageDialog(null, loserText + "\nYour input: " + userInput + "\nComputer: "  +computerValue);
      } else if(items[2].equals(userInput) && items[1].equals(computerValue)){
        JOptionPane.showMessageDialog(null, winnerText + "\nYour input: " + userInput + "\nComputer: "  +computerValue);
      } else{
        JOptionPane.showMessageDialog(null,"Well.. I guess you did good... or spelled something wrong! :P");
      }
    }

  }
}
