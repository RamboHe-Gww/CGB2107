package cn.tedu.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * FileName£ºTest
 * Date£º2021/8/18 16:10
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("");
        l.add("");
        l.add("");
        l.add("");
        Iterator<String> l1 = l.iterator();
        while (l1.hasNext()){
            System.out.println(l1.next());
        }

//        ListIterator<String> l3 = l.iterator();
        Iterator<String> l3 = l.listIterator();
        ListIterator<String> l4 = l.listIterator();
    }
}
