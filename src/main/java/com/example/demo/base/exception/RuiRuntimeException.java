package com.example.demo.base.exception;

/**
 * @author CHENGRui
 * @Since 2018/6/14
 */
public class RuiRuntimeException extends RuntimeException {

    public RuiRuntimeException(String msg) {
        super(msg);
    }

    private RuiRuntimeException(){}

}
