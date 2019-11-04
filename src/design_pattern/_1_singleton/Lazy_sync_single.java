package design_pattern._1_singleton;


/**
 * 懒汉式 线程不安全  如果进入多个线程进入if语句，会创建多个实例
 *
 * 开发不要使用
 */


public class Lazy_sync_single {

    private Lazy_sync_single(){}

    private static Lazy_sync_single single;

    public static Lazy_sync_single getInstance(){
        if(single==null){
            synchronized(Lazy_sync_single.class){
                single=new Lazy_sync_single();
            }
        }
        return single;
    }
}
