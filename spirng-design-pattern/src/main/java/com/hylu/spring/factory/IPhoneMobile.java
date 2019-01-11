package com.hylu.spring.factory;

import java.text.MessageFormat;

/**
 * 工厂接口的实现类
 */
public class IPhoneMobile implements MobileInterface {

    private final String name = "苹果手机";

    /**
     * 生产手机
     */
    @Override
    public void createMobile() {
        System.out.println(MessageFormat.format("新一代最贵的{0}", name));
    }
}
