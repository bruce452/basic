package design_mode._1_singleton;


/**
 * 懒汉式  线程不安全
 *
 *
 * 优点缺点：懒加载， 仅能在单线程情况下使用
 *
 * 开发中不要使用
 *
 */

public class Lazy_Single {

    private Lazy_Single(){}

    private static Lazy_Single single;

    public static Lazy_Single getInstance(){
        if(single==null){
            single=new Lazy_Single();
        }
        return single;
    }


    public static void main(String[] args) {
        Lazy_Single single1=Lazy_Single.getInstance();
        Lazy_Single single2=Lazy_Single.getInstance();
        System.out.println(single1=single2);
        System.out.println(single1.hashCode());
        System.out.println(single2.hashCode());
    }


}
