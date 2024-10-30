import java.util.Scanner;

public class YearlyMaintenanceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter maintenance cost for Spring: ");
        double springCost = input.nextDouble();

        System.out.print("Enter maintenance cost for Summer: ");
        double summerCost = input.nextDouble();

        System.out.print("Enter maintenance cost for Fall: ");
        double fallCost = input.nextDouble();

        System.out.print("Enter maintenance cost for Winter: ");
        double winterCost = input.nextDouble();

        double yearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Spring Cost: $" + springCost);
        System.out.println("Summer Cost: $" + summerCost);
        System.out.println("Fall Cost: $" + fallCost);
        System.out.println("Winter Cost: $" + winterCost);
        System.out.println("Total Yearly Maintenance Cost: $" + yearlyCost);
    }
}
