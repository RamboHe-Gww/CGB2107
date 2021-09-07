package cn.tedu.collection;

import java.util.*;

/**
 * FileName：TestList
 * Date：2021/8/18 11:15
 */
/*本类用于List接口的方法测试*/
public class TestList {
    public static void main(String[] args) {
        //创建List接口的多态对象，List为接口，不可实例化
        List<String> list = new ArrayList<>();

        //向集合中添加元素
        list.add("大力娃");
        list.add("千顺娃");
        list.add("头铁娃");
        list.add("喷火娃");
        list.add("喷水娃");
        list.add("隐身娃");
        list.add(0,"小紫娃");
        System.out.println(list);

        //测试继承自Collection的方法
//        list.clear();
//        System.out.println(list);//[]
        System.out.println(list.contains("喷火娃"));//true，判断是否包含指定元素
        System.out.println(list.isEmpty());//false,判断集合是否为空
        System.out.println(list.remove("小紫娃"));//true，移除集合中的指定元素
        System.out.println(list.size());//6，获取集合元素的个数
        System.out.println(Arrays.toString(list.toArray()));//集合转为数组
//        Object[] array = list.toArray();
//        System.out.println(Arrays.toString(array));

        //测试集合间的操作
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        System.out.println(list2);//[1, 2, 3, 4]
        System.out.println(list.addAll(1,list2));//true，将list2中所有元素加到list中
        System.out.println(list);
        System.out.println(list.containsAll(list2));//true，判断list中是否包含list2的所有元素
        System.out.println(list.removeAll(list2));//移除list中属于list2的所有内容
        System.out.println(list);

        //在list集合下标为1的地方添加list2的所有元素
//        System.out.println(list.addAll(1,list2));
//        System.out.println(list);

        //测试List接口中独有的方法
        list.add("小蝴蝶");//追加在最后
        list.add(1,"蛇精");
        list.add(3,"小蝴蝶");
        System.out.println(list);
        System.out.println(list.indexOf("小蝴蝶"));//3，判断元素第一次出现的位置
        System.out.println(list.lastIndexOf("小蝴蝶"));//8，判断元素最有一次出现的位位置
        System.out.println(list.remove(5));//根据索引删除指定元素
        System.out.println(list);
        System.out.println(list.get(3));//获取指定位置的元素
        System.out.println(list.set(6, "蝎子精"));
        System.out.println(list);
        /*注意add()是添加元素，总个数+1，set()是修改元素，总个数不变*/

    }
}
