package cn.tedu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * FileName��TestList2
 * Date��2021/8/18 11:48
 */
/*�������ڲ���List�ӿڵ�Ԫ�ص���*/
public class TestList2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A��");
        list.add("B��");
        list.add("C��");
        list.add("D��");
        list.add("E��");
        list.add("F��");
//        System.out.println(list);

        //��������
        /*���ϵĵ�����ʽ��
        * 1��forѭ��--��Ϊlist����������ģ�Ԫ�����±꣬���Կ��Ը����±�������
        * 2����Ч/��ǿforѭ����foreachѭ��
        * 3��iterator
        * 4��listIterator
        * */
        //��ʽ1����ͨforѭ��
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //��ʽ2����Чforѭ��
        //��ʽ��for(Ԫ������ Ԫ���� : Ҫ������Ԫ��){}
        for (String s:list){
            System.out.print(s+" ");
        }
        System.out.println();
        //��ʽ3���Ӹ��ӿ�Collection�м̳й���
        //��ȡ�������ϵĵ�����
        Iterator<String> it = list.iterator();
        //ͨ����ȡ���ĵ�����ѭ������Ԫ��
        while(it.hasNext()){//�жϼ������Ƿ�������һ��Ԫ�ؿɵ���
            //��ӡ������Ԫ��
            System.out.print(it.next()+" ");
//            String s = it.next();
//            System.out.println(s);
        }
        System.out.println();
        /*��ʽ4��ListIterator����List�ӿ����еĵ�����
        * Iterator<E>--���ӿ�--hasNext()--next()
        * ListIterator<E>--�ӽӿ�--���˸���Ĺ�������
        * �����Լ������й��ܣ����練����������Ԫ�صȵ�
        * public interface ListIterator<E> extends Iterator
        * */
        //��ȡ������
        ListIterator<String> it2 = list.listIterator();
        //��������Ԫ��
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}
