package LLD5Example2DecoratorOrWrapperDesign;

public class Cheese implements Pizza {
    Pizza pizza;
    Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getCost() {
        return pizza.getCost() + 30;
    }

    public String getComposition() {
        return this.pizza.getComposition() + " -> Cheese";
    }

}
