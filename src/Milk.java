// Concrete Decorator
public class Milk implements CoffeeDecorator {
    private Coffee wrappedCoffee;

    public void setCoffee(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }

    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Milk";
    }

    public double getCost() {
        return wrappedCoffee.getCost() + 25.00;
    }
}