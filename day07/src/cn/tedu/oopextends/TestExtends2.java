package cn.tedu.oopextends;

/**
 * FileName��TestExtends2
 * Date��2021/8/9 11:31
 */
/*�������ڼ̳��й��췽����ʹ��*/
/*1.���ഴ������ʱ��Ĭ�ϻ���ȥ���ø���Ĺ��췽����ԭ������������Ĺ��캯���ĵ�һ��Ĭ�ϴ���super()����--��ʾĬ�ϵ��ø�����޲ι���
* 2.������û���޲ι���ʱ������ͨ��super(����)���ø�����������ι���
* 3.���췽�����ܱ��̳У����췽���Ķ���Ҫ��Ϊ�뱾����ͬ�������Բ��ܱ��̳е���һ����*/
public class TestExtends2 {
    public static void main(String[] args) {
        //5.��������Ҫ˳Ӧ�̳й�ϵ
        Father2 f2 = new Father2(20);
        Son2 s2 = new Son2(200);
    }
}

//1.����
class Father2{
    //3.����������޲ι���
//    public Father2(){
//        System.out.println("Father1���޲ι���");
//    }
    public Father2(int sum){
        System.out.println("F���ι���");
    }
}

//2.����
class Son2 extends Father2{
    int sum;
    //4.����������޲ι���
//    public Son2(){
//        super();
//        System.out.println("Son2���޲ι���");
//    }

    public Son2(int sum){
        super(20);
        System.out.println(sum);
    }
}


