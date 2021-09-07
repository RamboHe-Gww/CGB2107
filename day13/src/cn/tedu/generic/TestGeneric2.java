package cn.tedu.generic;

/**
 * FileName：TestGeneric2
 * Date：2021/8/17 17:17
 */
/*本类用于测试泛型的优点2*/
public class TestGeneric2 {
    public static void main(String[] args) {
//        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        print(a);
//
//        String[] b = {"大哥","二哥","三哥","四哥","五哥","六哥","瓜哥"};
//        print(b);

        Double[] c = {6.0,6.6,6.66,6.666,6.6666};
        print(c);
    }

    /*1》泛型可以实现通用代码的编写，使用<E>，表示元素的类型Element类型
    * 2》泛型的语法要求：如果在方法上使用泛型，必须两处同时出现泛型，一个是方法传入参数的类型是泛型，一个是返回值前加泛型<E>*/
    private static <E> void print(E[] c) {
        for(E d:c){
            System.out.println(d);
        }
    }

    private static void print(Double[] c) {
        for(Double d:c){
            System.out.print(d+" ");
        }
    }

//    private static void print(String[] b) {
//        for(String s:b){
//            System.out.print(s+" ");
//        }System.out.println();
//    }
//
//    private static void print(Integer[] a) {
//        //普通for循环遍历数组元素
////        for (int i = 0; i < a.length; i++) {
//////            System.out.print(i+" ");//打印数组下标
////            System.out.print(a[i]+" ");
////        }
//
//        //高效/增强for循环遍历数组元素
//        /*高效for循环：
//        * 格式：for(2 3 : 1){循环体}  1：要遍历的数据
//        * 2：每轮遍历到的数据类型 3：变量的名字
//        * 优点：比普通for循环写法简单，效率更高
//        * 缺点：没有办法像普通for循环那样根据下标来操作值，只能从头到尾依次遍历*/
//        for (Integer i : a){
//            System.out.print(i+" ");
//        }System.out.println();
//    }

}
