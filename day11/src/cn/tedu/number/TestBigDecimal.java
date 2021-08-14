package cn.tedu.number;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * FileName：TestBigDecimal
 * Date：2021/8/13 10:22
 */
/*本类用于解决浮点数不精确问题*/
public class TestBigDecimal {
    public static void main(String[] args) {
//        f1();//使用普通四则运算计算浮点数据
        f2();//使用BigDecimal来解决浮点数运算不精确问题
    }

    //BigDecimal
    private static void f2() {
        System.out.println("请输入需要计算的两个小数：");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        //工具类对象
        /*最好不要使用double作为构造函数的参数，不然还会有不精确的现象
        * 最好使用重载的构造函数：参数为String的构造函数
        * double转String，直接拼接一个空串，double与""拼接后转换成了String类型*/
        BigDecimal bd1 = new BigDecimal(a+"");
        BigDecimal bd2 = new BigDecimal(b+"");
        //定义一个变量保存结果
        BigDecimal bd3;
        //加法
        bd3 = bd1.add(bd2);
        System.out.println("加法结果："+bd3);
        //减法
        bd3 = bd1.subtract(bd2);
        System.out.println("减法结果："+bd3);
        //乘法
        bd3 = bd1.multiply(bd2);
        System.out.println("乘法结果："+bd3);
        //除法
        //方案一：除不尽会报错
//        bd3 = bd1.divide(bd2);
        //方案二：提前指定如果除不尽时保留位数
        /*divide(m,n,o)--m代表的是要除以哪个对象
         * n代表的时除不尽时保留几位数
         * o代表的时舍入方式（如：四舍五入）*/
        bd3 = bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP);
        System.out.println("除法结果："+bd3);


    }

    //普通四则运算
    private static void f1() {
        System.out.println("请输入需要计算的两个小数：");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
