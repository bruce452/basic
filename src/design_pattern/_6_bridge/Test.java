package design_pattern._6_bridge;

public class Test {

    public static void main(String[] args) {
        Phone phone=new FoldedPhone(new Vivo());
        phone.open();
        phone.call();
        phone.close();
        System.out.println("==========");
        Phone phone1=new UpRightPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();
    }
}
