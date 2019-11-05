package design_pattern._7_decorator;

public class Test {

    public static void main(String[] args) {
        Drink order=new Decaf();
        System.out.println(order.getDes());
        System.out.println(order.calCost());

        order=new Milk(order);
        System.out.println(order.getDes());
        System.out.println(order.calCost());
    }
}
