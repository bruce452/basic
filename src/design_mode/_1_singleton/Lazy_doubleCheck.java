package design_mode._1_singleton;




/**
 *
 * 双重检查
 *
 *
 * 线程安全  并且  懒加载
 *
 *
 * 开发中推荐使用
 *
 *
 */

public class Lazy_doubleCheck {

    private Lazy_doubleCheck(){}


    /**
     * 如果一个变量被声明volatile的话，那么这个变量不会被进行重排序
     *
     *
     * volatile关键字能够保证代码的有序性
     *
     *
     * 一个被volatile声明的变量主要有以下两种特性保证保证线程安全。
     *       可见性。
     *       有序性。
     *
     *
     * volatile关键字不一定能够保证线程安全的问题，其实，在大多数情况下volatile还是可以保证变量的线程安全问题的
     *
     * 
     * 在满足以下两个条件的情况下，volatile就能保证变量的线程安全问题：
     *     运算结果并不依赖变量的当前值，或者能够确保只有单一的线程修改变量的值。
     *     变量不需要与其他状态变量共同参与不变约束。
     *
     */
    private static volatile Lazy_doubleCheck single;

    public static Lazy_doubleCheck getInstance(){
        if(single==null){
            synchronized (Lazy_doubleCheck.class){
                if(single==null){
                    single=new Lazy_doubleCheck();
                }
            }
        }
        return single;
    }


}
