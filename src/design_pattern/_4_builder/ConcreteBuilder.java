package design_pattern._4_builder;

public class ConcreteBuilder extends Builder{

    @Override
    void buildPartA() {
        System.out.println("ConcreteBuilder创建a部分");
    }

    @Override
    void buildPartB() {
        System.out.println("ConcreteBuilder创建b部分");
    }

    @Override
    void buildPartC() {
        System.out.println("ConcreteBuilder创建c部分");
    }

    @Override
    void buildPartD() {
        System.out.println("ConcreteBuilder创建d部分");
    }
}
