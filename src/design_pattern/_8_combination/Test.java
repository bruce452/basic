package design_pattern._8_combination;

public class Test {

    public static void main(String[] args) {
        University university=new University("清华","羡慕");
        College college1=new College("软件","很强");
        College college2=new College("计算机","超强");

        college1.add(new Department("软件1","相对一般"));
        college1.add(new Department("软件2","相对很强"));

        college2.add(new Department("计算1","超强哈哈哈"));
        college2.add(new Department("计算2","没有敌手"));

        university.add(college1);
        university.add(college2);

        university.print();
        college1.print();


    }
}
