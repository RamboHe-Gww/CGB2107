package cn.tedu.map;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName£ºExecList
 * Date£º2021/8/19 11:45
 */
public class ExecList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("AAA");
        l.add("AAA");
        l.add("BBB");
        l.add("CCC");
        l.add(null);
        System.out.println(l);
    }
}
