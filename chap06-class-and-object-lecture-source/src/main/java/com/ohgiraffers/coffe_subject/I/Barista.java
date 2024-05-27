package I;

public class Barista {

    private int coffeeStock = 5000; // 5000g 커피보유

    public Coffee[] makeCoffee(Order order) {

        Coffee[] coffees = new Coffee[order.getSetCoffeeNumber()];

        for (int i = 0; i < coffees.length; i++) {
            coffees[i] = new Coffee(order.getSetCoffeeMenu(), order.getSetCoffeeOption());
        }

        return coffees;
    }
}
