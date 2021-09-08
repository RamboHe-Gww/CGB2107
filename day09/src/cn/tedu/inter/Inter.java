package cn.tedu.inter;

/**
 * FileName：Inter
 * Date：2021/8/11 11:17
 */
/*本接口用于创建接口测试*/
/*通过interface关键字定义接口*/
public interface Inter {
    /*接口中是否可以存在普通方法？--不可以*/
//    public void eat(){};
    /*接口中可以有抽象方法，而且必须全部都为抽象方法*/
    void eat();//public abstract 系统默认自带，可省略
//    public abstract void eat();

    void play();
//    public abstract void play();
}
