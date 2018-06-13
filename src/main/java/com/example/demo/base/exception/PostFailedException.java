package com.example.demo.base.exception;

/**
 * @author CHENGRui
 * @Since 2018/6/13
 */
public class PostFailedException extends RuntimeException {
    public PostFailedException() {
        super("无权限操作！");
    }

    public PostFailedException(String msg) {
        super(msg);
    }
}
