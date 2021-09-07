package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * FileName：TestArrayList
 * Date：2021/8/18 14:31
 */
/*本类用于ArrayList实现类*/
/*List接口的大小可变数组的实现*/
public class TestArrayList {
    public static void main(String[] args) {
        /*底层会自动创建数组存放Integer类型的元素，并且数组出事容量为10*/
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(400);
        list.add(500);
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
        System.out.println(list.contains(100));
        System.out.println(list.get(0));
        System.out.println(list.indexOf(400));
        System.out.println(list.lastIndexOf(400));
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.set(2,77));
        System.out.println(list);
        System.out.println(list.remove(Integer.valueOf(300)));
        System.out.println(list);

        //通过Iterator迭代器迭代
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
