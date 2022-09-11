import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SwapWithout3rdVar {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      System.out.print("Enter Number 1: ");
      int num1 = Integer.parseInt(br.readLine());

      System.out.print("Enter Number 2: ");
      int num2 = Integer.parseInt(br.readLine());
      System.out.println();
      num1 = num1 + num2;
      num2 = num1 - num2;
      num1 = num1 - num2;

      System.out.println("Value Of Number 1 = " + num1);
      System.out.println("Value Of Number 2 = " + num2);
    } catch(IOException e) { System.out.println("Something went wrong!!"); }
  }
}
