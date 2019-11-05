package design_pattern._7_decorator;

public class Milk extends Decorator{

    public Milk(Drink drink) {
        super(drink);
        setDes("milk 调料");
        setCost(2.5f);
    }
}
