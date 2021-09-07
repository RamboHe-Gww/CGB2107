package cn.tedu.api;

import java.util.Scanner;

/**
 * FileName：TestRegex
 * Date：2021/8/12 15:22
 */
/*本类用于测试正则表达式*/
//需求：提示并接收用户输入的身份证号，并判断结果输出
public class TestRegex {
    public static void main(String[] args) {
        System.out.println("输入身份证号：");
        String input = new Scanner(System.in).nextLine();
//        String regex = "[0-9]{17}[0-9X]";
        /*单个反斜杠\在java中有特殊含义。认为这是一个转义字符，可以多加一个\转义，例如\\表示一个\*/
        String regex1 = "\\d{17}[0-9X]";
        /*input是接收到的数据，regex是自定义的正则表达式即匹配规则，matches()用于判断input数是否符合regex定义的规则*/
        if (input.matches(regex1)) {//matches()返回的boolean值
            System.out.println("输入45正确");
        }else{
            System.out.println("输入有误");
        }

    }
}
