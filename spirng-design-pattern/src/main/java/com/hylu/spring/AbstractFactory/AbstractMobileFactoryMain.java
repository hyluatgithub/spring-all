package com.hylu.spring.AbstractFactory;

public class AbstractMobileFactoryMain {

    public static void main(String[] args) {
        //建造工厂
        MobileFactoryProducer mobileFactoryProducer = new MobileFactoryProducer();
        //购进华为手机流水线
        AbstractFactory huaWeiFactory = mobileFactoryProducer.getFactory(MobileFactory.HuaWei);
        //流水线生产华为系列手机
        huaWeiFactory.createHuaWei(HuaWeiMobileType.Mate20);
        huaWeiFactory.createHuaWei(HuaWeiMobileType.Honor10);

        //购进苹果手机流水线
        AbstractFactory iPhoneFactory = mobileFactoryProducer.getFactory(MobileFactory.IPhone);
        //流水线生产苹果系列手机
        iPhoneFactory.createIPhone(IPhoneMobileType.IPhoneX);
        iPhoneFactory.createIPhone(IPhoneMobileType.IPhone6sp);
    }
}
