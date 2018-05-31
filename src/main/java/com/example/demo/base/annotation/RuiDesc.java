package com.example.demo.base.annotation;

import java.lang.annotation.*;

/**
 * @author CHENGRui
 * @Since 2018/5/30
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RuiDesc {
    String description() default "";
    String type() default "";
    boolean isNotNull() default false;
    boolean isNotBlank() default false;
    int maxLength() default 0;
    int minLength() default 0;
    String maxValue() default "";
    String minValue() default "";
    String regPattern() default "";
    String alertMsg() default "";
    Class<? extends Enum> dataBody() default Enum.class;
}