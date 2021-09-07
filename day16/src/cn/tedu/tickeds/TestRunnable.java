package cn.tedu.tickeds;

/**
 * FileName��TestRunnable
 * Date��2021/8/20 11:08
 */
/*����ͨ��ʵ��Runnable�ӿڷ�ʽ��ɶ��߳���Ʊ����*/
public class TestRunnable {
    public static void main(String[] args) {
        //Ŀ��ҵ�����
//        Runnable target = new MyRun();//��̬
        MyRun target1 = new MyRun();
        //�̶߳��󣬽�Ŀ�������Thread�ຬ�ι���
        /*�ڴ����߳�ʱͬʱ���߳�t1������"ABC"*/
        Thread t1 = new Thread(target1,"ABC");
        Thread t2 = new Thread(target1);
        Thread t3 = new Thread(target1);
        Thread t4 = new Thread(target1);
        //���̷߳�ʽ�����߳�
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

class MyRun implements Runnable {
    /*ʵ�ֽӿڵķ�ʽ��tickets�������þ�̬����Ϊ����ֻ����
    * ��һ��������ΪĿ��ҵ�������Ȼ������Ŀ�������
    * ���̶߳��������Զ���̶߳��󿴵���ҵ��һ����
    * ticketsֵֻ��һ�ݣ����Բ������þ�̬*/
    int tickets = 100;

    //ͬ�����ķ�Χ��Ӱ���������Ч��
    @Override
    public void run() {
        while (true) {
            try {
                //����1��������һ��Ʊ�����˶����
                //����2������������Ʊ��Ϊ0�����߸���
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //��ӡ��ǰ������Ʊ���߳����Ƽ�Ʊ��-1
            System.out.println(Thread.currentThread().getName() + "=" + tickets--);
            if (tickets <= 0) break;
        }
    }
}
