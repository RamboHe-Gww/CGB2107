package cn.tedu.tickeds;

/**
 * FileName：TestThread
 * Date：2021/8/20 10:10
 */
/*本类通过继承Thread类的方式来完成多线售票案例*/
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

//自定义多线程售票业务类
class TicketThread extends Thread {
    /*这种写法不可行，因为tickets成员变量没有被所有线程对
     * 象共享，会卖400张票*/
//    int tickets = 100;
    /*使用static修饰，静态资源为类资源，全局所有对象共享*/
    static int tickets = 100;
    @Override
    public void run() {
        while (true) {
            try {
                /*Thread.sleep()让程序进行休眠，参数为
                * 毫秒，此处休眠10毫秒*/
                /*线程在休眠后仍然没有出现问题，才能说明
                * 线程在各种状态切换下不会出现tickets
                * 票数数据安全的问题，这样才是更好的测试
                * */
                //问题1：重卖现象，一张票卖给多个人
                //问题2：超卖现象，超出了规定100票数
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //打印正在售票线程名以及票数-1
            System.out.println(getName() + "=" + tickets--);
            if (tickets <= 0) break;
        }
    }
}
