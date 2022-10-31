package practise;

import org.junit.Test;

import java.io.*;

public class TestFile {
 /*   @Test
    public void test1()    {
        FileTest file = new FileTest("test.txt");
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
             bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            String str = "天青色等烟雨，而我在等你；炊烟袅袅升起，隔江千万里；";
            bufferedOutputStream.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedOutputStream.close();
                bufferedOutputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }*/

    @Test
    public  void test2(){
        //使用字符流写入内容
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("test.txt"));
            String str = "天青色等烟雨，而我在等你；炊烟袅袅升起，隔江千万里；";
            bufferedWriter.write(str);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public  void test3(){
        BufferedReader bufferedReader = null;
        System.out.println("开始了");
        try {
            bufferedReader = new BufferedReader(new FileReader("test.txt"));
            String str;
            while ((str = bufferedReader.readLine())!=null){
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test4(){
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
             bufferedReader   = new BufferedReader(new FileReader("test.txt"));
             bufferedWriter  = new BufferedWriter(new FileWriter("test2.txt"));
            char [] c = new char[20];
            int len;
            String str ;
            while ((str=bufferedReader.readLine())!=null){
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
