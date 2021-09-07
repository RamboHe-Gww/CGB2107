package cn.tedu.api;

/**
 * FileName：TestNumber2
 * Date：2021/8/12 17:06
 */
/*本类用于测试自动装箱与自动拆箱*/
public class TestNumber2 {
    public static void main(String[] args) {
        //定义包装类型数据
        Integer i1 = new Integer(127);
        Integer i2 = Integer.valueOf(127);

        //现在的方式：
        /*自动装箱：编译器会自动把基本类型int 5，包装成包装类型Integer，然后交给Integer类型的引用类型变量i3保存
        * 自动装箱底层发生的代码：Integer.valueOf(5)
        * valueOf()的方向：int --> Integer*/
        Integer i3 = 5;//自动装箱
        System.out.println(i3);

        /*自动拆箱：编译器会自动把包装类型的i1拆掉“箱子”，变回基本类型的数据127，交给基本类型int的变量i4来保存
        * 自动拆箱底层发生的代码：i1.intValue();
        * intValue()的方向：Integer0 --> int */
        int i4 = i1;//自动拆箱
        System.out.println(i4);

    }
}
