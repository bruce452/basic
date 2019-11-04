package design_pattern._4_builder;

public class Director {
    Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    private void construct(){
        this.builder.buildPartA();
        this.builder.buildPartB();
        this.builder.buildPartC();
        this.builder.buildPartD();
    }


    public static void main(String[] args) {
        Director director=new Director();
        director.setBuilder(new ConcreteBuilder());
        director.construct();
    }
}
