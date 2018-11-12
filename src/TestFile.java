//1，创建文件对象
//import java.io.File;
//import java.io.IOException;
//import java.util.Arrays;
//
//public class TestFile
//{
//    public static void main(String[] args) throws IOException
//    {
//        File f1 = new File("G:/java/LOLFolder");
//        System.out.println("f1的绝对路径："+f1.getAbsolutePath());
//        File f2 = new File("LOL.exe");
//        File f3 = new File(f2,"lol.exe");
//        System.out.println("f3的绝对路径："+f3.getAbsolutePath());
//    }
//}

//文件常用方法
//import java.io.File;
//import java.util.Date;
//public class TestFile
//{
//    public static void main(String[] args)
//    {
//        File f = new File("G:/LOLFolder/LOL.exe");
//        System.out.println("当前文件是："+f);
//        System.out.println("判断是否存在："+f.exists());
//        System.out.println("是否是文件夹："+f.isDirectory());
//        System.out.println("是否是文件："+f.isFile());
//    }
//}

/**
 * 一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
 *
 * 遍历这个目录下所有的文件(不用遍历子目录)
 *
 * 找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
 *
 * 注: 最小的文件不能是0长度
 * */

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//
//public class TestFile
//{
//    public static void main(String[] args)
//    {
//        File w = new File("C:/Windows");
//        File [] fileArray = w.listFiles();
//        long flag = 0;
//        String name = null;
//        for(int i = 0; i<fileArray.length;i++)
//        {
//            if(flag<fileArray[i].length() && fileArray[i].isFile())
//            {
//                flag = fileArray[i].length();
//                name = fileArray[i].getName();
//            }
//
//        }
//        System.out.printf("最大的文件名称为：%s，大小为%d",name,flag);
//        long flag2 = fileArray[1].length();
//        String name2 = null;
//        for(int i =0; i<fileArray.length;i++)
//        {
//            if(flag2>fileArray[i].length()&&fileArray[i].isFile())
//            {
//                flag2 = fileArray[i].length();
//                name2 = fileArray[i].getName();
//
//            }
//        }
//        System.out.printf("最小的文件名称为：%s，大小为%d",name2,flag2);
//
//    }
//}

//文件输入流

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class TestFile
{
    public static void main(String[] args)
    {
        try
        {
            File f = new File("F:\\test\\test.txt");
            f.exists();
            FileInputStream fis = new FileInputStream(f);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}