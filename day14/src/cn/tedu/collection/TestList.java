package cn.tedu.collection;

import java.util.*;

/**
 * FileName��TestList
 * Date��2021/8/18 11:15
 */
/*��������List�ӿڵķ�������*/
public class TestList {
    public static void main(String[] args) {
        //����List�ӿڵĶ�̬����ListΪ�ӿڣ�����ʵ����
        List<String> list = new ArrayList<>();

        //�򼯺������Ԫ��
        list.add("������");
        list.add("ǧ˳��");
        list.add("ͷ����");
        list.add("�����");
        list.add("��ˮ��");
        list.add("������");
        list.add(0,"С����");
        System.out.println(list);

        //���Լ̳���Collection�ķ���
//        list.clear();
//        System.out.println(list);//[]
        System.out.println(list.contains("�����"));//true���ж��Ƿ����ָ��Ԫ��
        System.out.println(list.isEmpty());//false,�жϼ����Ƿ�Ϊ��
        System.out.println(list.remove("С����"));//true���Ƴ������е�ָ��Ԫ��
        System.out.println(list.size());//6����ȡ����Ԫ�صĸ���
        System.out.println(Arrays.toString(list.toArray()));//����תΪ����
//        Object[] array = list.toArray();
//        System.out.println(Arrays.toString(array));

        //���Լ��ϼ�Ĳ���
        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        System.out.println(list2);//[1, 2, 3, 4]
        System.out.println(list.addAll(1,list2));//true����list2������Ԫ�ؼӵ�list��
        System.out.println(list);
        System.out.println(list.containsAll(list2));//true���ж�list���Ƿ����list2������Ԫ��
        System.out.println(list.removeAll(list2));//�Ƴ�list������list2����������
        System.out.println(list);

        //��list�����±�Ϊ1�ĵط����list2������Ԫ��
//        System.out.println(list.addAll(1,list2));
//        System.out.println(list);

        //����List�ӿ��ж��еķ���
        list.add("С����");//׷�������
        list.add(1,"�߾�");
        list.add(3,"С����");
        System.out.println(list);
        System.out.println(list.indexOf("С����"));//3���ж�Ԫ�ص�һ�γ��ֵ�λ��
        System.out.println(list.lastIndexOf("С����"));//8���ж�Ԫ������һ�γ��ֵ�λλ��
        System.out.println(list.remove(5));//��������ɾ��ָ��Ԫ��
        System.out.println(list);
        System.out.println(list.get(3));//��ȡָ��λ�õ�Ԫ��
        System.out.println(list.set(6, "Ы�Ӿ�"));
        System.out.println(list);
        /*ע��add()�����Ԫ�أ��ܸ���+1��set()���޸�Ԫ�أ��ܸ�������*/

    }
}
