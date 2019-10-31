package basis;

import com.sun.javafx.collections.ImmutableObservableList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Arrays_Collections {

    public static void print(List list){
        System.out.println(list.getClass());
        System.out.println(list.toString());

    }

    /**
     * Arrays.asList() 参数必须时对象数组。
     * 当传入的时一个原生数据类型数组时，该方法得到的真正参数不是数组中的元素，而是数组对象本身。如下int a[]
     *
     * Arrays.asList() 的返回值是List，但是底层依然是数组，因此使用list的方法会报不支持的错误。
     *
     *
     */
    public static void testArrays(){
        int[] a={1,2,3};
        List la=Arrays.asList(a);
        System.out.println(la.size());

        Integer b[]={1,2,3};
        List lb = Arrays.asList(b);
        System.out.println(lb.size());
        //lb.add(5);
        //System.out.println(lb.size());


        String[] c=new String[]{"a","b","c"};
        List<String> list = Arrays.asList(c);
        System.out.println(list.toString());
        list.add("d");
    }


    /**
     * 将数组转换成list的推荐方法
     * @param args
     */

    public static void array_to_list(){

        System.out.println("推荐方法1:最简便");
        List list1=new ArrayList<>(Arrays.asList("1","2","3"));
        print(list1);
        System.out.println("=================");


        System.out.println("推荐方法2:java8 stream");
        Integer i1[]={1,2,3};
        List list2=Arrays.stream(i1).collect(Collectors.toList());
        print(list2);

        int i2[]={2,3,4};
        //boxed方法执行装箱操作
        List list3=Arrays.stream(i2).boxed().collect(Collectors.toList());
        print(list3);
        System.out.println("=================");

    }


    public static void main(String[] args) {
         //Arrays_Collections.testArrays();
        array_to_list();

    }

}

