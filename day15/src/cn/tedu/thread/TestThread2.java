package cn.tedu.thread;

/**
 * FileName：TestThread2
 * Date：2021/8/19 17:08
 */
/*本类用于多线程实现方案二*/
public class TestThread2 {
    public static void main(String[] args) {
        /*目标业务对象，只需创建一次，类似系统给所有玩家
         * 发布了同一个任务target*/
        Runnable target = new MyRun();//多态
        MyRun target1 = new MyRun();

        /*原因：Runnable与MyRunnable都没有start()
         * 所以需要将接口实现类创建的目标业务对象target与
         * 线程类Thread建立关系，只有建立了关系，才能使用
         * Thread类的start()以多线程的方式启动线程*/
        Thread t1 = new Thread(target);
        Thread t2 = new Thread(target1);
        Thread t3 = new Thread(target1);
        t1.start();
        t2.start();
        t3.start();

    }
}

/*多线程实现方案二：定义实现类,实现implement Runnable*/
//abstract class MyRun implements Runnable{ }
class MyRun implements Runnable {
    public MyRun() {
    }

    //自定义业务写在run()，实现接口未实现的抽象方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            /*问题：Runnable接口中，没有提供多余的方法，仅有一个抽象run()。
            Thread.currentThread()：获取当前正在执行的线程对象；
            由于Thread是java.lang包下的，所以可不导包，直接使用；而且
            Thread.currentThread()是静态方法，所以可以通过类名直接
            调用getName()，获取当前线程对象的名字。
            * */
            System.out.println(i + "=" + Thread.currentThread().getName());
        }
    }
}