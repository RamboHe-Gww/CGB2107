package cn.tedu.inter2;

/**
 * FileName：DesignTeacher2
 * Date：2021/8/11 14:20
 */
/*本类用于面向接口编程之设计老师案例*/
/*接口是先天设计的结果*/
public class DesignTeacher2 {
    public static void main(String[] args) {
        CGBTeacher c = new CGBTeacher();
        ACTTeacher a = new ACTTeacher();
        c.ready();
        c.teach();
        a.ready();
        a.teach();
    }
}

//创建Teacher2接口--提取共性，形成抽象层，体现接口，接口定义的时规则
/*通过interface关键字定义接口*/
interface Teacher2 {
    /*接口中的都是抽象方法，可简写，默认拼接public abstract*/
    //接口中的抽象方法
    void ready();

    void teach();
}

//接口实现类
/*如果实现类需要使用接口的规则，就需要与接口建立实现关系，关键字implements*/
class CGBTeacher implements Teacher2 {
    @Override
    public void ready() {
        System.out.println("正在备课Java大数据");
    }

    @Override
    public void teach() {
        System.out.println("正在授课Java大数据");
    }
}

class ACTTeacher implements Teacher2 {
    @Override
    public void ready() {
        System.out.println("正在备课高手加薪");
    }

    @Override
    public void teach() {
        System.out.println("正在授课高手加薪");
    }
}



