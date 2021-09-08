package cn.tedu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * FileName：ExceptionDemo
 * Date：2021/8/10 15:06
 */
/*本类用于异常的测试*/
public class ExceptionDemo {
//    public static void main(String[] args) throws Exception {//不推荐把问题抛给main()，因为main处理不掉，会导致最终没人处理
    public static void main(String[] args) {
//        method1();//测试暴露异常
//        method2();//测试异常解决方案1
        f3();
//        method3();//测试异常解决方案2
        }

    private static void f3() {//本方法用于解决method3()抛出的异常
        try{
            method3();//处理调用method3()时抛出的异常
        }catch (Exception e){
            System.out.println("输入的数据不正确！请重新输入");
        }
    }

    /*如果一个方法抛出了异常，那么谁调用这个抛出异常的方法，谁就需要处理这个异常，有两种解决方案：捕获自己解决，继续向上抛出
    * 注意：一般会在main()调用之前处理掉异常，而不是把问题直接抛给main()，导致没人解决
    * 异常处理方案二：异常抛出--自己不处理，交给别人处理
    * 异常抛出的格式：在方法定义的小括号与大括号之间写：throws异常类型
    * 如果有多个异常，可以使用逗号进行分隔*/
    private static void method3() throws InputMismatchException,ArithmeticException,Exception{
        System.out.println("请输入要计算的第一个数：");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入要计算的第二个数：");
        int b = new Scanner(System.in).nextInt();
        System.out.println(a / b);
    }

    /*异常处理方案一：异常捕获
    * try{
    *       可能会出现异常的代码
    * }catch(要匹配的异常类型 异常名){
    *       匹配到异常提供的解决方案
    * }
    * */
    private static void method2() {
        try{
            System.out.println("请输入要计算的第一个数：");
            int a = new Scanner(System.in).nextInt();
            System.out.println("请输入要计算的第二个数：");
            int b = new Scanner(System.in).nextInt();
            System.out.println(a / b);
        }/*catch (InputMismatchException  e){
            System.out.println("请输入正确的数据类型！");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("除数不能为0！");
        }*/catch (Exception e){/*通用解决方案，多态最为经典的一种实现*/
            System.out.println("输入的数据不正确！请重新输入");
            e.printStackTrace();//打印错误信息到控制台，与Python堆栈跟踪类似
        }
        /*关于多态，并不关心子类具体的异常类型
        * 而是统一将所有的异常类型看作是父类类型来处理，提供的是通用的解决方案
        * 所以异常处理可以嵌套，也可以不嵌套，只提供一种通用解决方案
        * 注意：运行时异常可以不做编码处理，只不过有时运行会报错，Java是不强制要求代码做运行时异常处理的，只不过处理后程序更加完美*/
    }

    private static void method1() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要计算的第一个数：");
        int a = new Scanner(System.in).nextInt();
//        int a = input.nextInt();
        System.out.println("请输入要计算的第二个数：");
        int b = input.nextInt();
        System.out.println(a / b);
//        input.close();
        //输入有小数：InputMismatchException--输入不匹配异常
        //除数为0：ArithmeticException--算数异常
        /*1、不要害怕BUG，真正的勇士敢于直面自己写的BUG
        * 2、学会看报错的信息提示，确定自己错误的方向
        * 3、学会看报错的行号信息，确定自己报错的位置，哪里不对点哪里
        * 注意：源码不会错，要看自己写的代码*/
    }
}


