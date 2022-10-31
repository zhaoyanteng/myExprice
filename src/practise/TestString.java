package practise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestString {

    //模拟trim方法，去除字符串两端的空格
    @Test
    public void  test1(){
        String str = "     AAAAAAAAA     BBBBBBB        ";
        char [] chars = str.toCharArray();
        int start =0;
        int end =0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]!=' '){
                start = i;
                break;
            }
        }
        for (int n=chars.length-1;n>=0;n--){
            if(chars[n]!=' '){
                end = n;
                break;
            }
        }
        int d = chars.length-end;
        System.out.println(start+"     "+end);
        System.out.println(str.substring(start,end+1));

        String aa = "daffafda".trim();
    }

    //将字符串指定的部分进行反转
    @Test
    public void test2(){
        int start = 3;
        int end = 5;
        String str = "12345678";

        char [] chars = str.toCharArray();
        char [] result = new char[chars.length];
        String resault="";
        int m =0;
        while (m<chars.length){
            if(m<start-1||m>end-1){
                result[m]=chars[m];
            }
            m++;
        }
        for(int i=end-1 ,n=start-1;i>=start-1;i--,n++){
            result[n]=chars[i];
        }
        System.out.println(result);
    }

    //获取一个字符串在另一个字符串出现的次数
    @Test
    public void  test3(){
        String a = "ac";
        String b = "aaaaac fffffac bbbbac ddddac";
       int result = chuxianCishu(a,b);
       System.out.println(b.indexOf(result));


    }
    public static  int chuxianCishu(String str1,String str2){
        int count = 0;
        while (str2.indexOf(str1)!=-1){
            count++;
            str2 = str2.substring(str2.indexOf(str1)+str1.length());
           /* System.out.println(count);*/
        }
        System.out.println("结果是："+count);
        return count;
    }

    //获得两个字符串中最大相同子串
    public static List<String> findMaxEqual(String str1,String str2){
        String minStr = str1.length()<str2.length()?str1:str2;
        String maxStr = str1.length()>str2.length()?str1:str2;
        List<String> list = new ArrayList<>();
        String temp ="";
        for(int i=0;i<minStr.length();i++){
            for(int k=i+1;k<minStr.length();k++){
                temp=minStr.substring(i,k);
                if(maxStr.contains(temp)){
                    list.add(temp);
                }
            }
        }
        for(int m=0;m<list.size()-1;m++){
            if(list.get(m).length()>list.get(m+1).length()){
                String temp2 = list.get(m);
                list.set(m,list.get(m+1));
                list.set(m+1,temp2);
            }
        }
        return  list;
    }

    public static String  getMaxSubstring(String str1,String str2){
        String minStr = str1.length()<str2.length()?str1:str2;
        String maxStr = str1.length()>str2.length()?str1:str2;
        int length = minStr.length();
        List<String> list = new ArrayList<>();
        for(int i=0;i<length;i++){
            for (int x=0,y=length-i;y<length;x++,y++){
                String str = minStr.substring(x,y);
                if(maxStr.contains(str)){
                        return str;
                }
            }
        }
        return "";
    }
    @Test
    public void  test4(){
       String result = getMaxSubstring("abchellodef","hijhelloabcdef");
       System.out.println(result);
    }
}
