
//以字节流的形式读取文件类容
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;

//public class TestStream
//{
//    public static void main(String[] args)
//    {
//        try
//        {
//            File f = new File("F:/test/test.txt");
//            FileInputStream fis = new FileInputStream(f);
//            byte [] all = new byte[(int) f.length()];
//            fis.read(all);
//            for(byte b:all)
//            {
//                System.out.println(b);
//            }
//            fis.close();
//
//        }
//        catch(IOException e)
//        {
//            e.printStackTrace();
//        }
//    }
//}

//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class TestStream
//{
//    public static void main(String[] args)
//    {
//        try
//        {
//            File f = new File("F:/test/test.txt");
//            byte data [] = {88,89};
//            FileOutputStream fos = new FileOutputStream(f);
//            fos.write(data);
//            fos.close();
//        }
//        catch (IOException e)
//        {
//            e.printStackTrace();
//        }
//    }
//}

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class TestStream
//{
//    public static void main(String[] args)
//    {
//        try
//        {
//            File f = new File("F:/test/test/test.txt");
//            File pf = f.getParentFile();
//            if(!pf.exists())
//            {
//                pf.mkdirs();
//            }
//            FileOutputStream fos = new FileOutputStream(f);
//            byte a[] = {88,89,50,34,23};
//            fos.write(a,0,3);
//            fos.close();
//
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
//}

/**
 * @ClassName: TestStream
 * @Description: 练习-拆分文件
 * 将一个大于100K的文件，按照100K为单位
 * 拆分多个子文件，并且以编号作为文件名结束
 * @author: chenfangjie
 * @date: 2018/11/12
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream
{
    public static void main(String[] args)
    {
        try
        {
            File f = new File("F:/test/test/launcher.exe");
            long total = f.length();
            System.out.println("原文件大小："+total);
            byte[] b = new byte[100*1024];
            FileInputStream fis = new FileInputStream(f);
            File splitFile = null;
            FileOutputStream fos = null;
            int i = 0;
            int len = 0;
            int totalNum = (int) Math.ceil((double)f.length() / (double)(b.length));
            System.out.println("可拆分的分数："+totalNum);
            int rest = (int)(f.length() % (long)(b.length));
            System.out.println("最后一份文件的大小："+rest);
            int res = 0;
            while(i<totalNum-1)
            {
                if((len = fis.read(b))>0)
                {
                    splitFile = new File(String.format("F:/test/test/lol.exe-%d",i));
                    fos = new FileOutputStream(splitFile);
                    fos.write(b,0,len);
                    i++;
                    System.out.println("len:"+len);
                    System.out.println("i:"+i);
                    res +=len;
                }
            }
            splitFile = new File(String.format("F:/test/test/lol.exe-%d",i));
            fos = new FileOutputStream(splitFile);
            len = fis.read(b);
            fos.write(b,0,rest);
            res+=rest;
            System.out.println("子文件共："+res);
            fos.close();
            fis.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}