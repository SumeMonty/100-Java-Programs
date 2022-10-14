import java.util.Scanner;

class LargestNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    System.out.print("Enter First Number: ");
    a = sc.nextInt();
    System.out.print("Enter Second Number: ");
    b = sc.nextInt();
    System.out.print("Enter Third Number: ");
    c = sc.nextInt();

    if(a>b && a>c) {
      System.out.println("Largest Number: " + a);
    } else {
      if(b>a && b>c) System.out.println("Largest Number: " + b);
      else if(c>b && c>a) System.out.println("Largest Number: " + c);
      else System.out.println("Please Enter Distinct Numbers!");
    }
  }
}
