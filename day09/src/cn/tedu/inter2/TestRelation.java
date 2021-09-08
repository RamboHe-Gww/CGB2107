package cn.tedu.inter2;

/**
 * FileName：TestRelation
 * Date：2021/8/11 15:08
 */
/*本类用于测试接口与类之间的复杂关系*/
public class TestRelation {
}

//接口1
interface Inter1 {
    void save();

    void find();
}

//接口2
interface Inter22 {
    void update();

    void delete();
}

//接口3
/*接口是否可以继承接口？--可以。不仅可以继承，还可以多继承，接口使用逗号隔开*/
//interface Inter3 extends Inter1, Inter22 {
//
//}

//接口3实现类
//class Inter3Impl implements Inter3 {
/*之前学习到的：一个类只能有一个父类，这个是java中的“单继承”；现在，一个类除了可以继承一个父类以外，还可以同时实现多个接口，叫“多实现”*/
class Inter3Impl implements Inter1, Inter22 {

    @Override
    public void save() {
        System.out.println("正在保存中...");
    }

    @Override
    public void find() {
        System.out.println("查询");
    }

    @Override
    public void update() {
        System.out.println("更新");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }
}



