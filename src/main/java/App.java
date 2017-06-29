import java.io.Console;

public class App {
  public static void main(String[] args) {
    while (true) {
    Console myConsole = System.console();
    System.out.println("Enter a year, we'll tell you if it's a leap year:");
    int inputYear = Integer.parseInt(myConsole.readLine());
    LeapYear leapYear = new LeapYear();
    boolean leapYearResult = leapYear.isLeapYear(inputYear);
    System.out.println("Is that a leap year? " + leapYearResult);
  }
  }
}
