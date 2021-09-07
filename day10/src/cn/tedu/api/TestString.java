package cn.tedu.api;

/**
 * FileName：TestString
 * Date：2021/8/12 10:12
 */
/*本类用于练习String的使用*/
public class TestString {
    public static void main(String[] args) {
        /*字符串类型底层维护的是char[]，存在堆里*/
        //new对象方式创建对象
        char[] value = {'a','b','c'};
        String s1 = new String(value);
        String s11 = new String(value);
        //常量池方式创建对象
        String s2 = "abc";
        String s22 = "abc";
        String s3 = "ccc_ccc_ccc";

        System.out.println(s1 == s2);//false，s1在堆里，s2在堆里常量池
        System.out.println(s1 == s11);//false，两个不同的对象，地址值不同
        System.out.println(s2 == s22);//true，都在常量池，并且指向同一个，所以地址值相同
        System.out.println(s2 == s3);//false，都在常量池，但数据不同，指向地址不同

        /*Object类中equals()的默认实现是通过==来比较的，
        * 但是String重写了类Object的equals()，
        * 重写后，不再按照==比较，而是比较两个字符串的具体内容
        * 也就是说，不论创建方式，只要是字符串的内容相同，equals()就返回true*/
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s11));//true
        System.out.println(s2.equals(s3));//false

    }
}

