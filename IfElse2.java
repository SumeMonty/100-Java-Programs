public class IfElse2 {
    private static boolean isMoving = true;
    private static int currentSpeed = 10;
    public static void main(String[] args) {
        applyBrakes();
    }
    public static void applyBrakes() {
        if (isMoving) {
            if(!(--currentSpeed>0)) { isMoving = false; }
            System.out.println("The bicycle is still moving!");
            applyBrakes();
        } else {
            System.out.println("The bicycle has already stopped!");
        } 
    }
}
