package cn.tedu.innerclass;

/**
 * FileName��TestInner2
 * Date��2021/8/13 15:15
 */
/*�������ڲ��Գ�Ա�ڲ��౻private����*/
public class TestInner2 {
    public static void main(String[] args) {
        //ʹ���ڲ����shoot()
//        Outer2.Inner2 oi = new Outer2().new Inner2();
//        oi.shoot();
        /*���Inner2��Ա�ڲ��౻private���Σ��޷�ֱ�Ӵ�������*/
        new Outer2().getInner2Shoot();
    }
}

class Outer2{
    /*�����ṩ�����ķ������ڷ����ڲ�����˽���ڲ���Inner2���󣬵������ķ���*/
    public void getInner2Shoot(){
        //����˽���ڲ������
        Inner2 in = new Inner2();
        in.shoot();
    }
    private class Inner2{
        public void shoot(){
            System.out.println("˽�г�Ա�ڲ������ͨ����shoot()");
        }
    }

}
