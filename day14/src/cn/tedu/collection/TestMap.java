package cn.tedu.collection;

import java.util.*;

/**
 * FileName��TestMap
 * Date��2021/8/18 16:30
 */
/*�������ڲ��Խӿ�Map*/
public class TestMap {
    public static void main(String[] args) {
        //����Map����MapΪ�ӿڲ���ֱ��ʵ����������������Ϊ��̬����
        /*Map(K,V)�ṹ�е�����Ҫ����ӳ�����һ��Ҫע
        ��ͬʱָ��K��V���������͡�K,V����ָ��ʲô������
        �ͣ�ȡ����ҵ������*/
        Map<Integer, String> m = new HashMap<>();
        /*m�д������ݵ���put()������ͬʱ�������ֵ*/
        m.put(9527, "�׹Ǿ�");
        m.put(9528, "���ܾ�");
        m.put(9529, "֩�뾫");
        /*1��m��key�������ظ������ظ���Ӧ��value�Ḳ��*/
        m.put(9530, "ζ��");
        m.put(9530, "����");
        m.put(9531, "����");
        /*2��m��value�����ظ�*/
//        System.out.println(m);

//        m.clear();//���ӳ��
//        System.out.println(m);//{}
//        System.out.println(m.hashCode());//��ȡ��ϣ��ֵ
//        System.out.println(m.equals("����"));//false��m����������е�һ�����ݲ����
//        System.out.println(m.isEmpty());//�ж��Ƿ�Ϊ��
//        System.out.println(m.size());//�ж�ӳ���м�ֵ�Եĸ���
//
//        System.out.println(m.containsKey(9527));//true���ж�ӳ���Ƿ����ָ���ļ�
//        System.out.println(m.containsValue("����"));//true���ж��Ƿ����ָ����ֵ
//        System.out.println(m.get(9528));//����ָ��key���ض�Ӧvalue
//        System.out.println(m.remove(9530));//����ָ����keyɾ����Ӧ��ֵ��
//        System.out.println(m);
//        System.out.println(m.containsKey(9530));//false
//        System.out.println(m.get(9530));//null;
//
//        /*��mӳ��������valueֵȡ��������һ��Collection�б���
//        * Collection<Type> ��Type���ͣ�ȡ����ӳ��m�е�value����*/
//        Collection<String> values = m.values();
//        System.out.println(values);

        //mӳ��ĵ���
        /*��ʽ1��
         * ����m�е����ݣ�m����û�е���������Ҫ��ת����
         * set�����ٵ�����Set<Key>����m�����е�keyȡ
         * �������뵽��ǰ��set������*/
        //mӳ��ʹ��keySet()����ת����Set����
        Set<Integer> keyS = m.keySet();
        //����������
        Iterator<Integer> keyIt = keyS.iterator();
        while (keyIt.hasNext()) {
            Integer key = keyIt.next();
            System.out.println(key);
            String value = m.get(key);
            System.out.println(value);
            System.out.println("{" + key + "," + value + "}");
        }

        /*��ʽ2��
         * ����mӳ�䣬��Ҫ�Ȱ�mӳ��ת��ΪSet����
         * ��������ǰ�m��ÿһ�Լ�ֵ�Կ�����һ����
         * Entry<K,V>�������5����ֵ����ô����5��
         * Entry<K,V>����Set������
         * ע�⣺һ��KV����һ��Entry<K,V>*/
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
