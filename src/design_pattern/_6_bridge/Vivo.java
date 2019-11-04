package design_pattern._6_bridge;

public class Vivo implements Brand{
    @Override
    public void call() {
        System.out.println("brand:vivo  call");
    }

    @Override
    public void open() {
        System.out.println("brand:vivo  open");
    }

    @Override
    public void close() {
        System.out.println("brand:vivo  close");
    }
}
