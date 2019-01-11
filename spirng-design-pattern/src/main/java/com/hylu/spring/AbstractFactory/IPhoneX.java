package com.hylu.spring.AbstractFactory;

import java.text.MessageFormat;

/**
 * 苹果X
 */
public class IPhoneX implements IPhoneMobile {

    private String name = "IPhoneMobile X";

    /**
     * 生产手机
     */
    @Override
    public void createMobile() {
        System.out.println(MessageFormat.format("研发出了新手机,{0}", name));
    }
}
