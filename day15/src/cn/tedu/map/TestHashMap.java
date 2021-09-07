package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * FileName：TestHashMap
 * Date：2021/8/19 10:42
 */
/*本类用于完成Map集合的相关练习*/
public class TestHashMap {
    public static void main(String[] args) {
        System.out.println("输入要统计的字符串：");
        String input = new Scanner(System.in).nextLine();
        /*统计的是每个字符出现的次数，所以字符是char类型
         * 次数是int类型。注意：字符不能重复，所以作为KEY，泛型使用时需要转成引用类型*/
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
//            System.out.println("获取到的第" + i + "个字符为：" + key);
//            map.merge(key, 1, Integer::sum);
            Integer value = map.get(key);
            if (value == null) {
                //存的数据是当前字符，次数为1
                map.put(key, 1);
            } else {
                map.put(key, value + 1);
            }
        }
        System.out.println("各个字符出现的次数为：");
        System.out.println(map);
    }
}
