package com.zhian.mall.base;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

public class ResultVo implements Serializable {
    private int code = 0;

    private Object data = "";

    private String msg = "";

    private ResultVo(){}

    public static ResultVo build(){
        return new ResultVo();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public ResultVo setData(Object data) {
        this.data = data == null ? "" : data;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultVo setMsg(String msg) {
        if(msg != null && !msg.trim().equals("")){
            this.code = 1;
            this.msg = msg;
        }
        return this;
    }

    public ResultVo setMsg(int rtnCode, String msg) {
        this.code = rtnCode;
        this.msg = msg;
        return this;
    }

    public String toJSON(){
        return JSON.toJSONString(this);
    }

    @Override
    public String toString() {
        return "ResponseVO [code=" + code + ", data=" + data + ", msg=" + msg
                + "]";
    }

}
