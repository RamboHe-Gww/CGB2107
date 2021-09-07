package cn.tedu.thread;

/**
 * FileName：TestThread1
 * Date：2021/8/19 16:02
 */
/*本类用于多线程编程实现方案一*/
public class TestThread1 {
    public static void main(String[] args) {
        /*new对应的是线程新建状态*/
        MyThread t = new MyThread();
        MyThread t1 = new MyThread();
        /*如果只是通过两个线程对象调用run()，那么会先执行
         * 完一个线程的任务，再执行另外一个线程任务，不会
         * 以多线程的方式启动，所以没有多线程抢占资源的效果
         * */
//        t.run();
//        t1.run();
        /*start()对应的状态是线程的就绪状态，至于什么时候
         执行，取决于什么时候被操作系统选中*/
        /* 当调用start()启动线程时，底层虚拟机会自动调用
         run()执行自定义业务*/
        /* 如果想让程序有多线程效果，需要创建多个线程对象
         并且调用start()，将线程加入到就绪队列中；调用
         run()只能当做普通的方法调用，没有多线程的效果*/
        /*线程执行的效果具有随机性，即t1 t2 t3的执行结果
         * 是不可控的，具体如何执行，取决于CPU的调度时间
         * 片的分配，人为无法控制*/
        t.start();
        t1.start();

        MyThread t2 = new MyThread("ABC");
        t2.start();
    }
}

//定义多线程类
/*1》方式1：通过继承的方式：extends Thread*/
class MyThread extends Thread {
    /*为了修改线程的名称，不再使用系统自动分配的默认系统，
    可提供一个含参构造；
    注意：给线程起名的功能实际是父类完成的，子类的构造函数
    只是调用了super(name)*/

    public MyThread() {
        super();
    }

    public MyThread(String name) {
        super(name);
    }

    @Override//重写run()，自定义业务
    public void run() {
        /*2》自定义线程类的业务需要卸载重写的run()里
         * 3》super.run()表示调用父类的业务*/
//        super.run();
        //输出10次当前正在执行的线程名称
        for (int i = 0; i < 10; i++) {
            /*getName()表示可以获取当前正在执行的线程名称，由于本类继承了Thread类，所以可直接使用这个方法*/
            System.out.println(i + "=" + getName());
        }
    }

}
