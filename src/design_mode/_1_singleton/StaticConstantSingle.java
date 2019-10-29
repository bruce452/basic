package design_mode._1_singleton;


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
public class StaticConstantSingle {

    private static final StaticConstantSingle single=new StaticConstantSingle();

    private StaticConstantSingle(){}

    public static StaticConstantSingle getInstance(){
        return single;
    }

}
