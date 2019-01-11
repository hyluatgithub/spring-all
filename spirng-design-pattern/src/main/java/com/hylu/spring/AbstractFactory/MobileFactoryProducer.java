package com.hylu.spring.AbstractFactory;

import java.text.MessageFormat;

/**
 * 手机工厂的生成器
 */
public class MobileFactoryProducer {

    public AbstractFactory getFactory(MobileFactory mobileFactory) {

        if (MobileFactory.IPhone.equals(mobileFactory)) {
            System.out.println(MessageFormat.format("建造了一座{0}工厂", "苹果手机"));
            return new IPhoneFactory();
        } else if (MobileFactory.HuaWei.equals(mobileFactory)) {
            System.out.println(MessageFormat.format("建造了一座{0}工厂", "华为手机"));
            return new HuaWeiFactory();
        }
        System.out.println("暂未支持的工厂");
        return null;
    }

}
