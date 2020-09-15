import java.util.Scanner;

/**
 * Allows you to calculate the deducted price of an item
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user to enter the amount of money the customer spent
    System.out.println("Please enter the amount the customer spent");
    
    // Gets the amount of money the customer spent
    double money = input.nextDouble();

    // Calculates the money that they save and shows the total
    if (money > 120){
      System.out.println("They will receive 40% off");
      System.out.println("They will save " + money * 0.4);
      System.out.println("The new total is " + (money - money * 0.4));
    }
    if (money > 80){
      System.out.println("They will receive 30% off");
      System.out.println("They will save " + money * 0.3);
      System.out.println("The new total is " + (money - money * 0.3));
    }
    if (money > 40){
      System.out.println("They will receive 20% off");
      System.out.println("They will save " + money * 0.2);
      System.out.println("The new total is " + (money - money * 0.2));
    }
    if (money >= 0.01){
      System.out.println("They will receive 10% off");
      System.out.println("They will save " + money * 0.1);
      System.out.println("The new total is " + (money - money * 0.1));
    }

  }
}
