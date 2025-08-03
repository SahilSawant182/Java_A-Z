//Persentage calculator
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in subject 1: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter marks in subject 2: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter marks in subject 3: ");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;
        double percentage = (total / 300.0) * 100;

        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}
