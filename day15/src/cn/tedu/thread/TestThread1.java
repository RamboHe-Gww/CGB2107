package cn.tedu.thread;

/**
 * FileName��TestThread1
 * Date��2021/8/19 16:02
 */
/*�������ڶ��̱߳��ʵ�ַ���һ*/
public class TestThread1 {
    public static void main(String[] args) {
        /*new��Ӧ�����߳��½�״̬*/
        MyThread t = new MyThread();
        MyThread t1 = new MyThread();
        /*���ֻ��ͨ�������̶߳������run()����ô����ִ��
         * ��һ���̵߳�������ִ������һ���߳����񣬲���
         * �Զ��̵߳ķ�ʽ����������û�ж��߳���ռ��Դ��Ч��
         * */
//        t.run();
//        t1.run();
        /*start()��Ӧ��״̬���̵߳ľ���״̬������ʲôʱ��
         ִ�У�ȡ����ʲôʱ�򱻲���ϵͳѡ��*/
        /* ������start()�����߳�ʱ���ײ���������Զ�����
         run()ִ���Զ���ҵ��*/
        /* ������ó����ж��߳�Ч������Ҫ��������̶߳���
         ���ҵ���start()�����̼߳��뵽���������У�����
         run()ֻ�ܵ�����ͨ�ķ������ã�û�ж��̵߳�Ч��*/
        /*�߳�ִ�е�Ч����������ԣ���t1 t2 t3��ִ�н��
         * �ǲ��ɿصģ��������ִ�У�ȡ����CPU�ĵ���ʱ��
         * Ƭ�ķ��䣬��Ϊ�޷�����*/
        t.start();
        t1.start();

        MyThread t2 = new MyThread("ABC");
        t2.start();
    }
}

//������߳���
/*1����ʽ1��ͨ���̳еķ�ʽ��extends Thread*/
class MyThread extends Thread {
    /*Ϊ���޸��̵߳����ƣ�����ʹ��ϵͳ�Զ������Ĭ��ϵͳ��
    ���ṩһ�����ι��죻
    ע�⣺���߳������Ĺ���ʵ���Ǹ�����ɵģ�����Ĺ��캯��
    ֻ�ǵ�����super(name)*/

    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override//��дrun()���Զ���ҵ��
    public void run() {
        /*2���Զ����߳����ҵ����Ҫж����д��run()��
         * 3��super.run()��ʾ���ø����ҵ��*/
//        super.run();
        //���10�ε�ǰ����ִ�е��߳�����
        for (int i = 0; i < 10; i++) {
            /*getName()��ʾ���Ի�ȡ��ǰ����ִ�е��߳����ƣ����ڱ���̳���Thread�࣬���Կ�ֱ��ʹ���������*/
            System.out.println(i + "=" + getName());
        }
    }

}
