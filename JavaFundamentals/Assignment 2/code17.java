import java.util.Scanner;

public class code17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = scanner.nextDouble();

        double side = perimeter / 4;

        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);
    }
}