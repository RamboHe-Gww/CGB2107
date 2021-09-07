package cn.tedu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FileName��TestAnnotation2
 * Date��2021/8/24 15:49
 */
public class TestAnnotation2 {
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.LOCAL_VARIABLE, ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
//�Զ���ע��
@interface Gun {
    //��ע���������
    int age();
//    int age() default 0;//��ͨint��������age����ֵ
//    String value();
    String value() default "lemon";//�������Բ���ֵ
}

//�Զ���ע�������
@Gun(value = "lemon", age = 10)
class TestGun {
    @Gun(age = 10)
    String name;

    @Gun(age = 10)
    public void shoot() {
        System.out.println("shoot()����");
    }
}
