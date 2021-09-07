package cn.tedu.exec;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * FileName��TestSerializable
 * Date��2021/8/17 20:24
 */
public class TestSerializable {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("����",24,"����",'��');
        Student s2 = new Student("����",24,"����",'��');
        Student s3 = new Student("����",24,"����",'��');

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //���л�
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:/Demo/1.txt"));
        out.writeObject(list);
        out.flush();
        out.close();

        //�����л�
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:/Demo/1.txt"));
        List list1 = (List)in.readObject();
        for (int i = 0; i < list1.size(); i++) {
            Student s = (Student) list1.get(i);
            System.out.println(list1.get(i));
        }
        in.close();
    }

}
