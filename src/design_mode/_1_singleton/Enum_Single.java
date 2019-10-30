package design_mode._1_singleton;

public class Enum_Single {

    public static void main(String[] args) {
        Singleton singleton1=Singleton.INSTANCE;
        Singleton singleton2=Singleton.INSTANCE;
        System.out.println(singleton1==singleton2);
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        singleton1.say();
    }
}



enum Singleton{
    INSTANCE;
    public void say(){
        System.out.println("single");
    }
}