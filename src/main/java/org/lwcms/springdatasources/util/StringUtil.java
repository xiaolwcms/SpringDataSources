package org.lwcms.springdatasources.util;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @version 1.0
 * @ClassName StringUtil
 * @Author lwcms
 * @Date 2022/9/15 22:04
 **/
public class StringUtil {
    /**
     * @Description 判断字符串是否为空
     * @author lwcms
     * @date 2022/9/15 22:13
     * @param str
     * @return 为空返回false，不为空返回true
     */
    public static boolean isEmpty(String str){
        if(str==null || str.length()==0){
            return false;
        }else{
            return true;
        }
    }

    /**
     * @Description 判断字符串中是否包含指定字符串,str1包含str2
     * @author lwcms
     * @date 2022/9/15 22:14
     * @param str1
     * @param str2
     * @return 包含返回true，不包含返回false
     */
    public static boolean isContains(String str1,String str2){
        return str1.contains(str2);
    }

    /**
     * @Description 对字符串进行去重操作
     * @author lwcms
     * @date 2022/9/15 22:15
     * @param inputStr
     * @return 返回去重之后的字符串
     */
    public static String duplicateRemoval(String inputStr){
        //分割字符串
        String[] arrayStr=inputStr.split(",");
        //利用HashSet不存在相同元素的特性进行去重
        HashSet<String> hashSet=new HashSet<String>();
        for(int i=0;i<arrayStr.length;i++){
            hashSet.add(arrayStr[i]);
        }
        //遍历HashSet
        Iterator<String> iterator=hashSet.iterator();
        String resultStr="";//去重之后的返回结果
        while(iterator.hasNext()){
            if(!resultStr.equals("")){
                resultStr+="," +iterator.next();
            }else{
                resultStr+=iterator.next();
            }
        }
        return resultStr;
    }
    /**
     * @Description 讲输入的字符串按照指定格式输出
     * @author lwcms
     * @date 2022/9/15 22:15
     * @param   inputStr 需要处理的字符串
     * @param   splitStr 指定分割符
     * @param   resultFormat 指定格式
     * @return 返回处理之后的字符串
     */
    public static void inputFormat(String inputStr,String splitStr,String resultFormat){
        //将字符串分割成数组
        String[] strings=inputStr.split(splitStr);
        StringBuilder stringBuilder=new StringBuilder();
        for(String str:strings){
            stringBuilder.append(str).append(resultFormat);
        }
        System.out.println(stringBuilder.toString());
    }
}
