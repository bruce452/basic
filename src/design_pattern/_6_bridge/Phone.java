package design_pattern._6_bridge;

public abstract class Phone {
    Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void call(){
        this.brand.call();
    }

    protected void close(){
        this.brand.close();
    }

    protected void open(){
        this.brand.open();
    }


}
