package cn.tedu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FileName：TestAnnotation
 * Date：2021/8/24 15:28
 */
/*本类用于自定义注解入门*/
public class TestAnnotation {
}

/*2、通过@Target注解表示此自定义注解可以使用的位置*/
/*注意：使用"ElementType.静态常量值"的方式指定这个自定义
注解可以使用的位置，这个位置可写多个，
格式：@Target({ElementType.xxx, ElementType.xxx,})*/
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})

/*3、通过@Retention注解表示此自定义注解的生命周期
* 注意：使用"RetentionPolicy.静态常量名"的方式来指定这个
* 自定义注解可活多久，即指定这个自定义注解存在哪个文件中：
* 源文件/字节码文件/运行时有效，且只能三选一，不能同时选多个
* */
//本行代码表示自定义注解可以存放在源文件中
@Retention(RetentionPolicy.SOURCE)

/*注意：自定义注解的语法与java的不同，不能套用java的格式
* 1、定义自定义注解，注解名Rice，并通过两个元注解表示这个
* 自定义注解的作用位置和声明周期
* 注解定义的格式：" @interface 注解名 "的方式定义*/
@interface Rice{
    /*4、注意：int age();并不是定义方法，而是给自定义注解
     * 添加一个age属性
     * 如果为了使用注解时方便，可指定这个注解属性的默认值
     * 格式：int age() default 0*/
//    int age();
    int age() default 0;//定义一个自定义注解普通int类型属性age，并赋予默认值0

    /*5、注解中还可以添加特殊属性value
    * 特殊属性的定义方式与别的属性相同，主要是使用方式不同
    * 使用注解时，特殊属性格式："Rice("Apple")"*/
//    String value();//定义一个自定义注解特殊属性
    String value() default "lemon";//定义一个自定义注解特殊属性并赋予默认值lemon
}

@Rice
class TestRice{
    @Rice
    String name;
    /*测试2：当给自定义注解Rice注解添加age属性后，直接使用
    * @Rice注解会报错
    * 结论：当注解没有定义属性时，可以直接使用，如果有属性
    * 必须给属性赋值后再使用注解
    * 赋值格式："@Rice(age = 10)"*/
    @Rice
    public void eat(){
        System.out.println("eat()");
    }
    /*测试3：给age属性赋予默认值后，可使用注解时不给这个
    * 属性赋值，这个时候使用的就是age默认值，可直接使用注解
    * */
}