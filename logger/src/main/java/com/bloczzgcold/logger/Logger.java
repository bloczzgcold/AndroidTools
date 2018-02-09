package com.bloczzgcold.logger;

import android.util.Log;

import com.bloczzgcold.logger.helpers.FormattingTuple;
import com.bloczzgcold.logger.helpers.MessageFormatter;

/**
 * configure log output
 */
public class Logger {

    public static boolean isDebugEnable() {
        return LoggerUtil.isDebug();
    }

    public static void d(String tag, String msg) {
        if (Logger.isDebugEnable()) {
            Log.d(tag, msg);
        }
    }

    public static void d(String tag, String format, Object arg) {
        if (Logger.isDebugEnable()) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            Log.d(tag, ft.getMessage(), ft.getThrowable());
        }
    }

    public static void d(String tag, String format, Object arg1, Object arg2) {
        if (Logger.isDebugEnable()) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            Log.d(tag, ft.getMessage(), ft.getThrowable());
        }
    }

    public static void d(String tag, String format, Object... arguments) {
        if (Logger.isDebugEnable()) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);
            Log.d(tag, ft.getMessage(), ft.getThrowable());
        }
    }

    public static void d(String tag, String msg, Throwable t) {
        if (Logger.isDebugEnable()) {
            Log.d(tag, msg, t);
        }
    }

    public static boolean isInfoEnable() {
        return LoggerUtil.isDebug();
    }

    public static void i(String tag, String msg) {
        if (Logger.isInfoEnable()) {
            Log.i(tag, msg);
        }
    }

    public static void i(String tag, String format, Object arg) {
        if (Logger.isInfoEnable()) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            Log.i(tag, ft.getMessage(), ft.getThrowable());
        }
    }

    public static void i(String tag, String format, Object arg1, Object arg2) {
        if (Logger.isInfoEnable()) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            Log.i(tag, ft.getMessage(), ft.getThrowable());
        }
    }

    public static void i(String tag, String format, Object... arguments) {
        if (Logger.isInfoEnable()) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);
            Log.i(tag, ft.getMessage(), ft.getThrowable());
        }
    }

    public static void i(String tag, String msg, Throwable t) {
        if (Logger.isInfoEnable()) {
            Log.i(tag, msg, t);
        }
    }

    public static boolean isWarnEnable() {
        return LoggerUtil.isDebug();
    }

    public static void w(String tag, String msg) {
        if (Logger.isWarnEnable()) {
            Log.w(tag, msg);
        }
    }

    public static void w(String tag, String format, Object arg) {
        if (Logger.isWarnEnable()) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            Log.w(tag, ft.getMessage(), ft.getThrowable());
        }
    }

    public static void w(String tag, String format, Object arg1, Object arg2) {
        if (Logger.isWarnEnable()) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            Log.w(tag, ft.getMessage(), ft.getThrowable());
        }
    }

    public static void w(String tag, String format, Object... arguments) {
        if (Logger.isWarnEnable()) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);
            Log.w(tag, ft.getMessage(), ft.getThrowable());
        }
    }

    public static void w(String tag, String msg, Throwable t) {
        if (Logger.isWarnEnable()) {
            Log.w(tag, msg, t);
        }
    }

    public static boolean isErrorEnable() {
        return LoggerUtil.isDebug();
    }

    public static void e(String tag, String msg) {
        if (Logger.isErrorEnable()) {
            Log.e(tag, msg);
        }
    }

    public static void e(String tag, String format, Object arg) {
        if (Logger.isErrorEnable()) {
            FormattingTuple ft = MessageFormatter.format(format, arg);
            Log.e(tag, ft.getMessage(), ft.getThrowable());
        }
    }

    public static void e(String tag, String format, Object arg1, Object arg2) {
        if (Logger.isErrorEnable()) {
            FormattingTuple ft = MessageFormatter.format(format, arg1, arg2);
            Log.e(tag, ft.getMessage(), ft.getThrowable());
        }
    }

    public static void e(String tag, String format, Object... arguments) {
        if (Logger.isErrorEnable()) {
            FormattingTuple ft = MessageFormatter.arrayFormat(format, arguments);
            Log.e(tag, ft.getMessage(), ft.getThrowable());
        }
    }

    public static void e(String tag, String msg, Throwable t) {
        if (Logger.isErrorEnable()) {
            Log.e(tag, msg, t);
        }
    }

}
