package cn.tedu.oop;

/**
 * FileName：DesignTeacher
 * Date：2021/8/11 10:30
 */
/*本类用于面向抽象编程，设计老师类*/
/*抽象abstract是后天重构的结果*/
public class DesignTeacher {
    public static void main(String[] args) {
        //子类对象
        CGBTeacher ct = new CGBTeacher();
        ACTTeacher at = new ACTTeacher();
        SCDTeacher st = new SCDTeacher();
        ct.ready();
        ct.teach();
        at.ready();
        at.teach();
        st.ready();
        st.teach();
        //多态对象
        Teacher t = new CGBTeacher();
        t.teach();
    }
}

abstract class Teacher{
    int id;
    String name;
    abstract public void ready();
    abstract public void teach();
}

class CGBTeacher extends Teacher{
    @Override//重写
    public void ready(){
        System.out.println("正在备课CGB");
    }
    @Override
    public void teach(){
        System.out.println("正在学习CGB");
    }

}
class ACTTeacher extends Teacher{
    @Override//重写
    public void ready(){
        System.out.println("正在备课Java基础加强+框架加强+高新技术");
    }
    @Override
    public void teach(){
        System.out.println("正在学习Java基础加强+框架加强+高新技术");
    }
}

class SCDTeacher extends Teacher{
    @Override//重写
    public void ready(){
        System.out.println("正在备课大数据拓展模块");
    }
    @Override
    public void teach(){
        System.out.println("正在学习大数据拓展模块");
    }
}
