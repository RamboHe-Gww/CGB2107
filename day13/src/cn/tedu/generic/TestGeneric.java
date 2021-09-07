package cn.tedu.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName：TestGeneric
 * Date：2021/8/17 16:41
 */
/*本类用于测试泛型的好处1*/
public class TestGeneric {
    public static void main(String[] args) {
        //定义String类型长度为5的动态数组
        String[] a = new String[5];
        a[2] = "泡泡";
        a[4] = "霞霞";
        //数组的好处：在编译时期检查数据的类型，如果不是要求的类型在编译器自动报错
        /*1》泛型是怎么来的？--想要模拟数组的数据类型检查
        * 2》泛型通常结合着集合一起使用*/
        List list = new ArrayList<>();//注意导包
        //向集合存入数据
        list.add("涛涛");
        list.add(1);
        list.add(7.7);
        list.add('a');
        System.out.println(list);//打印查看集合元素
        /*3》引入泛型--主要目的：约束集合中元素的类型
        * 4》泛型的好处：可以报错的时机提前，在编译期就报错，而不是运行后才抛出异常
        * 在向集合中添加元素时，会先检查元素的数据类型，如果不是要求的数据类型就编译失败*/
        List<String> list2 = new ArrayList<>();
        list2.add("雷神");//约束了集合类型后，只可以传String类型的参数
//        list2.add(2);

        /*5》<type>--type的值必须是引用类型，不能使用基本类型，至于使用什么类型取决于业务需求*/
//        List<int> list3 = new ArrayList<>()
        //以下三种样式效果一样
//        List<Integer> list3 = new ArrayList();
        List<Integer> list3 = new ArrayList<>();
//        List<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
