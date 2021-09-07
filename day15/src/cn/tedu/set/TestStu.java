package cn.tedu.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * FileName：TestStu
 * Date：2021/8/19 11:39
 */
public class TestStu {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("AAA");
        set.add("BBB");
        set.add("CCC");
        set.add("CCC");
        set.add(null);
        System.out.println(set);
        /*1》set集合中的元素是无序的
        * 2》set集合中的元素不能重复
        * 3》set集合允许存放null值，但最多存一个*/
        //常用方法
        //clear()//contains()//hashCode()//isEmpty()//remove()//size()//toArray()
        set.clear();
        System.out.println(set);
        System.out.println(set.contains("AAA"));
        System.out.println(set.hashCode());
        System.out.println(set.isEmpty());
        System.out.println(set.remove("CCC"));
        System.out.println(set.size());
        System.out.println(set.toArray());//打印地址值
        System.out.println(Arrays.toString(set.toArray()));//打印集合具体值

        //集合间操作方法
        //addAll()//containsAll()//removeAll()//retainAll()
        Set<String> set1 = new HashSet<>();
        set1.add("DDD");
        set1.add("EEE");
        System.out.println(set.addAll(set1));//true
        System.out.println(set);//[null, AAA, CCC, BBB, EEE, DDD]

        System.out.println(set.containsAll(set1));//true

        System.out.println(set.removeAll(set1));//true
        System.out.println(set);//[null, AAA, CCC, BBB]

//        System.out.println(set.retainAll(set1));//true
//        System.out.println(set);//[EEE, DDD]

        //集合的迭代
        Iterator<String> setIt = set.iterator();
        while (setIt.hasNext()){
            System.out.print(setIt.next()+" ");//null AAA CCC BBB
        }
        System.out.println();

        /*总结：自定义对象Student要去重，需要再Student
        * 类中手动添加重写的hashCode()和equals()
        * 这样重写后就根据对象的类型+属性值判断是否为同
        * 一对象，而不是根据对象的地址值判断，因为object
        * 默认实现判断的是==地址值*/
        //自定义对象去重
        Set<Student> stu = new HashSet<>();
        Student s1 = new Student("A君", 18, '男');
        Student s2 = new Student("B君", 19, '女');
        Student s3 = new Student("C君", 20, '男');
        Student s4 = new Student("C君", 20, '男');
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        System.out.println(stu);

    }
}
