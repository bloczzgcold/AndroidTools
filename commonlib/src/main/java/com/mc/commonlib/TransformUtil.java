package com.mc.commonlib;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangzhenguo on 2016/11/17.
 * 类型转化工具类
 */

public class TransformUtil {
    /**
     * java对象转map,目前只支持键值String类型
     * @param thisObj 待转化对象，根据get方法确定成员变量
     * @return map
     */
    public static Map<String,Object> object2map(Object thisObj) {
        Map<String,Object> map = new HashMap<>();
        try {
            Class c = Class.forName(thisObj.getClass().getName());
            Method[] m = c.getMethods();
            for (Method aM : m) {
                String method = aM.getName();
                if (method.startsWith("get") && !method.equals("getClass") && !method.contains("$")) {
                    try {
                        Object value = aM.invoke(thisObj);
                        if (value != null) {
                            String key = method.substring(3);
                            key = key.substring(0, 1).toLowerCase() + key.substring(1);
                            map.put(key, value);
                        }
                    } catch (Exception e) {
                        System.out.println("error:" + method);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 字符串转整数
     *
     * @param str 待转化字符串
     * @param defValue 默认值
     * @return int
     */
    public static int toInt(String str, int defValue) {
        try {
            return Integer.parseInt(str);
        } catch (Exception ignored) {
        }
        return defValue;
    }

    /**
     * 对象转整数
     *
     * @param obj 待转化对象
     * @return 转换异常返回 0
     */
    public static int toInt(Object obj) {
        if (obj == null)
            return 0;
        return toInt(obj.toString(), 0);
    }

    /**
     * 对象转整数
     *
     * @param obj 待转化对象
     * @return 转换异常返回 0
     */
    public static long toLong(String obj) {
        try {
            return Long.parseLong(obj);
        } catch (Exception ignored) {
        }
        return 0;
    }

    /**
     * 对象转double
     *
     * @param obj 待转化对象
     * @return 转换异常返回 0
     */
    public static double toDouble(String obj) {
        try {
            return Double.parseDouble(obj);
        } catch (Exception ignored) {
        }
        return 0;
    }

    /**
     * 字符串转布尔值
     *
     * @param str 待转化字符串
     * @return 转换异常返回 false
     */
    public static boolean toBool(String str) {
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception ignored) {
        }
        return false;
    }

    /**
     * 将网络请求抛出的异常信息转化为status值，方便定位错误信息
     * @param msg 一般可转化为int类型
     * @return -1：请求服务器类型错误，其他：接口错误
     */
    public static int toStatus(String msg){
        try {
            return Integer.valueOf(msg);
        }catch (Exception ignored){
        }
        return -1;
    }
}
