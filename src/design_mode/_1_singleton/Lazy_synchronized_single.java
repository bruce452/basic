package design_mode._1_singleton;


/**
 * 线程安全，效率太低，不推荐
 */


public class Lazy_synchronized_single {

    private Lazy_synchronized_single(){}

    private static Lazy_synchronized_single single;

    public static synchronized Lazy_synchronized_single getInstance(){
        if(single==null){
            single=new Lazy_synchronized_single();
        }
        return single;
    }
}
