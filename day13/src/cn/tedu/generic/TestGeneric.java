package cn.tedu.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName��TestGeneric
 * Date��2021/8/17 16:41
 */
/*�������ڲ��Է��͵ĺô�1*/
public class TestGeneric {
    public static void main(String[] args) {
        //����String���ͳ���Ϊ5�Ķ�̬����
        String[] a = new String[5];
        a[2] = "����";
        a[4] = "ϼϼ";
        //����ĺô����ڱ���ʱ�ڼ�����ݵ����ͣ��������Ҫ��������ڱ������Զ�����
        /*1����������ô���ģ�--��Ҫģ��������������ͼ��
        * 2������ͨ������ż���һ��ʹ��*/
        List list = new ArrayList<>();//ע�⵼��
        //�򼯺ϴ�������
        list.add("����");
        list.add(1);
        list.add(7.7);
        list.add('a');
        System.out.println(list);//��ӡ�鿴����Ԫ��
        /*3�����뷺��--��ҪĿ�ģ�Լ��������Ԫ�ص�����
        * 4�����͵ĺô������Ա����ʱ����ǰ���ڱ����ھͱ������������к���׳��쳣
        * ���򼯺������Ԫ��ʱ�����ȼ��Ԫ�ص��������ͣ��������Ҫ����������;ͱ���ʧ��*/
        List<String> list2 = new ArrayList<>();
        list2.add("����");//Լ���˼������ͺ�ֻ���Դ�String���͵Ĳ���
//        list2.add(2);

        /*5��<type>--type��ֵ�������������ͣ�����ʹ�û������ͣ�����ʹ��ʲô����ȡ����ҵ������*/
//        List<int> list3 = new ArrayList<>()
        //����������ʽЧ��һ��
//        List<Integer> list3 = new ArrayList();
        List<Integer> list3 = new ArrayList<>();
//        List<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
