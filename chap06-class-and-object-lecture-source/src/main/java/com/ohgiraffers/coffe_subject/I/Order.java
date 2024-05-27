package I;

public class Order {

    private final String setCoffeeMenu;
    private final String setCoffeeOption;
    private final int setCoffeeNumber;

    public Order(String setCoffeeMenu, String setCoffeeOption, int setcoffeeNumber) {
        this.setCoffeeMenu = setCoffeeMenu;
        this.setCoffeeOption = setCoffeeOption;
        this.setCoffeeNumber = setcoffeeNumber;
    }

    public String getSetCoffeeMenu() {
        return setCoffeeMenu;
    }

    public String getSetCoffeeOption() {
        return setCoffeeOption;
    }

    public int getSetCoffeeNumber() {
        return setCoffeeNumber;
    }
}


