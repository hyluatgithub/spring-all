package com.hylu.spring.AbstractFactory;

import java.text.MessageFormat;

/**
 * 华为Mate系统
 */
public class HuaWeiMate implements HuaWei {

    private String name = "HuaWei Mate 20";

    /**
     * 生产手机
     */
    @Override
    public void createMobile() {
        System.out.println(MessageFormat.format("研发出了新手机,{0}", name));
    }
}
