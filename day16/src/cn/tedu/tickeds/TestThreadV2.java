package cn.tedu.tickeds;

/**
 * FileName��TestThreadV2
 * Date��2021/8/20 15:03
 */
/*�������ڸ�����߳���Ʊ������������ݰ�ȫ����*/
public class TestThreadV2 {
    public static void main(String[] args) {
        TicketT2 t1 = new TicketT2();
        TicketT2 t2 = new TicketT2();
        TicketT2 t3 = new TicketT2();
        t1.start();
        t2.start();
        t3.start();

    }
}

class TicketT2 extends Thread {
    static int tickets = 100;

//    Object o = new Object();

    @Override
    public void run() {
        while (true) {
//            synchronized (o){}
            /*ͨ��class�ؼ��ִ���һ���࣬�ͻ��ڹ����ռ�
            ������һ��Ψһ��Ӧ������.class�ֽ����ļ�
            �������.class��Ӧ�Ķ����֮Ϊ�ֽ������
            �ֽ������ǳ���Ҫ���Ƿ���Ļ�ʯ���ֽ��������
            �����˵�ǰ�����йؼ���Ϣ������ʹ���ֽ������
            ��Ϊͬ��������������ǳ�����*/
            synchronized (TicketT2.class) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "=" + tickets--);
                    if (tickets <= 0) break;
                }
            }
        }
    }
}
