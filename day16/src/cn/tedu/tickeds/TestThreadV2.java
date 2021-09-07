package cn.tedu.tickeds;

/**
 * FileName：TestThreadV2
 * Date：2021/8/20 15:03
 */
/*本类用于改造多线程售票案例，解决数据安全问题*/
public class TestThreadV2 {
    public static void main(String[] args) {
        TicketT2 t1 = new TicketT2();
        TicketT2 t2 = new TicketT2();
        TicketT2 t3 = new TicketT2();
        t1.start();
        t2.start();
        t3.start();

    }
}

class TicketT2 extends Thread {
    static int tickets = 100;

//    Object o = new Object();

    @Override
    public void run() {
        while (true) {
//            synchronized (o){}
            /*通过class关键字创建一个类，就会在工作空间
            中生成一个唯一对应的类名.class字节码文件
            这个类名.class对应的对象称之为字节码对象
            字节码对象非常重要，是反射的基石，字节码对象中
            包含了当前类所有关键信息，所以使用字节码对象
            作为同步代码块的锁对象非常合适*/
            synchronized (TicketT2.class) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "=" + tickets--);
                    if (tickets <= 0) break;
                }
            }
        }
    }
}
