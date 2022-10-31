package practise;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class FileIo {
    @Test
    public void  test1(){
        File file = new File("E:\\TestIo");
        if(file.exists()){
            try {
                file.createNewFile();
                if(file.isDirectory()){
                    System.out.println("当前文件夹的名称为："+file.getName());
                    System.out.println("当前文件夹的绝对地址为："+file.getAbsoluteFile());
                    System.out.println("当前文件夹的地址为："+file.getAbsolutePath());

                }
                if(file.isFile()){
                    System.out.println("当前文件的名称为："+file.getName());
                    System.out.println("当前文件的地址为："+file.getAbsoluteFile());
                    System.out.println("当前文件的地址为："+file.getAbsolutePath());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
