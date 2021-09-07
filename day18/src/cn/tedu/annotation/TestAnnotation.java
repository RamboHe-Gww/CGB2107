package cn.tedu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FileName��TestAnnotation
 * Date��2021/8/24 15:28
 */
/*���������Զ���ע������*/
public class TestAnnotation {
}

/*2��ͨ��@Targetע���ʾ���Զ���ע�����ʹ�õ�λ��*/
/*ע�⣺ʹ��"ElementType.��̬����ֵ"�ķ�ʽָ������Զ���
ע�����ʹ�õ�λ�ã����λ�ÿ�д�����
��ʽ��@Target({ElementType.xxx, ElementType.xxx,})*/
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})

/*3��ͨ��@Retentionע���ʾ���Զ���ע�����������
* ע�⣺ʹ��"RetentionPolicy.��̬������"�ķ�ʽ��ָ�����
* �Զ���ע��ɻ��ã���ָ������Զ���ע������ĸ��ļ��У�
* Դ�ļ�/�ֽ����ļ�/����ʱ��Ч����ֻ����ѡһ������ͬʱѡ���
* */
//���д����ʾ�Զ���ע����Դ����Դ�ļ���
@Retention(RetentionPolicy.SOURCE)

/*ע�⣺�Զ���ע����﷨��java�Ĳ�ͬ����������java�ĸ�ʽ
* 1�������Զ���ע�⣬ע����Rice����ͨ������Ԫע���ʾ���
* �Զ���ע�������λ�ú���������
* ע�ⶨ��ĸ�ʽ��" @interface ע���� "�ķ�ʽ����*/
@interface Rice{
    /*4��ע�⣺int age();�����Ƕ��巽�������Ǹ��Զ���ע��
     * ���һ��age����
     * ���Ϊ��ʹ��ע��ʱ���㣬��ָ�����ע�����Ե�Ĭ��ֵ
     * ��ʽ��int age() default 0*/
//    int age();
    int age() default 0;//����һ���Զ���ע����ͨint��������age��������Ĭ��ֵ0

    /*5��ע���л����������������value
    * �������ԵĶ��巽ʽ����������ͬ����Ҫ��ʹ�÷�ʽ��ͬ
    * ʹ��ע��ʱ���������Ը�ʽ��"Rice("Apple")"*/
//    String value();//����һ���Զ���ע����������
    String value() default "lemon";//����һ���Զ���ע���������Բ�����Ĭ��ֵlemon
}

@Rice
class TestRice{
    @Rice
    String name;
    /*����2�������Զ���ע��Riceע�����age���Ժ�ֱ��ʹ��
    * @Riceע��ᱨ��
    * ���ۣ���ע��û�ж�������ʱ������ֱ��ʹ�ã����������
    * ��������Ը�ֵ����ʹ��ע��
    * ��ֵ��ʽ��"@Rice(age = 10)"*/
    @Rice
    public void eat(){
        System.out.println("eat()");
    }
    /*����3����age���Ը���Ĭ��ֵ�󣬿�ʹ��ע��ʱ�������
    * ���Ը�ֵ�����ʱ��ʹ�õľ���ageĬ��ֵ����ֱ��ʹ��ע��
    * */
}