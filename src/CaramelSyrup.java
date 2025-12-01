// Concrete Decorator
public class CaramelSyrup implements CoffeeDecorator {
    private Coffee wrappedCoffee;

    public void setCoffee(Coffee coffee) {
        this.wrappedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return wrappedCoffee.getDescription() + ", Caramel Syrup";
    }

    @Override
    public double getCost() {
        return wrappedCoffee.getCost() + 40.00;
    }
}