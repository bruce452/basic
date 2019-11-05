package design_pattern._7_decorator;

public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDes("Chocolate 调味");
        setCost(9.4f);
    }
}
