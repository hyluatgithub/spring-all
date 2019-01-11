package com.hylu.spring.factory;

import java.text.MessageFormat;

/**
 * 工厂接口的实现类
 */
public class HuaWeiMobile implements MobileInterface {

    private final String name = "华为手机";

    /**
     * 生产手机
     */
    @Override
    public void createMobile() {
        System.out.println(MessageFormat.format("最新最牛的{0}", name));
    }
}
