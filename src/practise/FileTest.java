package practise;

import jdk.management.resource.internal.inst.RandomAccessFileRMHooks;
import org.junit.Test;

import java.io.*;
import java.util.List;
import java.util.logging.Logger;

public class FileTest {

    @Test
    public void  test1(){
    //创建文件夹对象
        File dir1 = new File("E:/testFile");
        if(dir1.exists()){
            dir1.delete();
            System.out.println("存在先删除");
        }
        if(!dir1.exists()){
            dir1.mkdir();
            System.out.println("创建文件夹对象");
            System.out.println("E:/testFile文件是否存在，"+dir1.exists());
            boolean exists = dir1.exists();
            if(exists){
                File dir2 = new File("E:/testFile/file");
                dir2.mkdir();
                System.out.println("E:/testFile/file是否存在："+dir2.exists());
            }
        }

        String name = dir1.getName();
        String path = dir1.getPath();
        File absoluteFile = dir1.getAbsoluteFile();
        String absolutePath = dir1.getAbsolutePath();
        String parent = dir1.getParent();
        System.out.println("name:"+name);
        System.out.println("path:"+path);
        System.out.println("absoluteFile"+absoluteFile);
        System.out.println("absolutePath"+absolutePath);
        System.out.println("parent"+parent);
        boolean isfile = dir1.isFile();
        System.out.println("是文件吗？"+isfile);
        boolean isDirectory = dir1.isDirectory();
        System.out.println("是目录吗？"+isDirectory);



    }
    @Test
    public  void test2()  {
        File file = new File("E:/2021/09/07");
        if(file.exists()){
            file.delete();
        }
        if(!file.exists()){
            file.mkdirs();
        }
        boolean flag = file.exists();
        System.out.println("E:/2021/09/07存在吗？"+flag);

    }
    @Test
    public void test3(){
        File file = new File("E:/2021");
        String[] listString = file.list();
        for (int n =0;n<listString.length;n++){
            System.out.print(listString[n]);
        }
        System.out.println("/n");
        File[] files = file.listFiles();
        for (int i=0;i<files.length;i++){
            System.out.print(
                    files[i].getName()
            );
        }

    }
    @Test
    public void test4()  {
        //测试读取字符流
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("E:/2021/06/青花瓷.txt");
            char [] chars = new char[1024];
            int len = 0;
            while ((len=fileReader.read(chars))!=-1){
                System.out.println(new String(chars,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
    @Test
    public  void test5(){
        //测试写入字符流
        FileWriter fileWriter=null;
        try {
            fileWriter = new FileWriter("E:/2021/06/青花瓷.txt");
            fileWriter.write("哈哈哈");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    @Test
    public void test6(){
        //测试输入输出字符流
       BufferedReader bufferedReader =null;
       BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("E:\\2021\\07\\青花瓷.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("E:\\2021\\06\\青花瓷.txt"));
            String context = null;
            while ((context=bufferedReader.readLine())!=null){
                //一次读取文本文件的一行数据
                bufferedWriter.write(context);
                //写入行分隔符
                bufferedWriter.newLine();
                //刷新输出流的缓冲
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //依次关闭输出输入流
            if(bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                    System.out.println("关闭输出流！");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bufferedReader!=null){
                try {
                    bufferedReader.close();
                    System.out.println("关闭输入流！");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test7(){
        //测试字节缓冲流
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\fj1.jpg"));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Pictures\\Saved Pictures\\fj3.jpg"));
           int next =0;
            while ((next=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(next);
                bufferedOutputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bufferedInputStream!=null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bufferedOutputStream!=null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
    /**
     * @author zyt
     * 测试视频：字节流
     */
    @Test
    public void test8(){
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator\\Documents\\WeChat Files\\wxid_gtwq97vbci2822\\FileStorage\\Video\\2021-09\\1.mp4"));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Documents\\WeChat Files\\wxid_gtwq97vbci2822\\FileStorage\\Video\\2021-09\\2.mp4"));
            int next =0;
            while ((next=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(next);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bufferedOutputStream!=null){
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bufferedInputStream!=null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    /**
     * 测试数据流
     * @author zyt
     */
    @Test
    public void test9(){
        DataOutputStream dataOutputStream = null;
        try {
            File file = new File("d:\\IOTest\\destData.txt");
            if(!file.exists()){
                file.createNewFile();
                System.out.println("创建成功！");
            }
            dataOutputStream = new DataOutputStream(new FileOutputStream("d:\\IOTest\\destData.dat"));
            dataOutputStream.writeUTF("ab中国");
            dataOutputStream.writeBoolean(false);
            dataOutputStream.writeLong(123456789L);
            System.out.println("文件写入成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(dataOutputStream!=null){
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 测试序列化与反序列化
     */
    @Test
    public  void  test10(){
        try {
           Person person = new Person("张三",21,"001");
            FileOutputStream fileOutputStream = new FileOutputStream("序列化.txt");
            ObjectOutputStream objectOutputStream =  new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();
            objectOutputStream.close();
            System.out.println("测试序列化结束！");
            System.out.println("测试反序列化开始！");
            FileInputStream fileInputStream = new FileInputStream("序列化.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Person person1= (Person) objectInputStream.readObject();
            System.out.println("反序列化结束："+person1.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 测试随机访问读取文件
     */
    @Test
    public void test11(){
        RandomAccessFile rdf = null;
        try {
             rdf = new RandomAccessFile("test.txt","rw");
            rdf.seek(5);

            //先读出来
            String temp = rdf.readLine();

            rdf.seek(5);
            rdf.write("测试".getBytes());
            System.out.println("xyz".getBytes());
            rdf.write(temp.getBytes());
            System.out.println(temp.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                rdf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
