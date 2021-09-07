package cn.tedu.collection;

import java.util.*;

/**
 * FileName：TestMap
 * Date：2021/8/18 16:30
 */
/*本类用于测试接口Map*/
public class TestMap {
    public static void main(String[] args) {
        //创建Map对象，Map为接口不能直接实例化对象，所创建的为多态对象
        /*Map(K,V)结构中的数据要符合映射规则，一定要注
        意同时指定K，V的数据类型。K,V具体指定什么引用类
        型，取决于业务需求*/
        Map<Integer, String> m = new HashMap<>();
        /*m中存入数据的是put()方法，同时存入键和值*/
        m.put(9527, "白骨精");
        m.put(9528, "黑熊精");
        m.put(9529, "蜘蛛精");
        /*1、m的key不允许重复，若重复对应的value会覆盖*/
        m.put(9530, "味精");
        m.put(9530, "鸡精");
        m.put(9531, "鸡精");
        /*2、m的value可以重复*/
//        System.out.println(m);

//        m.clear();//清空映射
//        System.out.println(m);//{}
//        System.out.println(m.hashCode());//获取哈希码值
//        System.out.println(m.equals("鸡精"));//false，m对象与对象中的一个数据不相等
//        System.out.println(m.isEmpty());//判断是否为空
//        System.out.println(m.size());//判断映射中键值对的个数
//
//        System.out.println(m.containsKey(9527));//true，判断映射是否包含指定的键
//        System.out.println(m.containsValue("鸡精"));//true，判断是否包含指定的值
//        System.out.println(m.get(9528));//根据指定key返回对应value
//        System.out.println(m.remove(9530));//根据指定的key删除对应键值对
//        System.out.println(m);
//        System.out.println(m.containsKey(9530));//false
//        System.out.println(m.get(9530));//null;
//
//        /*将m映射中所有value值取出，放入一个Collection列表中
//        * Collection<Type> 的Type类型，取决于映射m中的value类型*/
//        Collection<String> values = m.values();
//        System.out.println(values);

        //m映射的迭代
        /*方式1：
         * 遍历m中的数据，m本身没有迭代器，需要先转换成
         * set集合再迭代，Set<Key>：把m中所有的key取
         * 出来放入到当前的set集合中*/
        //m映射使用keySet()方法转换成Set集合
        Set<Integer> keyS = m.keySet();
        //创建迭代器
        Iterator<Integer> keyIt = keyS.iterator();
        while (keyIt.hasNext()) {
            Integer key = keyIt.next();
            System.out.println(key);
            String value = m.get(key);
            System.out.println(value);
            System.out.println("{" + key + "," + value + "}");
        }

        /*方式2：
         * 遍历m映射，需要先把m映射转换为Set集合
         * 这个方案是把m的每一对键值对看作是一个个
         * Entry<K,V>，如果有5个键值对那么就有5个
         * Entry<K,V>放入Set集合中
         * 注意：一对KV就是一个Entry<K,V>*/
        Set<Map.Entry<Integer, String>> entryS = m.entrySet();
        Iterator<Map.Entry<Integer, String>> entryIt = entryS.iterator();
        while (entryIt.hasNext()) {
            Map.Entry<Integer, String> entry = entryIt.next();
            System.out.println(entry);
            System.out.println("{" + entry.getKey() + "," + entry.getValue() + "}");
            Integer key1 = entry.getKey();
            String value1 = entry.getValue();
            System.out.println("{" + key1 + "," + value1 + "}");
        }

    }

}
