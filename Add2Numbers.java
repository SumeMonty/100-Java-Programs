import java.util.Scanner;
class Add2Numbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    System.out.print("Enter First Number: ");
    num1 = sc.nextInt();
    System.out.print("Enter Second Number: ");
    num2 = sc.nextInt();
    System.out.println("Sum Of " + num1 + " and "  + num2 + " is " + (num1+num2));
    sc.close();
  }
}
