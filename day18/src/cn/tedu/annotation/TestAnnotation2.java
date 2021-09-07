package cn.tedu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FileName：TestAnnotation2
 * Date：2021/8/24 15:49
 */
public class TestAnnotation2 {
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.LOCAL_VARIABLE, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
//自定义注解
@interface Gun {
    //给注解添加属性
    int age();
//    int age() default 0;//普通int类型属性age并赋值
//    String value();
    String value() default "lemon";//特殊属性并赋值
}

//自定义注解测试类
@Gun(value = "lemon", age = 10)
class TestGun {
    @Gun(age = 10)
    String name;

    @Gun(age = 10)
    public void shoot() {
        System.out.println("shoot()方法");
    }
}
