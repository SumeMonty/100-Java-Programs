import java.util.Scanner;

class ScannerInput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name;
    int num;
    System.out.println("Program for User Input in Java using Scanner!");
    
    System.out.print("\nEnter Your Name: ");
    name = sc.next();
    System.out.print("Your name is " + name);

    System.out.print("\n\nEnter Any Number: ");
    num = sc.nextInt();
    System.out.print("The entered number is " + num);
    sc.close();
  }
}
