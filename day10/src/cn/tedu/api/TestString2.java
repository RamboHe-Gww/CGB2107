package cn.tedu.api;

import java.util.Arrays;

/**
 * FileName：TestString2
 * Date：2021/8/12 11:05
 */
/*本类用于练习String类常用方法*/
public class TestString2 {
    public static void main(String[] args) {
        //创建字符串方式
        String s = "abc";

        //传参方式
        char[] value = {'a','b','c'};
        String ss = new String(value);

        System.out.println(s == ss);//false，==比较的是引用类型的地址
        System.out.println(s.equals(ss));//true,重写后比较的是字符串的值

        //测试
        System.out.println(s.charAt(1));//b，获取指定下标处字符
        System.out.println(s.concat("ram"));//abcram，用于拼接字符
        System.out.println(s);//拼接字符串不会改变原串;

        String s2 = s.concat("rambo");
        System.out.println(s2);

        System.out.println(s.startsWith("a"));//true，判断字符串是否以指定元素开头
        System.out.println(s.endsWith("o"));//false，判断字符串是否以指定元素结尾
        System.out.println(s.indexOf("b"));//判断元素的索引

        ss = "abcddd";
        System.out.println(ss.indexOf("d"));
        System.out.println(ss.lastIndexOf("d"));//判断元素最后一次出现的索引
        System.out.println(ss.length());//获取字符串长度

        String s3 = "a b c d e";
        System.out.println(s3.split(" "));//打印地址值
        System.out.println(Arrays.toString(s3.split(" ")));//split()返回的是String[]，使用Arrays.toString()转化成具体值
        String[] s33 = s3.split(" ");
//        System.out.println(Arrays.toString(s33));//[a, b, c, d, e]
        for (int i=0;i<s33.length;i++){
            System.out.print(s33[i]);//abcde
        }System.out.println();

        System.out.println(ss.toUpperCase());//ABCDDD
        System.out.println(ss.toLowerCase());//abcdd

        String s4 = "abcdefgh";
        System.out.println(s4.substring(3));//[3，结束]，从指定下标处截取子段
        System.out.println(s4.substring(1,5));//[1，5)，含头不含尾，截取指定范围的子段

        String s5 = "      abcde       ";
        System.out.println(s5.trim());//去掉字符串两端多余空格

        System.out.println(String.valueOf(10));//10，转int为String类型
        System.out.println("20"+10);//2010，String20与int10不能计算，是拼接
        System.out.println(String.valueOf(80)+10);//8010

    }
}
