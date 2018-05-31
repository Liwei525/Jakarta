package com.example.demo.base.enums;

public enum ResponseEnum {
    SUCCESS(200, "操作成功"),
    DATA_ERROR(300, "数据错误，不存在"),
    PARAMETER_ERROR(400, "参数错误"),
    SERVER_ERROR(500, "系统错误"),
    OTHER_ERROR(600, "其它错误"),
    DATA_REPEAT(1100, "数据重复");

    private int code;

    private String name;

    ResponseEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public static ResponseEnum valueOf(int value) {
        for (ResponseEnum p : values()) {
            if (p.getCode() == value) {
                return p;
            }
        }
        return null;
    }

    public static String getNameByValue(int value) {
        ResponseEnum tempEnum = valueOf(value);
        if (tempEnum == null) {
            return null;
        }
        return tempEnum.getName();
    }
}
