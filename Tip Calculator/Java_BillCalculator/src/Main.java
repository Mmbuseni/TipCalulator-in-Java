import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*This is a simple tip calculator in Java*/
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the total bill amount? ");
        double totalBill = scanner.nextDouble();

        System.out.print("What is the tip? ");
        float tip = scanner.nextFloat();

        System.out.print("How many people are you splitting the bill amongst? ");
        int people = scanner.nextInt();

        TipCalculator(totalBill, tip, people);
    }

    public static void TipCalculator(double _totalBill, float _tip, int _people)
    {
        double billPerPerson = (_totalBill + (_totalBill * (_tip/100)))/_people;

        System.out.format("The amount that each person has to pay is %.2f", billPerPerson);
    }
}