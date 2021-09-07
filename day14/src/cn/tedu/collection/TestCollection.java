package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * FileName��TestCollection
 * Date��2021/8/18 9:48
 */
/*�������ڲ��Ը��ӿ�Collection�г��÷���*/
public class TestCollection {
    public static void main(String[] args) {
        //����Collection��ض���
//        Collection c = new Collection();//����CollectionΪ�ӿڲ���ʵ����
        //<Integer>Ϊ���ͣ�����Լ�������е�Ԫ�����ͣ�������ͱ������������Ͳ����ǻ�������
        Collection<Integer> c = new ArrayList<>();
        c.add(100);
        c.add(200);
        c.add(300);
        c.add(400);
        c.add(500);
        System.out.println(c);//[100, 200, 300, 400, 500]

        //���Լ��ϳ��÷���
//        c.clear();//��ռ���Ԫ��
//        System.out.println(c);//[]

        System.out.println(c.hashCode());//��ȡ���϶����Ӧ��ϣ��ֵ
        System.out.println(c.toString());//��д��ʵ�֣�[100, 200, 300, 400, 500]
        System.out.println(c.equals(200));//false�������ü��϶�����200���Ƚ�
        System.out.println(c.contains(200));//true���ж�c�������Ƿ����Ԫ��200
        System.out.println(c.isEmpty());//false���жϼ����Ƿ�Ϊ��

        System.out.println(c.remove(200));//true
        System.out.println(c);//[100, 300, 400, 500
        System.out.println(c.size());//4����ȡ����Ԫ�ظ���
        Object[] array = c.toArray();//��ָ���ļ���cתΪ���飬ʹ�ö�̬˼�룬��������ΪObject
        System.out.println(array);//��ӡ��ֵַ��[Ljava.lang.Object;@1b6d3586
        System.out.println(Arrays.toString(array));

        Collection<Integer> c2 = new ArrayList<>();
        c2.add(1);
        c2.add(2);
        c2.add(3);
        System.out.println(c2);//[1, 2, 3]

        c.addAll(c2);//��c2����������Ԫ����ӵ�c������
        System.out.println(c);//[100, 300, 400, 500, 1, 2, 3]
        System.out.println(c2);//[1, 2, 3]��c2���ϱ���û�иı�

        System.out.println(c.containsAll(c2));//true���ж�c�����Ƿ����c2���ϵ�����Ԫ��
        System.out.println(c);//false���ж�c�����Ƿ����ָ��Ԫ��5

        //ɾ��c����������c2���ϵ�����Ԫ��
        System.out.println(c.removeAll(c2));
        System.out.println(c);//[100, 300, 400, 500]
        c.add(999);
        System.out.println(c);
        System.out.println(c.retainAll(c2));//true
        System.out.println(c);//[]
        System.out.println(c2);//[1, 2, 3]
        c.add(3);
        c.add(100);
        System.out.println(c);//[3, 100]
        System.out.println(c.retainAll(c2));//true
        System.out.println(c);//[3]

        //����/��������
        /*�������裺
        * 1����ȡ���ϵĵ����� c.iterator()
        * 2���жϼ������Ƿ�����һ��Ԫ�ؿɵ��� it.hasNext()
        * 3����ȡ��ǰ��������������Ԫ�� it.next()
        * */
        Iterator<Integer> it = c2.iterator();//��ȡ������
        while(it.hasNext()){//�ж��Ƿ�����һ��Ԫ�ص���������У�ѭ������
//            System.out.println(it.next());
            Integer num = it.next();//��ȡ���ֵ�������Ԫ��
            System.out.println("���ε�������Ԫ��Ϊ��"+num);

        }

    }
}
