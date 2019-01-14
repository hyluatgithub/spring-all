package com.hylu.spring.singleton;

/**
 * 枚举类型实现的单例 线程安全，自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化
 */
public enum SingleEnumObject {
    singleObject;

    public void sayHi() {
        System.out.println("hi");
    }

}
