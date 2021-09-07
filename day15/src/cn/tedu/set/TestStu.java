package cn.tedu.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * FileName��TestStu
 * Date��2021/8/19 11:39
 */
public class TestStu {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("AAA");
        set.add("BBB");
        set.add("CCC");
        set.add("CCC");
        set.add(null);
        System.out.println(set);
        /*1��set�����е�Ԫ���������
        * 2��set�����е�Ԫ�ز����ظ�
        * 3��set����������nullֵ��������һ��*/
        //���÷���
        //clear()//contains()//hashCode()//isEmpty()//remove()//size()//toArray()
        set.clear();
        System.out.println(set);
        System.out.println(set.contains("AAA"));
        System.out.println(set.hashCode());
        System.out.println(set.isEmpty());
        System.out.println(set.remove("CCC"));
        System.out.println(set.size());
        System.out.println(set.toArray());//��ӡ��ֵַ
        System.out.println(Arrays.toString(set.toArray()));//��ӡ���Ͼ���ֵ

        //���ϼ��������
        //addAll()//containsAll()//removeAll()//retainAll()
        Set<String> set1 = new HashSet<>();
        set1.add("DDD");
        set1.add("EEE");
        System.out.println(set.addAll(set1));//true
        System.out.println(set);//[null, AAA, CCC, BBB, EEE, DDD]

        System.out.println(set.containsAll(set1));//true

        System.out.println(set.removeAll(set1));//true
        System.out.println(set);//[null, AAA, CCC, BBB]

//        System.out.println(set.retainAll(set1));//true
//        System.out.println(set);//[EEE, DDD]

        //���ϵĵ���
        Iterator<String> setIt = set.iterator();
        while (setIt.hasNext()){
            System.out.print(setIt.next()+" ");//null AAA CCC BBB
        }
        System.out.println();

        /*�ܽ᣺�Զ������StudentҪȥ�أ���Ҫ��Student
        * �����ֶ������д��hashCode()��equals()
        * ������д��͸��ݶ��������+����ֵ�ж��Ƿ�Ϊͬ
        * һ���󣬶����Ǹ��ݶ���ĵ�ֵַ�жϣ���Ϊobject
        * Ĭ��ʵ���жϵ���==��ֵַ*/
        //�Զ������ȥ��
        Set<Student> stu = new HashSet<>();
        Student s1 = new Student("A��", 18, '��');
        Student s2 = new Student("B��", 19, 'Ů');
        Student s3 = new Student("C��", 20, '��');
        Student s4 = new Student("C��", 20, '��');
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        System.out.println(stu);

    }
}
