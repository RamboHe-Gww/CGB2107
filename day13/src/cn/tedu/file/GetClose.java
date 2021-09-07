package cn.tedu.file;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * FileName£ºGetClose
 * Date£º2021/9/3 9:18:59
 */
public class GetClose {
    public static void close(Reader in, Writer out) {
        try {
            assert out != null;
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            assert in !=null;
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
