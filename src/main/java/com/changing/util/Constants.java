package com.changing.util;

/**
 * @Description :
 * @Author : wuchangqing
 * @Date : 2017/9/21
 */
public class Constants {

    public static final String ENCODING_UTF8 = "UTF-8";

    public static final String ENCODING_ISO = "ISO_8859_1";

    /**
     * 每次操作最大读取行数
     */
    //QPS为1000，每5s收集一次，每台机器最大为5000条记录
    public static final int MAX_LINES = 5000;

    public static class DataType{
        public static final byte TYPE_LOG = 0;

    }

    public static class EsInfos{

        public static final String ES_INDEX = "log";

        public static final String ES_TYPE = "test";

    }
}
