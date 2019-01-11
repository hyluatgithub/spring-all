package com.hylu.spring.factory;

import java.text.MessageFormat;

/**
 * 手机工厂
 */

public class MobileFactory {

    public MobileInterface createMobile(MobileType mobileType) {
        if (MobileType.IPhone.equals(mobileType)) {
            System.out.println(MessageFormat.format("工厂生产了新手机,是{0}", "苹果手机"));
            return new IPhoneMobile();
        } else if (MobileType.HuaWei.equals(mobileType)) {
            System.out.println(MessageFormat.format("工厂生产了新手机,是{0}", "华为手机"));
            return new HuaWeiMobile();
        } else {
            System.out.println("暂未支持的手机品牌");
            return null;
        }
    }

}
