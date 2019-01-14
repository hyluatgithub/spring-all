package com.hylu.spring.singleton;

/**
 * 单例模式测试方法
 */
public class SingletonMain {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.sayHello();

        //单例模式推荐实现之一：枚举
        SingleEnumObject singleObjectEnum = SingleEnumObject.singleObject;
        singleObjectEnum.sayHi();

        //单例模式推荐实现之一：饿汉式
        SingleObject2 singleObject2 = SingleObject2.getInstance();
        singleObject2.sayYes();
    }
}
