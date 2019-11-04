package design_pattern._6_bridge;

public class XiaoMi implements Brand{
    @Override
    public void call() {
        System.out.println("brand:xiaomi  call");
    }

    @Override
    public void open() {
        System.out.println("brand:xiaomi  open");
    }

    @Override
    public void close() {
        System.out.println("brand:xiaomi  close");
    }
}
