package cn.tedu.inter;

/**
 * FileName��InterImpl
 * Date��2021/8/11 11:27
 */
/*��������Inter��ʵ���࣬����ʵ��Inter�ӿ��ж���ķ���*/
/*�ӿ�ʵ����ͨ��implements�ؼ�����ӿڽ���ʵ�ֹ�ϵ
* ʵ�ַ��������֣�
* ����һ���������࣬���Բ�ʵ��/ʵ�ֲ��ֽӿ��еĳ��󷽷�
* ����������ͨʵ���࣬ʵ�ֽӿ������г����෽��*/
//abstract public class InterImpl implements Inter {
public class InterImpl implements Inter{
    @Override
    public void eat() {
        System.out.println("�Ի��");
    }

    @Override
    public void play() {
        System.out.println("�ô���");
    }
}
