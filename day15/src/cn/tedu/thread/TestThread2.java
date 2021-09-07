package cn.tedu.thread;

/**
 * FileName��TestThread2
 * Date��2021/8/19 17:08
 */
/*�������ڶ��߳�ʵ�ַ�����*/
public class TestThread2 {
    public static void main(String[] args) {
        /*Ŀ��ҵ�����ֻ�贴��һ�Σ�����ϵͳ���������
         * ������ͬһ������target*/
        Runnable target = new MyRun();//��̬
        MyRun target1 = new MyRun();

        /*ԭ��Runnable��MyRunnable��û��start()
         * ������Ҫ���ӿ�ʵ���ഴ����Ŀ��ҵ�����target��
         * �߳���Thread������ϵ��ֻ�н����˹�ϵ������ʹ��
         * Thread���start()�Զ��̵߳ķ�ʽ�����߳�*/
        Thread t1 = new Thread(target);
        Thread t2 = new Thread(target1);
        Thread t3 = new Thread(target1);
        t1.start();
        t2.start();
        t3.start();

    }
}

/*���߳�ʵ�ַ�����������ʵ����,ʵ��implement Runnable*/
//abstract class MyRun implements Runnable{ }
class MyRun implements Runnable {
    public MyRun() {
    }

    //�Զ���ҵ��д��run()��ʵ�ֽӿ�δʵ�ֵĳ��󷽷�
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            /*���⣺Runnable�ӿ��У�û���ṩ����ķ���������һ������run()��
            Thread.currentThread()����ȡ��ǰ����ִ�е��̶߳���
            ����Thread��java.lang���µģ����Կɲ�������ֱ��ʹ�ã�����
            Thread.currentThread()�Ǿ�̬���������Կ���ͨ������ֱ��
            ����getName()����ȡ��ǰ�̶߳�������֡�
            * */
            System.out.println(i + "=" + Thread.currentThread().getName());
        }
    }
}