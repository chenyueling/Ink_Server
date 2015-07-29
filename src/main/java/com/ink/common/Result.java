package com.ink.common;

/**
 * Created by chenyueling on 2015/7/21.
 */
public class Result {

    public static final String SUCCESS = "success";
    public static final String ERROR = "error";
    private String status;
    private String data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static final Result success(){
        Result result = new Result();
        result.setData("operate success");
        result.setStatus(Result.SUCCESS);
        return result;
    }
}
