package design_pattern._6_bridge;

public class UpRightPhone extends Phone{
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("uprightphone");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("uprightphone");
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("uprightphone");
    }
}
