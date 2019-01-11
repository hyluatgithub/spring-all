package com.hylu.spring.factory;

public class MobileFactoryMain {

    public static void main(String[] args) {
        MobileFactory mobileFactory = new MobileFactory();

        MobileInterface mobile1 = mobileFactory.createMobile(MobileType.IPhone);
        mobile1.createMobile();

        MobileInterface mobile2 = mobileFactory.createMobile(MobileType.HuaWei);
        mobile2.createMobile();

//        MobileInterface mobile3 = mobileFactory.createMobile("xxx");
//        mobile3.createMobile();
    }
}
