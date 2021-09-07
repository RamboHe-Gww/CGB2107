package cn.tedu.design;

/**
 * FileName��Singleton2
 * Date��2021/8/24 14:06
 */
/*����������ɵ������ģʽ��������ʽ -- �����ص�*/
/*�ӳټ���˼�룺�����ڵ�һʱ�䴴���ö�����ռ���ڴ棬������Ҫ
 * �õ���ʱ����ȥ���������Ķ���*/
/*�������ģʽ������ʵ�ַ�ʽ
 * 1������ʽ�������ò��������Ķ��󣬶���������ֱ���ȴ���һ��
 * 2������ʽ����ǰ����������Ҫ�õ���ʱ����ȥ����*/
public class Singleton2 {
    public static void main(String[] args) {
        MySingle2 single1 = MySingle2.getSingle2();
        MySingle2 single2 = MySingle2.getSingle2();
        System.out.println(single1 == single2);//true

    }
}

class MySingle2 {
    //˽�л����췽����Ŀ�ģ�Ϊ�˷�ֹ���ֱ�ӵ��ô�������
    private MySingle2() {
    }

    //������ڲ���������������˽�л�����
    private static MySingle2 single2;

    //�ṩ���������������ã����ڻ�ȡ����Ψһ����
    public static MySingle2 getSingle2() {
        //�ڷ��ض���֮ǰ����Ҫ���ж�single2�Ƿ񱣴��е�ֵַ
        if (single2 == null) {//��Ϊnull����û����������
            single2 = new MySingle2();
        }
        //��single2��Ϊnull������single2�е�ֵַ����ǰ��������ֱ�ӷ��ؼ���
        return single2;
    }
}


