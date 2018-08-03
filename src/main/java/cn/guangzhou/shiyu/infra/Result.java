package cn.guangzhou.shiyu.infra;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Administrator on 2018/8/3.
 */
@Getter
public class Result<T> {

    private int code;
    private String msg;
    private T data;

    public Result(T data) {
        this.code=0;
        this.msg="success";
        this.data=data;
    }

    private Result(int errorCode, String errorMsg) {
        this.code=errorCode;
        this.msg=errorMsg;
    }

    public static <T> Result<T> success(T data){
        return new Result<T>(data);
    }

    public static <T> Result<T> failure(int errorCode,String errorMsg){
        return new Result<T>(errorCode,errorMsg);
    }

}
