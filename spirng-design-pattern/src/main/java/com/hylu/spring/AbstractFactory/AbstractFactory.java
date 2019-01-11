package com.hylu.spring.AbstractFactory;

/**
 * 手机工厂的工厂方法
 */
public abstract class AbstractFactory {
    /**
     * 华为手机流水线
     *
     * @return
     */
    public abstract HuaWei createHuaWei(HuaWeiMobileType huaWeiMobileType);

    /**
     * 苹果手机流水线
     *
     * @return
     */
    public abstract IPhoneMobile createIPhone(IPhoneMobileType iPhoneMobileType);
}
