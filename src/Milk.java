// Concrete Decorator
public class Milk implements CoffeeDecorator {
    private Coffee wrappedCoffee;

    public void setCoffee(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 25.00;
    }
}