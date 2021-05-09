package com.l.common.result;

/**
 * 定义状态码
 */
public interface ResultCode {

    int OK = 20000;
    int ERROR = 20001;
    //方法参数类型异常
    int METHOD_PARAMETER_TYPE_ERROR = 20005;
    //sql错误
    int SQL_ERROR = 20006;



}
