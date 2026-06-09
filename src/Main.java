public class Main {
    public static void main(String[] args) {
        double springCost = 200.00;   // lawn care, planting
        double summerCost = 150.00;   // pest control, AC tune-up
        double fallCost = 100.00;     // gutter cleaning, leaf removal
        double winterCost = 50.00;    // weatherproofing, salt/sand
        double totalYearlyCost = 0.0;

        totalYearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Spring: $" + springCost);
        System.out.println("Summer: $" + summerCost);
        System.out.println("Fall:   $" + fallCost);
        System.out.println("Winter: $" + winterCost);
        System.out.println("Total Yearly Cost: $" + totalYearlyCost);
    }
}