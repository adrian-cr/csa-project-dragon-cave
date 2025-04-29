package src.main.java.com.cognizant.csa.project;

import java.util.Scanner;

import static java.util.Arrays.asList;

public class DragonCave {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Initializes Scanner object.
    int winningChoice = (int) Math.ceil(Math.random() * 2); // Determines winning cave at random.
    
    System.out.println(
      "Greetings, stranger! Thou art to venture into\n" +
      "the unknown depths of the twin caves of King Fyrgis, where unimaginable\n" +
      "wealth and rarities abound. But beware, for two fierce beasts lie on the\n" +
      "inside, one in each of the enchanted caves. One wileth share their\n" +
      "glory with thee, while the other wileth pour their blazing rain onto thy\n" +
      "valiant soul. Choose wisely and thou shalt prosper—choose poorly and\n" +
      "thou shalt perish!\n"); // Prints introductory message.
    System.out.println(
      "Please select one of the following by entering the" +
      " corresponding number:\n\n" +
      "[ CAVE 1 ]    [ CAVE 2 ]"); // Prompts user for an option.
    
    
    int userChoice = sc.nextInt(); // Attempts to convert String to Integer.
    if (asList(1, 2).contains(userChoice)) { // Checks if number entered is a valid cave number.
      if (winningChoice==userChoice) { //Checks if user's choice the program's.
        System.out.println(
          "Thou hast found Ghyrilden, the wise blue dragon of\n" +
          "Ilfroend. Fierce though it mayeth seem, it owneth a gentle soul and a great\n" +
          "heart. Thou art free to take whatever riches thou mayst encounter and leave.\n" +
          "\n*****YOU WIN!*****"); // Prints congratulatory message.
      } else {
        System.out.println(
          "Thou hast found Kmerilwaleg, the fearsome dragon\n" +
          "of Hufrilgrex, kingdom of the Tenebrous Lord. Lurking from the top of\n" +
          "a mountain of jewels and gold, it sett its eyes upon thee. With an evil\n" +
          "gaze and a vicious smirk, it breatheth a sun-like fireball and spiteth it\n" +
          "into the ground, setting ablaze everything underneath. Kmerilwaleg's cruel\n" +
          "wrath hath become our valiant knight's last sight...\n" +
          "\n*****YOU LOSE!*****"); //Prints losing message.
      }//if-else
    }//if
  }//main()
}//DragonCave
