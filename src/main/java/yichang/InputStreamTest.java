package yichang;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        try {                                                  //直接写test也可以  是绝对路径
            InputStream inputStream=new FileInputStream("d:test.txt");//相对路径
            //System.out.println(inputStream.read());  //输出第一个字符
            int i;
            while ((i=inputStream.read())!=-1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
