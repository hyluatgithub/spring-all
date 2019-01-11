package com.hylu.spring.AbstractFactory;

import java.text.MessageFormat;

/**
 * 华为手机工厂
 */
public class HuaWeiFactory extends AbstractFactory {

    /**
     * 华为手机流水线
     *
     * @param huaWeiMobileType
     * @return
     */
    @Override
    public HuaWei createHuaWei(HuaWeiMobileType huaWeiMobileType) {
        if (HuaWeiMobileType.Mate20.equals(huaWeiMobileType)) {
            System.out.println(MessageFormat.format("出厂了一台{0}", "华为Mate20手机"));
            return new HuaWeiMate();
        } else if (HuaWeiMobileType.Honor10.equals(huaWeiMobileType)) {
            System.out.println(MessageFormat.format("出厂了一台{0}", "华为荣耀10手机"));
            return new HuaWeiHonor();
        }
        System.out.println("暂未支持的手机产品");
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
        System.out.println("华为工厂，不支持苹果手机生产");
        return null;
    }
}
