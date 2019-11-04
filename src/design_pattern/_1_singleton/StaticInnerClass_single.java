package design_pattern._1_singleton;


/**
 *
 * 静态内部类  单例模式
 *
 * 类加载的时候静态内部类不会被加载
 *
 * 只有调用getInstance方法的时候才会装载内部类
 *
 * 类的静态属性会在第一次加载类的时候初始化
 *
 *
 * 满足线程安全和延迟加载
 *
 */

public class StaticInnerClass_single {

    private StaticInnerClass_single(){}

    private static class StaticInner{
        private static final StaticInnerClass_single INNER=new StaticInnerClass_single();
    }

    public static StaticInnerClass_single getInstance(){
        return StaticInner.INNER;
    }

    public static void main(String[] args) {
        StaticInnerClass_single s1=StaticInnerClass_single.getInstance();
        StaticInnerClass_single s2=StaticInnerClass_single.getInstance();
        System.out.println(s1==s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}

