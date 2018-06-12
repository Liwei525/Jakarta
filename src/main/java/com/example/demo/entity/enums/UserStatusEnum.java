package com.example.demo.entity.enums;

import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author CHENGRui
 * @Since 2018/6/12
 */
public enum UserStatusEnum {

    STORE(1, "正常"),
    SHELF(2, "停用");

    private int code;

    private String desc;

    UserStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDisplay(int code) {
        for (UserStatusEnum enums : values()) {
            if (code == enums.code) {
                return enums.getDesc();
            }
        }

        return String.valueOf(code);
    }

    public static List<Map<String, String>> getValues() {
        List<Map<String, String>> list = new ArrayList<>();
        for (UserStatusEnum enums : values()) {
            Map<String, String> map = Maps.newHashMap();
            map.put("code", String.valueOf(enums.getCode()));
            map.put("desc", enums.getDesc());
            list.add(map);
        }
        return list;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
