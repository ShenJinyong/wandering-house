package com.simpleteen.wandering.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BlogUtils {
    /**
     * 以 Java8 的方式获取当前时间字符串
     *
     * @return 当前时间格式化之后的字符串
     */
    public static String now() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
