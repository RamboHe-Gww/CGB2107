package cn.tedu.tickeds;

/**
 * FileName：TestRunnable
 * Date：2021/8/20 11:08
 */
/*本类通过实现Runnable接口方式完成多线程售票案例*/
public class TestRunnable {
    public static void main(String[] args) {
        //目标业务对象
//        Runnable target = new MyRun();//多态
        MyRun target1 = new MyRun();
        //线程对象，将目标对象传入Thread类含参构造
        /*在创建线程时同时给线程t1起名字"ABC"*/
        Thread t1 = new Thread(target1,"ABC");
        Thread t2 = new Thread(target1);
        Thread t3 = new Thread(target1);
        Thread t4 = new Thread(target1);
        //多线程方式启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

class MyRun implements Runnable {
    /*实现接口的方式：tickets不需设置静态，因为本类只创建
    * 了一个对象作为目标业务类对象，然后把这个目标对象传入
    * 多线程对象处理，所以多个线程对象看到的业务都一样，
    * tickets值只有一份，所以不需设置静态*/
    int tickets = 100;

    //同步锁的范围会影响程序运行效率
    @Override
    public void run() {
        while (true) {
            try {
                //问题1：重卖，一张票卖给了多个人
                //问题2：超卖，出现票数为0，或者负数
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //打印当前正在售票的线程名称及票数-1
            System.out.println(Thread.currentThread().getName() + "=" + tickets--);
            if (tickets <= 0) break;
        }
    }
}
