public class Main {
    public static void main(String[] args) {
        double springCost = 200.00;
        double summerCost = 150.00;
        double fallCost = 100.00;
        double winterCost = 50.00;
        double totalYearlyCost = 0.0;

        totalYearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Spring: $" + springCost);
        System.out.println("Summer: $" + summerCost);
        System.out.println("Fall:   $" + fallCost);
        System.out.println("Winter: $" + winterCost);
        System.out.println("Total Yearly Cost: $" + totalYearlyCost);
    }
}