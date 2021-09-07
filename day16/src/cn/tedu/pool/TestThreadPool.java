package cn.tedu.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * FileName：TestThreadPool
 * Date：2021/8/20 15:44
 */
public class TestThreadPool {
    public static void main(String[] args) {
        TicketR3 target = new TicketR3();
        /*Executors是用来辅助创建线程池的工具类对象
        * 常用方法为：newFixedThreadPool(int)
        * 这个方法可创建指定数目的线程池对象，创建出来的
        * 线程池对象ExecutorService：用来存储线程的池子
        * 功能：新建/启动/关闭线程*/

        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            /*execute()让线程池中的线程来执行任务，
            每次调用将一个线程加入到就绪队列*/
            pool.execute(target);//传入业务对象target
        }
    }
}

class TicketR3 implements Runnable {
    //3.定义成员变量，保存票数
    int tickets = 100;
    //创建锁对象
//    Object o = new Object();

    //2.实现接口中未实现的方法，run()中放着的是我们的业务
    @Override
    public void run() {
        //4.通过循环结构完成业务
        while (true) {
            /*3.同步代码块：synchronized(锁对象){会出现安全隐患的所有代码}
             * 同步代码块在同一时刻，同一资源只会被一个线程独享*/
            /*这种写法不对，相当于每个线程进来的时候都会new一个锁对象，线程间使用的并不是同一把锁*/
            //synchronized (new Object()){
            //修改同步代码块的锁对象为成员变量o,因为锁对象必须唯一
            synchronized (TicketR3.class) {//同步代码块解决的是重卖的问题
                //如果票数>0就卖票
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //4.1打印当前正在售票的线程名以及票数-1
                    System.out.println(Thread.currentThread().getName() + "=" + tickets--);
                }
                //4.2退出死循环--没票的时候就结束
                if (tickets <= 0) break;
            }
        }
    }
}
