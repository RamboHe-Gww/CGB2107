package cn.tedu.reflection1;

/**
 * FileName��Gun
 * Date��2021/8/23 16:09
 */
/*�����������Ա��������������*/
public class Gun {
    private String name;
    private int age;

    private void save(int m, String n) {
        System.out.println("save()+" + m + "...+n");
    }

    private void update() {
        System.out.println("update().....");
    }

    private void save1(int m, String n) {
        System.out.println("save()+" + m + "...+n");
    }

}
