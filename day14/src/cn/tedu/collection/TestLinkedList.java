package cn.tedu.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

/**
 * FileName：TestLinkedList
 * Date：2021/8/18 15:22
 */
/*本类用于测试接口List的实现类LinkedList*/
/*List接口的链接列表实现*/
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("孙悟空");
        l.add("孙悟天");
        l.add("孙悟饭");
        l.add("贝吉塔");
        l.add("特兰克斯");
        System.out.println(l);
        //继承自Collection与List的方法

        //测试LinkedList特有的方法
        l.addFirst("界王神");//添加首元素
        l.addLast("维斯");//添加尾元素
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.removeFirst());
        System.out.println(l);
        System.out.println(l.removeLast());
        System.out.println(l);

        //其他测试
        //创建第二个列表对象
        LinkedList<String> l2 = new LinkedList<>();
        l2.add("水浒传");
        l2.add("三国演义");
        l2.add("西游记");
        l2.add("红楼梦");
        System.out.println(l2);
        /*别名：查询系列*/
        System.out.println(l2.peek());//查看列表中的首元素
        System.out.println(l2.peekFirst());//查看列表首元素
        System.out.println(l2.element());//查看列表首元素
        System.out.println(l2.peekLast());//查看列表尾元素

        /*别名：新增系列*/
        System.out.println(l2.offer("斗罗大陆"));//true，将指定元素添加到列表末尾
        System.out.println(l2.offerFirst("三体"));//添加首元素
        System.out.println(l2.offerLast("钢铁是怎么炼成的"));//添加尾元素
        System.out.println(l2);

        /*别名：移除系列*/
        System.out.println(l2.poll());//移除列表的首元素
        System.out.println(l2);
    }
}
