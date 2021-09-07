package cn.tedu.api;

/**
 * FileName：TestNumber
 * Date：2021/8/12 16:09
 */
/*本类用于测试包装类*/
public class TestNumber {
    static Integer i0;
    public static void main(String[] args) {
        System.out.println(i0);//null

        //创建int类型对应的包装类Integer类型对象--方式1
        Integer i1 = new Integer(5);
        Integer i11 = new Integer(5);
        System.out.println(i1 == i11);//false
        System.out.println(i1.equals(i11));//true


        //创建int类型对应的包装类Integer类型对象--方式2
        /*Integer有一个高效的效果，数据在：(-128~127)
        * 在此范围内，相同的数据只会存一次，后续再存都是使用之前存过的数据*/
        Integer i2 = Integer.valueOf(127);
        Integer i3 = Integer.valueOf(127);
        System.out.println(i1 == i2);//false
        System.out.println(i2 == i3);//true

        //满足高效效果的3个条件：Integer valueOf() -128~127
        Integer i4 = Integer.valueOf(300);
        Integer i5 = Integer.valueOf(300);
        System.out.println(i4 == i5);//false

        //创建double类型对应包装类Double的对象
        Double d1 = new Double(3.14);
        Double d2 = Double.valueOf(3.14);
        Double d3 = Double.valueOf(3.14);
        System.out.println(d1 == d2);//false
        System.out.println(d2 == d3);//false
        /*只有Integer的valueOf创建方式，并且数据在-128~127才有高效效果，Double是没有高效效果的*/

        /*parserInt()作用是把String类型的数据解析为int，所以"800"被转成了int类型的数据800，即可以参与运算*/
        System.out.println(Integer.parseInt("800")+8);//808
        /*parserDouble()作用是把String类型的数据解析为double，所以"2.4"被转成了double类型的数据2.4，即可以参与运算*/
        System.out.println(Double.parseDouble("2.4")+1);//3.4

    }
}
