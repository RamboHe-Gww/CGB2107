package cn.tedu.review;

/**
 * FileName��ReviewBox
 * Date��2021/8/13 10:11
 */
/*�������ڰ�װ��ĸ�ϰ*/
public class ReviewBox {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);//û�и�ЧЧ����newһ�δ���һ��
        Integer i2 = Integer.valueOf(100);//��Χ��-128~127���и�ЧЧ��
        Integer i4 = Integer.valueOf(100);//��Χ��-128~127���и�ЧЧ��
//        Integer i5 = Integer.valueOf(128);//��Χ��-128~127���и�ЧЧ��
        System.out.println(i2 == i4);//true
//        System.out.println(i2 == i5);//false
        Integer i3 = 100;//�Զ�װ�䣬int-->Integer

        Double d1 = new Double(3.14);//û�и�ЧЧ��
        Double d2 = Double.valueOf(3.14);//û�и�ЧЧ��
        Double d4 = Double.valueOf(3.14);//û�и�ЧЧ��
        System.out.println(d2 == d4);//false
        Double d3 = 3.14;//�Զ�װ��double-->Double

        System.out.println(Integer.parseInt("777")+111);//888
        System.out.println(Double.parseDouble("5.6")+1.1);//6.699999999999999

        int i = i1;//�Զ�����Integer-->int
        double d = d1;//�Զ�����Double-->double


    }
}
