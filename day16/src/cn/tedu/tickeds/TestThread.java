package cn.tedu.tickeds;

/**
 * FileName��TestThread
 * Date��2021/8/20 10:10
 */
/*����ͨ���̳�Thread��ķ�ʽ����ɶ�����Ʊ����*/
public class TestThread {
    public static void main(String[] args) {
        TicketThread t1 = new TicketThread();
        TicketThread t2 = new TicketThread();
        TicketThread t3 = new TicketThread();
        TicketThread t4 = new TicketThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

//�Զ�����߳���Ʊҵ����
class TicketThread extends Thread {
    /*����д�������У���Ϊtickets��Ա����û�б������̶߳�
     * ��������400��Ʊ*/
//    int tickets = 100;
    /*ʹ��static���Σ���̬��ԴΪ����Դ��ȫ�����ж�����*/
    static int tickets = 100;
    @Override
    public void run() {
        while (true) {
            try {
                /*Thread.sleep()�ó���������ߣ�����Ϊ
                * ���룬�˴�����10����*/
                /*�߳������ߺ���Ȼû�г������⣬����˵��
                * �߳��ڸ���״̬�л��²������tickets
                * Ʊ�����ݰ�ȫ�����⣬�������Ǹ��õĲ���
                * */
                //����1����������һ��Ʊ���������
                //����2���������󣬳����˹涨100Ʊ��
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //��ӡ������Ʊ�߳����Լ�Ʊ��-1
            System.out.println(getName() + "=" + tickets--);
            if (tickets <= 0) break;
        }
    }
}
