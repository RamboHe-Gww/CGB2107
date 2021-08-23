package cn.tedu.reflect;


import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * FileName£ºGuns
 * Date£º2021/8/23 20:39
 */
public class Guns {
    public static void main(String[] args) throws Exception {
        Class<Guns> gunsClass = Guns.class;
        InputStream in = gunsClass.getClassLoader().getResourceAsStream("guns.properties");
        InputStream in1 = Guns.class.getClassLoader().getResourceAsStream("guns.properties");

        Properties p = new Properties();
        p.load(in);
//        new Properties().load(in1);

//        String classname = p.getProperty("classname");
//        System.out.println(classname);

        String user = p.getProperty("user");
        System.out.println(user);


    }

}
