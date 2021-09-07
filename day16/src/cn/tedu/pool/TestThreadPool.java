package cn.tedu.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * FileName��TestThreadPool
 * Date��2021/8/20 15:44
 */
public class TestThreadPool {
    public static void main(String[] args) {
        TicketR3 target = new TicketR3();
        /*Executors���������������̳߳صĹ��������
        * ���÷���Ϊ��newFixedThreadPool(int)
        * ��������ɴ���ָ����Ŀ���̳߳ض��󣬴���������
        * �̳߳ض���ExecutorService�������洢�̵߳ĳ���
        * ���ܣ��½�/����/�ر��߳�*/

        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            /*execute()���̳߳��е��߳���ִ������
            ÿ�ε��ý�һ���̼߳��뵽��������*/
            pool.execute(target);//����ҵ�����target
        }
    }
}

class TicketR3 implements Runnable {
    //3.�����Ա����������Ʊ��
    int tickets = 100;
    //����������
//    Object o = new Object();

    //2.ʵ�ֽӿ���δʵ�ֵķ�����run()�з��ŵ������ǵ�ҵ��
    @Override
    public void run() {
        //4.ͨ��ѭ���ṹ���ҵ��
        while (true) {
            /*3.ͬ������飺synchronized(������){����ְ�ȫ���������д���}
             * ͬ���������ͬһʱ�̣�ͬһ��Դֻ�ᱻһ���̶߳���*/
            /*����д�����ԣ��൱��ÿ���߳̽�����ʱ�򶼻�newһ���������̼߳�ʹ�õĲ�����ͬһ����*/
            //synchronized (new Object()){
            //�޸�ͬ��������������Ϊ��Ա����o,��Ϊ���������Ψһ
            synchronized (TicketR3.class) {//ͬ�����������������������
                //���Ʊ��>0����Ʊ
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //4.1��ӡ��ǰ������Ʊ���߳����Լ�Ʊ��-1
                    System.out.println(Thread.currentThread().getName() + "=" + tickets--);
                }
                //4.2�˳���ѭ��--ûƱ��ʱ��ͽ���
                if (tickets <= 0) break;
            }
        }
    }
}
