package design_pattern._1_singleton;




/**
 * 饿汉单例模式   静态代码块中实现实例化
 * 可以使用，但有可能浪费内存
 *
 *
 *
 * 优点：类装载的时候会执行静态代码块中的代码，完成实例化，避免了线程同步的问题。
 *
 * 缺点：如果从始至终没有使用这个实例，造成内存浪费。
 *
 */

public class Hungry_StaticCodeSingle {

    private Hungry_StaticCodeSingle(){}

    private static Hungry_StaticCodeSingle staticCodeSingle;

    static{
        staticCodeSingle=new Hungry_StaticCodeSingle();
    }

    public static Hungry_StaticCodeSingle getInstance(){
        return staticCodeSingle;
    }


    public static void main(String[] args) {
        Hungry_StaticCodeSingle single1= Hungry_StaticCodeSingle.getInstance();
        Hungry_StaticCodeSingle single2= Hungry_StaticCodeSingle.getInstance();
        System.out.println(single1==single2);
        System.out.println(single1.hashCode());
        System.out.println(single2.hashCode());
    }

}
