import java.util.Set;
import java.util.TreeSet;

public class PizzaBuilder {
    private String crust;
    private Set<String> toppingIngredients;
    private int diameter;
    private int price;

    public PizzaBuilder() {
        this.toppingIngredients = new TreeSet<String>();
        this.diameter = 35;
        this.crust = "Original";
        this.price = this.diameter * 15;
    }

    public PizzaBuilder size(String size) {
        if (size.equals("small")) {
            this.diameter = 25;
        }
        if (size.equals("medium")) {
            this.diameter = 35;
        }
        if (size.equals("large")) {
            this.diameter = 40;
        }
        return this;
    }

    public PizzaBuilder crust(String crust) {
        this.crust = crust;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        if (topping.equals("Meat Lovers")) {
            this.toppingIngredients.add("beef");
            this.toppingIngredients.add("mozarella");
        }
        if (topping.equals("Tuna Melt")) {
            this.toppingIngredients.add("tuna");
            this.toppingIngredients.add("corn");
            this.toppingIngredients.add("mozarella");
        }
        if (topping.equals("Supreme")) {
            this.toppingIngredients.add("pepperoni");
            this.toppingIngredients.add("beef");
            this.toppingIngredients.add("mushroom");
            this.toppingIngredients.add("pineapple");
        }
        return this;
    }

    public Pizza build() {
        Pizza P = new Pizza();
        this.price = 0;
        if (this.crust.equals("Cheesy Bites")) {
            this.price += 10;
        }
        else if (this.crust.equals("Stuffed")) {
            this.price += 20;
        }
        P.setCrust(this.crust);
        for (String ingredient : toppingIngredients) {
            P.addToppingIngredient(ingredient);
        }
        P.setDiameter(this.diameter);
        this.price += 15 * this.diameter + 10 * this.toppingIngredients.size();
        P.setPrice(this.price);
        return P;
    }
}