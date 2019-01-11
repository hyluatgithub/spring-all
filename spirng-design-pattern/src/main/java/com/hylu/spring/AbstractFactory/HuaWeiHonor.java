package com.hylu.spring.AbstractFactory;

import java.text.MessageFormat;

/**
 * 华为荣耀手机
 */
public class HuaWeiHonor implements HuaWei {

    private String name = "HuaWei 荣耀10";

    /**
     * 生产手机
     */
    @Override
    public void createMobile() {
        System.out.println(MessageFormat.format("研发出了新手机,{0}", name));
    }

}
