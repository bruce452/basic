package design_pattern._5_adapter.instance_adapter;

public class Test {

    public static void main(String[] args) {
        Phone phone=new Phone();

        phone.charging(new VolAdapter(new Vol220()));
    }
}
