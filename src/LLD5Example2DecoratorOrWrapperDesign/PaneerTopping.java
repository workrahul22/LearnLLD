package LLD5Example2DecoratorOrWrapperDesign;

public class PaneerTopping implements Pizza{
    Pizza pizza;
    PaneerTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    public int getCost() {
        return pizza.getCost() + 50;
    }

    public String getComposition() {
        return pizza.getComposition() + " -> Paneer";
    }
}
