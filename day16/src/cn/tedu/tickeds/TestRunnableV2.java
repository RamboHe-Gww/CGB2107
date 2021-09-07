package cn.tedu.tickeds;

/**
 * FileName：TestRunnableV2
 * Date：2021/8/20 14:07
 */
/*本类用于改造多线程售票案例，解决数据安全问题*/
public class TestRunnableV2 {
    public static void main(String[] args) {
        TicketR2 target = new TicketR2();//业务对象
        Thread t1 = new Thread(target);//多线程对象
        Thread t2 = new Thread(target);
        Thread t3 = new Thread(target);
        Thread t4 = new Thread(target);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

/*多线程中出现数据安全问题的原因：多线程程序+共享数据+多条语句操作共享数据
* 同步锁：相当于给容易出现问题的代码加一把锁，包裹了所有可能会出现数据安全问题的代码。
* 加锁后，就有了同步(排队)的效果。
* 加锁需要考虑：
* 1》锁的范围：锁不能太大，锁太大程序效率低；*/
class TicketR2 implements Runnable {
    int ticket = 100;
    //创建锁对象
//    Object o = new Object();

    @Override
    public void run() {
        while (true) {
            /*同步代码块：
            格式：synchronized(锁对象){有安全隐患的代码}
            *同步代码块在同一时刻，同一资源只会被一个线程独享*/
            /*这种写法不对，相当于每个线程进来的时候都会
            * new一个锁对象，线程间使用的并不是同一把锁*/
//            synchronized (new Object()) {
            synchronized (TicketR2.class) {//同步代码块解决重卖问题
                if (ticket>0) {//有票的情况下卖票，解决超卖问题
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
