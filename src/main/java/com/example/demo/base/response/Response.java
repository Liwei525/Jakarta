package com.example.demo.base.response;

import java.io.Serializable;

public class Response<T> implements Serializable {

    private boolean isSuccess;

    private static final int SUCCESS_CODE = 200;

    private static final String SUCCESS_MSG = "First of May!";

    private static final int FAILURE_CODE = 4200;


    private int code;
    private String msg;
    private T data;

    public static <T> Response success(T result) {
        Response response = new Response();
        response.setSuccess(true);
        response.setCode(SUCCESS_CODE);
        response.setMsg(SUCCESS_MSG);
        response.setData(result);
        return response;
    }

    public static Response success() {
        Response response = new Response();
        response.setSuccess(true);
        response.setCode(SUCCESS_CODE);
        response.setMsg(SUCCESS_MSG);
        return response;
    }

    public static Response fail(String msg) {
        Response response = new Response();
        response.setSuccess(false);
        response.setCode(FAILURE_CODE);
        response.setMsg(msg);
        return response;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private Response() {}
}
