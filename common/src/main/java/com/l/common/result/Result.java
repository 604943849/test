package com.l.common.result;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局统一返回结果
 * @author L
 * @date 2021/05/01
 */
@Data
public class Result {

    private boolean success;

    private Integer code;

    private String message;

    private Map<String, Object> data = new HashMap<String, Object>();

    private Result(){}

    private Result(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    private Result(ResultErrorCode resultErrorCode){
        this.code = resultErrorCode.getCode();
        this.message = resultErrorCode.getMessage();
    }

    public static Result ok(){
        Result r = new Result();
        r.setSuccess(true);
        r.setCode(ResultCode.OK);
        r.setMessage("成功");
        return r;
    }

    public static Result error(){
        Result r = new Result();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }

    public static Result error(ResultErrorCode resultErrorCode){
        Result r = new Result(resultErrorCode);
        r.setSuccess(false);
        return r;
    }

    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    public Result data(String key, Object value){
        this.data.put(key,value);
        return this;
    }

    public Result data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
