package test;

import java.io.*;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //拷贝一个文件夹，考虑子文件夹
        String res = "F:\\IT\\Java\\temp";
        String dest = "F:\\IT\\Java\\tmp";
        copyDir(new File(res), new File(dest));

    }

    private static void copyDir(File res, File dest) throws IOException {
        for (File file : res.listFiles()) {
            if (file.isDirectory()) {
                File file1 = new File(dest, file.getName());
                file1.mkdirs();
                copyDir(file, file1);
            }else {
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(res, file.getName())));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(dest, file.getName())));
                int b ;
                while ((b = bis.read()) != -1) {
                    bos.write(b);
                }
                bos.close();
                bis.close();
            }
        }
    }
}
