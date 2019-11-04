package design_pattern._6_bridge;

public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }


    @Override
    protected void call() {
        super.call();
        System.out.println("folderphone");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("folderphone");
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("folderphone");
    }
}
