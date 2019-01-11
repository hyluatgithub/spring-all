package com.hylu.spring.AbstractFactory;

import java.text.MessageFormat;

/**
 * 苹果手机工厂
 */
public class IPhoneFactory extends AbstractFactory {

    /**
     * 华为手机流水线
     *
     * @param huaWeiMobileType
     * @return
     */
    @Override
    public HuaWei createHuaWei(HuaWeiMobileType huaWeiMobileType) {
        System.out.println("苹果工厂，不支持华为手手机生产");
        return null;
    }

    /**
     * 苹果手机流水线
     *
     * @param iPhoneMobileType
     * @return
     */
    @Override
    public IPhoneMobile createIPhone(IPhoneMobileType iPhoneMobileType) {
        if (IPhoneMobileType.IPhoneX.equals(iPhoneMobileType)) {
            System.out.println(MessageFormat.format("出厂了一台{0}", "苹果IPhoneX手机"));
            return new IPhoneX();
        } else if (IPhoneMobileType.IPhone6sp.equals(iPhoneMobileType)) {
            System.out.println(MessageFormat.format("出厂了一台{0}", "苹果IPhone6sp手机"));
            return new IPhone6SP();
        }
        System.out.println("暂未支持的手机产品");
        return null;
    }
}
