package cn.tedu.review;

/**
 * FileName：ReviewBox
 * Date：2021/8/13 10:11
 */
/*本类用于包装类的复习*/
public class ReviewBox {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);//没有高效效果，new一次创建一个
        Integer i2 = Integer.valueOf(100);//范围在-128~127才有高效效果
        Integer i4 = Integer.valueOf(100);//范围在-128~127才有高效效果
//        Integer i5 = Integer.valueOf(128);//范围在-128~127才有高效效果
        System.out.println(i2 == i4);//true
//        System.out.println(i2 == i5);//false
        Integer i3 = 100;//自动装箱，int-->Integer

        Double d1 = new Double(3.14);//没有高效效果
        Double d2 = Double.valueOf(3.14);//没有高效效果
        Double d4 = Double.valueOf(3.14);//没有高效效果
        System.out.println(d2 == d4);//false
        Double d3 = 3.14;//自动装箱double-->Double

        System.out.println(Integer.parseInt("777")+111);//888
        System.out.println(Double.parseDouble("5.6")+1.1);//6.699999999999999

        int i = i1;//自动拆箱Integer-->int
        double d = d1;//自动拆箱Double-->double


    }
}
