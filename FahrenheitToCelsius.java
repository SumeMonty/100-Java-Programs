import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class FahrenheitToCelsius {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    float tempF, tempC; 
    System.out.println("Program for Converting Fahrenheit To Celsius in Java!!");
    
    try {
      System.out.print("Enter Temperature In Fahrenheit: ");
      tempF = Float.parseFloat(br.readLine());
      System.out.println(tempF);
      tempC = (tempF - 32)/1.8F;
      System.out.println("Temperature In Celsius: " + tempC);
    } catch(IOException ioe) {
      System.out.println("Something went wrong!!");
    }
  }
}