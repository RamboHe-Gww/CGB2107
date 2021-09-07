package cn.tedu.set;

import java.util.HashSet;
import java.util.Set;

/**
 * FileName：TestPhone
 * Date：2021/8/19 19:29
 */
public class TestPhone {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("AAA");
        set.add("BBB");
        set.add("CCC");
        set.add(null);
        set.add("null");
        System.out.println(set);

        Phone p1 = new Phone("HW",3000.0,"Black");
        Phone p2 = new Phone("HW",4000.0,"White");
        Phone p3 = new Phone("HW",5000.0,"Blue");
        Phone p4 = new Phone("HW",5000.0,"Blue");
        Phone p5 = new Phone();
        Set<Phone> phoneSet = new HashSet<>();
        phoneSet.add(p1);
        phoneSet.add(p2);
        phoneSet.add(p3);
        phoneSet.add(p4);
        phoneSet.add(p5);
        System.out.println(phoneSet);
        System.out.println(p3==p4);
        System.out.println(p3.equals(p4));
        /*在手机类Phone重写了equals()和hashCode()后
        * p3和p4不再判断地址值，而是根据类型与所有属性值
        * 作比较；如果两个对象类型和所有属性值一致，
        * 会认为是同一个对象，这样就实现了set集合对自定义
        * 去重的效果*/

    }
}
