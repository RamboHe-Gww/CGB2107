package cn.tedu.review;

import org.junit.Test;

import java.io.*;

/**
 * FileName£ºTestIO
 * Date£º2021/8/17 9:39
 */
public class TestIO {

    @Test
    public void byteIn1() {
        InputStream in = null;
        try {
//            in = new FileInputStream(new File("D:/Demo/1.txt"));
            in = new FileInputStream("D:/Demo/1.txt");
            int b;
            while ((b = in.read()) != -1) {
                System.out.println(b + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert in != null;
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void byteIn2() {
        BufferedInputStream in = null;
        try {
//            in = new BufferedInputStream(new FileInputStream(new File("D:/Demo/1.txt")));
            in = new BufferedInputStream(new FileInputStream("D:/Demo/1.txt"));
            int b;
            while ((b = in.read()) != -1) {
                System.out.print(b + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert in != null;
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void byteOut1() {
        OutputStream out = null;
        try {
//            out = new FileOutputStream(new File("D:/Demo/1.txt"));
            out = new FileOutputStream("D:/Demo/1.txt", true);
            out.write(98);
            out.write(98);
            out.write(98);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert out != null;
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void byteOut2() {
        OutputStream out = null;
        try {
//            out = new BufferedOutputStream(new FileOutputStream(new File("D:/Demo/1.txt")));
            out = new BufferedOutputStream(new FileOutputStream("D:/Demo/1.txt", true));
            out.write(101);
            out.write(101);
            out.write(101);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert out != null;
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void charIn1() {
        Reader in = null;
        try {
//            in = new FileReader(new File("D:/Demo/1.txt"));
            in = new FileReader("D:/Demo/1.txt");
            int b;
            while((b=in.read())!=-1){
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert in != null;
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void charIn2() {
        Reader in = null;
        try {
            in = new BufferedReader(new FileReader(new File("D:/Demo/1.txt")));
            in = new BufferedReader(new FileReader("D:/Demo/1.txt"));
            int b;
            while ((b = in.read()) != -1) {
                System.out.println(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert in != null;
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void charOut1() {
        Writer out = null;
        try {
            out = new FileWriter(new File("D:/Demo/1.txt"),true);
//            out = new FileWriter("D:/Demo/1.txt",true);
            out.write(101);
            out.write(101);
            out.write(101);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert out != null;
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void charOut2() {
        Writer out = null;
        try {
            out = new BufferedWriter(new FileWriter(new File("D:/Demo/1.txt"),true));
//            out = new BufferedWriter(new FileWriter("D:/Demo/1.txt",true));
            out.write(101);
            out.write(101);
            out.write(101);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert out != null;
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
