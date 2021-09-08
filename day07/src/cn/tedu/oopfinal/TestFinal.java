package cn.tedu.oopfinal;

/**
 * FileName：TestFinal
 * Date：2021/8/9 17:10
 */
/*本类用于final的学习*/
public class TestFinal {
    public static void main(String[] args) {
        //6.2创建子类对象测试
        Son s = new Son();
//        s.name = "干饭人";//name属性为常量，不能被修改
        System.out.println(s.name);
        s.work();
    }
}

/*final表示最终，可以用来修饰
* 但是被final修饰类是最终类，无法被继承，也就是没有子类，被final修饰的类本身就是叶子节点*/
//1.父类
//final class Father{}//测试类，被final修饰
class Father{
    //4.父类的普通方法
    /*final可以用来修饰方法，被final修饰的方法是这个方法的最终实现，不可以被重写*/
//    final public void work(){}//子类重写报错：overridden method is final 覆盖的方法时最终的
    public void work(){
        System.out.println("在车间上班");
    }
}

//2.子类
class Son extends Father{
    //6.1创建成员变量
    /*final可以用来修饰变量，注意其实不是变量，而是常量
    * 常量的不可以被更改
    * 定义常量必须要给常量同时赋值，不能先定义再赋值，不符合语法*/
    final String name = "打工人";
    final int a = 0;
    //5.重写父类方法work()
    @Override//发生重写
    public void work(){
        System.out.println("在格子间里上班");
    }
}