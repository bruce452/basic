package design_pattern._5_adapter.interface_adapter;

public class Test {
    public static void main(String[] args) {
        V11 v11=new V11() {
            @Override
            public void m2() {
                System.out.println("只使用m2方法");
            }
        };
        v11.m2();
    }
}
