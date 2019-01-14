package com.hylu.spring.singleton;

/**
 * 单例对象
 */
public class SingleObject {
    private static SingleObject singleObject = new SingleObject();

    //私有构造方法，这样不会被外部调用实例化
    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return singleObject;
    }

    /**
     * 测试方法
     */
    public void sayHello() {
        System.out.println("对象生成成功,hello");
    }
}
