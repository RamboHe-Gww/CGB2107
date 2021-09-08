package cn.tedu.compare;

/**
 * FileName£ºC
 * Date£º2021/8/10 20:34
 */
public interface C {

    public void run();
    public abstract void eat();
}


class D implements C{
    @Override
    public void run(){
        System.out.println("a");
    }
    @Override
    public void eat(){
        System.out.println("a");
    }

}
