package cn.tedu.tickeds;

/**
 * FileName��TestRunnableV2
 * Date��2021/8/20 14:07
 */
/*�������ڸ�����߳���Ʊ������������ݰ�ȫ����*/
public class TestRunnableV2 {
    public static void main(String[] args) {
        TicketR2 target = new TicketR2();//ҵ�����
        Thread t1 = new Thread(target);//���̶߳���
        Thread t2 = new Thread(target);
        Thread t3 = new Thread(target);
        Thread t4 = new Thread(target);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

/*���߳��г������ݰ�ȫ�����ԭ�򣺶��̳߳���+��������+������������������
* ͬ�������൱�ڸ����׳�������Ĵ����һ���������������п��ܻ�������ݰ�ȫ����Ĵ��롣
* �����󣬾�����ͬ��(�Ŷ�)��Ч����
* ������Ҫ���ǣ�
* 1�����ķ�Χ��������̫����̫�����Ч�ʵͣ�*/
class TicketR2 implements Runnable {
    int ticket = 100;
    //����������
//    Object o = new Object();

    @Override
    public void run() {
        while (true) {
            /*ͬ������飺
            ��ʽ��synchronized(������){�а�ȫ�����Ĵ���}
            *ͬ���������ͬһʱ�̣�ͬһ��Դֻ�ᱻһ���̶߳���*/
            /*����д�����ԣ��൱��ÿ���߳̽�����ʱ�򶼻�
            * newһ���������̼߳�ʹ�õĲ�����ͬһ����*/
//            synchronized (new Object()) {
            synchronized (TicketR2.class) {//ͬ�����������������
                if (ticket>0) {//��Ʊ���������Ʊ�������������
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "=" + ticket--);
                    if (ticket <= 0) break;
                }
            }
        }
    }
}
