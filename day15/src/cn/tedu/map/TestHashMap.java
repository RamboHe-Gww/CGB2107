package cn.tedu.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * FileName��TestHashMap
 * Date��2021/8/19 10:42
 */
/*�����������Map���ϵ������ϰ*/
public class TestHashMap {
    public static void main(String[] args) {
        System.out.println("����Ҫͳ�Ƶ��ַ�����");
        String input = new Scanner(System.in).nextLine();
        /*ͳ�Ƶ���ÿ���ַ����ֵĴ����������ַ���char����
         * ������int���͡�ע�⣺�ַ������ظ���������ΪKEY������ʹ��ʱ��Ҫת����������*/
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
//            System.out.println("��ȡ���ĵ�" + i + "���ַ�Ϊ��" + key);
//            map.merge(key, 1, Integer::sum);
            Integer value = map.get(key);
            if (value == null) {
                //��������ǵ�ǰ�ַ�������Ϊ1
                map.put(key, 1);
            } else {
                map.put(key, value + 1);
            }
        }
        System.out.println("�����ַ����ֵĴ���Ϊ��");
        System.out.println(map);
    }
}
