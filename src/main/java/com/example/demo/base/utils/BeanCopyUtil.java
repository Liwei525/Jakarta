package com.example.demo.base.utils;

import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author CHENGRui
 * @Since 2018/5/30
 */
public class BeanCopyUtil {
    private BeanCopyUtil() {
    }

    public static <E, T> T copy(E e, Class<? extends T> clazz) {
        Assert.notNull(e, "source can not be null!");

        try {
            T t = clazz.newInstance();
            BeanUtils.copyProperties(e, t);
            return t;
        } catch (Exception var4) {
            return null;
        }
    }

    public static <E, T> List<T> copyList(List<E> e, Class<? extends T> clazz) {
        return (List)(CollectionUtils.isEmpty(e) ? Lists.newArrayList() : (List)e.stream().map((bean) -> copy(bean, clazz)).collect(Collectors.toList()));
    }

    public static <Tin, Tout> List<Tout> selectToList(List<Tin> list, Function<Tin, Tout> callback) {
        return (List)(CollectionUtils.isEmpty(list) ? Lists.newArrayList() : (List)list.stream().map(callback).collect(Collectors.toList()));
    }

}
