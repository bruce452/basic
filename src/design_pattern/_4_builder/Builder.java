package design_pattern._4_builder;

public abstract class Builder {

    Product product=new Product();

    abstract void buildPartA();
    abstract void buildPartB();
    abstract void buildPartC();
    abstract void buildPartD();
}
