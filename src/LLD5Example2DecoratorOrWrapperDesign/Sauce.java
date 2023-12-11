package LLD5Example2DecoratorOrWrapperDesign;

public class Sauce implements Pizza {
    Pizza pizza;

    Sauce(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getCost() {
        return this.pizza.getCost() + 10;
    }

    public String getComposition() {
        return this.pizza.getComposition() + " -> Sauce";
    }
}
