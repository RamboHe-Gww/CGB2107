package cn.tedu.api;

/**
 * FileName��TestNumber2
 * Date��2021/8/12 17:06
 */
/*�������ڲ����Զ�װ�����Զ�����*/
public class TestNumber2 {
    public static void main(String[] args) {
        //�����װ��������
        Integer i1 = new Integer(127);
        Integer i2 = Integer.valueOf(127);

        //���ڵķ�ʽ��
        /*�Զ�װ�䣺���������Զ��ѻ�������int 5����װ�ɰ�װ����Integer��Ȼ�󽻸�Integer���͵��������ͱ���i3����
        * �Զ�װ��ײ㷢���Ĵ��룺Integer.valueOf(5)
        * valueOf()�ķ���int --> Integer*/
        Integer i3 = 5;//�Զ�װ��
        System.out.println(i3);

        /*�Զ����䣺���������Զ��Ѱ�װ���͵�i1��������ӡ�����ػ������͵�����127��������������int�ı���i4������
        * �Զ�����ײ㷢���Ĵ��룺i1.intValue();
        * intValue()�ķ���Integer0 --> int */
        int i4 = i1;//�Զ�����
        System.out.println(i4);

    }
}
