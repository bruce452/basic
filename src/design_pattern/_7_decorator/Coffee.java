package design_pattern._7_decorator;

public class Coffee extends Drink {
    @Override
    public Float calCost() {
        return super.getCost();
    }
}
