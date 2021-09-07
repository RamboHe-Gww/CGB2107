package cn.tedu;

/**
 * FileName：ReviewString
 * Date：2021/8/13 9:15
 */
public class ReviewString {
    public static void main(String[] args) {
        //效率高方式，数据在堆中常量池
        String String = "abc";
        String s1 = "abc";
        String s2 = "abc";
        //数据在堆中
        char[] value = {'a','b','c'};
        String s3 = new String(value);
        char[] value1 = {'a','b','c','d'};
        String s4 = new String(value1);
        /*String类自己已重写了继承自Object类的toString()，打印的为具体内容*/
        System.out.println(s1);
        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s1 == s3);//false
        /*String类自己已重写了继承自Object类的toString()
        * 所以比较的不是地址值，不论创建方式，比较的时两个串的具体内容。只要内容相同，返回true*/
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

    }
}
