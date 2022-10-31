package practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestException {

    public static void  two() throws Exception{
        one();
    }

    public static  void one() throws Exception{
        FileInputStream inputStream = new FileInputStream(new File("text.txt"));
        int b;
        while ((b = inputStream.read())!=-1){
            System.out.println((char) b);
        }
    }
}
