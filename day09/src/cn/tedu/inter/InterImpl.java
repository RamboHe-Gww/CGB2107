package cn.tedu.inter;

/**
 * FileName：InterImpl
 * Date：2021/8/11 11:27
 */
/*本类用作Inter的实现类，用于实现Inter接口中定义的方法*/
/*接口实现类通过implements关键字与接口建立实现关系
* 实现方案有两种：
* 方案一：抽象子类，可以不实现/实现部分接口中的抽象方法
* 方案二：普通实现类，实现接口中所有抽象类方法*/
//abstract public class InterImpl implements Inter {
public class InterImpl implements Inter{
    @Override
    public void eat() {
        System.out.println("吃火锅");
    }

    @Override
    public void play() {
        System.out.println("敲代码");
    }
}
