package com.example.demo.base.exception;

/**
 * @author CHENGRui
 * @Since 2018/6/13
 */
public class GetFailedException extends RuntimeException {
    public GetFailedException() {
        super("无权限操作！");
    }

    public GetFailedException(String msg) {
        super(msg);
    }
}
