package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * FileName：TestList2
 * Date：2021/8/18 11:48
 */
/*本类用于测试List接口的元素迭代*/
public class TestList2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A君");
        list.add("B君");
        list.add("C君");
        list.add("D君");
        list.add("E君");
        list.add("F君");
//        System.out.println(list);

        //迭代集合
        /*集合的迭代方式：
        * 1》for循环--因为list集合是有序的，元素有下标，所以可以根据下标来遍历
        * 2》高效/增强for循环，foreach循环
        * 3》iterator
        * 4》listIterator
        * */
        //方式1：普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //方式2：高效for循环
        //格式：for(元素类型 元素名 : 要遍历的元素){}
        for (String s:list){
            System.out.print(s+" ");
        }
        System.out.println();
        //方式3：从父接口Collection中继承过来
        //获取遍历集合的迭代器
        Iterator<String> it = list.iterator();
        //通过获取到的迭代器循环迭代元素
        while(it.hasNext()){//判断集合中是否仍有下一个元素可迭代
            //打印迭代的元素
            System.out.print(it.next()+" ");
//            String s = it.next();
//            System.out.println(s);
        }
        System.out.println();
        /*方式4：ListIterator属于List接口特有的迭代器
        * Iterator<E>--父接口--hasNext()--next()
        * ListIterator<E>--子接口--除了父类的功能以外
        * 还有自己的特有功能，比如反向遍历，添加元素等等
        * public interface ListIterator<E> extends Iterator
        * */
        //获取迭代器
        ListIterator<String> it2 = list.listIterator();
        //迭代集合元素
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}
