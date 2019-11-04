package design_pattern._1_singleton;


/**
 * 饿汉单例模式    静态常量
 * 可以使用，但有可能浪费内存
 *
 *
 *
 * 优点：类装载的时候完成实例化，避免了线程同步的问题。
 *
 * 缺点：如果从始至终没有使用这个实例，造成内存浪费。
 *
 */
public class Hungry_StaticConstantSingle {

    private static final Hungry_StaticConstantSingle single=new Hungry_StaticConstantSingle();

    private Hungry_StaticConstantSingle(){}

    public static Hungry_StaticConstantSingle getInstance(){
        return single;
    }


    public static void main(String[] args) {
        Hungry_StaticConstantSingle single1= Hungry_StaticConstantSingle.getInstance();
        Hungry_StaticConstantSingle single2= Hungry_StaticConstantSingle.getInstance();
        System.out.println(single1==single2);
        System.out.println(single1.hashCode());
        System.out.println(single2.hashCode());
    }

}
