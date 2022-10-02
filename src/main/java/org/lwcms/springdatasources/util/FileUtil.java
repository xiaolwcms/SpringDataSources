package org.lwcms.springdatasources.util;

import java.io.*;

/**
 * @version 1.0
 * @ClassName FileUtil
 * @Author lwcms
 * @Date 2022/9/15 22:04
 **/
public class FileUtil {
    private File file = null;//文件对象
    private Writer writer = null;//writer流
    private BufferedWriter bufferedWriter = null;//流

    /**
     * @Description 创建目录,传入需要创建的目录路径
     * @author lwcms
     * @date 2022/9/15 22:06
     * @param filePath
     * @return 创建目录成功返回0，创建目录失败返回1，目录已存在返回2
     */
    public static int createDir(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {//判断目录是否存在
            boolean flag = file.mkdir();//根据传入的参数，创建新的目录，前提：上级目录必须存在
            if (flag) {
                System.out.println("创建目录成功");
                return 0;
            } else {
                System.out.println("创建目录失败");
                return 1;
            }
        } else {
            System.out.println(filePath + "   目录已存在，无需创建");
            return 2;
        }
    }

    /**
     * @Description 创建文件,传入文件的路径(包含文件名和文件后缀)
     * @author lwcms
     * @date 2022/9/15 22:07
     * @param filePath
     * @return 创建文件成功返回true，文件已存在返回false
     */
    public static boolean createPersonFile(String filePath) {
        boolean result = true;//默认创建成功
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                result = file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    /**
     * @Description 将数据写入对应的文件中，字符数据流
     * @author lwcms
     * @date 2022/9/15 22:07
     * @param filePath 包含路径+文件名+文件后缀
     * @Param data 写入文件的数据
     * @return
     */
    public static void outputToFile(String filePath, String data) {
        File file = new File(filePath);
        if (file.exists()) {
            try {
                Writer writer = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.write(data);//将数据写入文件
                bufferedWriter.newLine();//换行
                bufferedWriter.flush();//清空缓冲区数据
                bufferedWriter.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
