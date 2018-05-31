package com.example.demo.base.enums;

/**
 * @author CHENGRui
 * @Since 2018/5/31
 */
public enum NumberEnum {
    ZERO(0, "零"),
    ONE(1, "壹"),
    TWO(2, "貳"),
    FIVE(5, "伍"),
    TEN(10, "拾"),
    ONE_HUNDRED(100, "佰");

    private int code;

    private String name;

    NumberEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public NumberEnum valueOf(int value) {
        for (NumberEnum p : values()) {
            if (p.getCode() == value) {
                return p;
            }
        }
        return null;
    }

    public String getNameByValue(int value) {
        NumberEnum tempEnum = valueOf(value);
        if (tempEnum == null) {
            return null;
        }
        return tempEnum.getName();
    }
}
