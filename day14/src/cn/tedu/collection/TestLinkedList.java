package cn.tedu.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

/**
 * FileName��TestLinkedList
 * Date��2021/8/18 15:22
 */
/*�������ڲ��Խӿ�List��ʵ����LinkedList*/
/*List�ӿڵ������б�ʵ��*/
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("�����");
        l.add("������");
        l.add("����");
        l.add("������");
        l.add("������˹");
        System.out.println(l);
        //�̳���Collection��List�ķ���

        //����LinkedList���еķ���
        l.addFirst("������");//�����Ԫ��
        l.addLast("ά˹");//���βԪ��
        System.out.println(l);
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.removeFirst());
        System.out.println(l);
        System.out.println(l.removeLast());
        System.out.println(l);

        //��������
        //�����ڶ����б����
        LinkedList<String> l2 = new LinkedList<>();
        l2.add("ˮ䰴�");
        l2.add("��������");
        l2.add("���μ�");
        l2.add("��¥��");
        System.out.println(l2);
        /*��������ѯϵ��*/
        System.out.println(l2.peek());//�鿴�б��е���Ԫ��
        System.out.println(l2.peekFirst());//�鿴�б���Ԫ��
        System.out.println(l2.element());//�鿴�б���Ԫ��
        System.out.println(l2.peekLast());//�鿴�б�βԪ��

        /*����������ϵ��*/
        System.out.println(l2.offer("���޴�½"));//true����ָ��Ԫ����ӵ��б�ĩβ
        System.out.println(l2.offerFirst("����"));//�����Ԫ��
        System.out.println(l2.offerLast("��������ô���ɵ�"));//���βԪ��
        System.out.println(l2);

        /*�������Ƴ�ϵ��*/
        System.out.println(l2.poll());//�Ƴ��б����Ԫ��
        System.out.println(l2);
    }
}
