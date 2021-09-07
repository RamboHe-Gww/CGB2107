package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * FileName：TestCollection
 * Date：2021/8/18 9:48
 */
/*本类用于测试父接口Collection中常用方法*/
public class TestCollection {
    public static void main(String[] args) {
        //创建Collection相关对象
//        Collection c = new Collection();//报错，Collection为接口不能实例化
        //<Integer>为泛型，用于约束集合中的元素类型，这个类型必须是引用类型不能是基本类型
        Collection<Integer> c = new ArrayList<>();
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(400);
        c.add(500);
        System.out.println(c);//[100, 200, 300, 400, 500]

        //测试集合常用方法
//        c.clear();//清空集合元素
//        System.out.println(c);//[]

        System.out.println(c.hashCode());//获取集合对象对应哈希码值
        System.out.println(c.toString());//重写后实现，[100, 200, 300, 400, 500]
        System.out.println(c.equals(200));//false，不能用集合对象与200做比较
        System.out.println(c.contains(200));//true，判断c集合中是否包含元素200
        System.out.println(c.isEmpty());//false，判断集合是否为空

        System.out.println(c.remove(200));//true
        System.out.println(c);//[100, 300, 400, 500
        System.out.println(c.size());//4，获取集合元素个数
        Object[] array = c.toArray();//将指定的集合c转为数组，使用多态思想，数组类型为Object
        System.out.println(array);//打印地址值，[Ljava.lang.Object;@1b6d3586
        System.out.println(Arrays.toString(array));

        Collection<Integer> c2 = new ArrayList<>();
        c2.add(1);
        c2.add(2);
        c2.add(3);
        System.out.println(c2);//[1, 2, 3]

        c.addAll(c2);//把c2集合中所有元素添加到c集合中
        System.out.println(c);//[100, 300, 400, 500, 1, 2, 3]
        System.out.println(c2);//[1, 2, 3]，c2集合本身没有改变

        System.out.println(c.containsAll(c2));//true，判断c集合是否包含c2集合的所有元素
        System.out.println(c);//false，判断c集合是否包含指定元素5

        //删除c集合中属于c2集合的所有元素
        System.out.println(c.removeAll(c2));
        System.out.println(c);//[100, 300, 400, 500]
        c.add(999);
        System.out.println(c);
        System.out.println(c.retainAll(c2));//true
        System.out.println(c);//[]
        System.out.println(c2);//[1, 2, 3]
        c.add(3);
        c.add(100);
        System.out.println(c);//[3, 100]
        System.out.println(c.retainAll(c2));//true
        System.out.println(c);//[3]

        //迭代/遍历集合
        /*迭代步骤：
        * 1》获取集合的迭代器 c.iterator()
        * 2》判断集合中是否有下一个元素可迭代 it.hasNext()
        * 3》获取当前迭代器迭代到的元素 it.next()
        * */
        Iterator<Integer> it = c2.iterator();//获取迭代器
        while(it.hasNext()){//判断是否有下一个元素迭代，如果有，循环继续
//            System.out.println(it.next());
            Integer num = it.next();//获取本轮迭代到的元素
            System.out.println("本次迭代到的元素为："+num);

        }

    }
}
