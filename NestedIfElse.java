import java.math.*;
public class NestedIfElse {
    public static void main(String[] args) {
        String shape = "Sphere";
        String formula = "SA";
        if(shape == "Sphere") {
            if(formula == "Volume") {
                System.out.println("Volume Of Sphere = [4 * " + Math.PI + " * r * r * r]");
            } else {
                if(formula == "SA") {
                    System.out.println("Surface Area Of Sphere = [2/3 * " + Math.PI + " * r * r]");
                }
            }
        }
    }
}
