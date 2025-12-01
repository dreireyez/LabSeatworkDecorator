// Main class used to test the functionality of the decorator design pattern
public class Brewtiful {
    public static void main(String[] args) {
        // An order of black coffee with both milk and caramel syrup.
        Coffee blackCoffee = new BlackCoffee();
        Milk coffeeWithMilk = new Milk();
        coffeeWithMilk.setCoffee(blackCoffee);
        CaramelSyrup coffeeWithSyrup = new CaramelSyrup();
        coffeeWithSyrup.setCoffee(coffeeWithMilk);

        System.out.println("Welcome to Brewtiful!");

        System.out.println("ORDER SUMMARY:");
        System.out.println("1x" + coffeeWithSyrup.getDescription());
        System.out.println("Order Total: ₱ "+coffeeWithSyrup.getCost());
    }
}