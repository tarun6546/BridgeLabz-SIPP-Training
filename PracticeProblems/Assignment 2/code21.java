import java.util.Scanner;

public class code21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();

        double kilograms = pounds / 2.2;

        System.out.printf("The weight of the person in pounds is %.2f and in kg is %.2f\n", pounds, kilograms);
    }
}