package LLD5Example2DecoratorOrWrapperDesign;

public class PizzaBase implements Pizza {
    Pizza pizza = null;
    PizzaBase() {

    }

    PizzaBase(Pizza pizza) {
        this.pizza = pizza;
    }
    public int getCost() {
        if(pizza == null)
            return 50;
        else return pizza.getCost() + 50;
    }

    public String getComposition() {
        if(pizza == null)
            return "Pizza Base";
        else return pizza.getComposition() + " -> Pizza Base";
    }
}
