package cn.tedu.generic;

/**
 * FileName��TestGeneric2
 * Date��2021/8/17 17:17
 */
/*�������ڲ��Է��͵��ŵ�2*/
public class TestGeneric2 {
    public static void main(String[] args) {
//        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        print(a);
//
//        String[] b = {"���","����","����","�ĸ�","���","����","�ϸ�"};
//        print(b);

        Double[] c = {6.0,6.6,6.66,6.666,6.6666};
        print(c);
    }

    /*1�����Ϳ���ʵ��ͨ�ô���ı�д��ʹ��<E>����ʾԪ�ص�����Element����
    * 2�����͵��﷨Ҫ������ڷ�����ʹ�÷��ͣ���������ͬʱ���ַ��ͣ�һ���Ƿ�����������������Ƿ��ͣ�һ���Ƿ���ֵǰ�ӷ���<E>*/
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
//        //��ͨforѭ����������Ԫ��
////        for (int i = 0; i < a.length; i++) {
//////            System.out.print(i+" ");//��ӡ�����±�
////            System.out.print(a[i]+" ");
////        }
//
//        //��Ч/��ǿforѭ����������Ԫ��
//        /*��Чforѭ����
//        * ��ʽ��for(2 3 : 1){ѭ����}  1��Ҫ����������
//        * 2��ÿ�ֱ��������������� 3������������
//        * �ŵ㣺����ͨforѭ��д���򵥣�Ч�ʸ���
//        * ȱ�㣺û�а취����ͨforѭ�����������±�������ֵ��ֻ�ܴ�ͷ��β���α���*/
//        for (Integer i : a){
//            System.out.print(i+" ");
//        }System.out.println();
//    }

}
