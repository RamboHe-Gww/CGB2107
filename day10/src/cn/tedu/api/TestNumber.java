package cn.tedu.api;

/**
 * FileName��TestNumber
 * Date��2021/8/12 16:09
 */
/*�������ڲ��԰�װ��*/
public class TestNumber {
    static Integer i0;
    public static void main(String[] args) {
        System.out.println(i0);//null

        //����int���Ͷ�Ӧ�İ�װ��Integer���Ͷ���--��ʽ1
        Integer i1 = new Integer(5);
        Integer i11 = new Integer(5);
        System.out.println(i1 == i11);//false
        System.out.println(i1.equals(i11));//true


        //����int���Ͷ�Ӧ�İ�װ��Integer���Ͷ���--��ʽ2
        /*Integer��һ����Ч��Ч���������ڣ�(-128~127)
        * �ڴ˷�Χ�ڣ���ͬ������ֻ���һ�Σ������ٴ涼��ʹ��֮ǰ���������*/
        Integer i2 = Integer.valueOf(127);
        Integer i3 = Integer.valueOf(127);
        System.out.println(i1 == i2);//false
        System.out.println(i2 == i3);//true

        //�����ЧЧ����3��������Integer valueOf() -128~127
        Integer i4 = Integer.valueOf(300);
        Integer i5 = Integer.valueOf(300);
        System.out.println(i4 == i5);//false

        //����double���Ͷ�Ӧ��װ��Double�Ķ���
        Double d1 = new Double(3.14);
        Double d2 = Double.valueOf(3.14);
        Double d3 = Double.valueOf(3.14);
        System.out.println(d1 == d2);//false
        System.out.println(d2 == d3);//false
        /*ֻ��Integer��valueOf������ʽ������������-128~127���и�ЧЧ����Double��û�и�ЧЧ����*/

        /*parserInt()�����ǰ�String���͵����ݽ���Ϊint������"800"��ת����int���͵�����800�������Բ�������*/
        System.out.println(Integer.parseInt("800")+8);//808
        /*parserDouble()�����ǰ�String���͵����ݽ���Ϊdouble������"2.4"��ת����double���͵�����2.4�������Բ�������*/
        System.out.println(Double.parseDouble("2.4")+1);//3.4

    }
}
