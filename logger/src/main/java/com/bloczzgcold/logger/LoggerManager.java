package com.bloczzgcold.logger;

/**
 * Created by zhangzhenguo on 2018/2/9.
 * logger configure
 */

public class LoggerManager {

    private LoggerManager(){}

    public static class Ext{
        private static boolean debug = false;
        private Ext(){}
        public static void setDebug(boolean debug){
            Ext.debug = debug;
        }
    }
    public static boolean isDebug() {
        return Ext.debug;
    }
}
