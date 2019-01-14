package com.hylu.spring.singleton;

/**
 * 饿汉式
 * <p>
 * 是否 Lazy 初始化：否
 * <p>
 * 是否多线程安全：是
 * <p>
 * 实现难度：易
 * <p>
 * 描述：这种方式比较常用，但容易产生垃圾对象。
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 *
 */
public class SingleObject2 {
    private static SingleObject2 singleObject2 = new SingleObject2();

    private SingleObject2() {
    }

    public static SingleObject2 getInstance() {
        return singleObject2;
    }

    public void sayYes(){
        System.out.println("Yes");
    }


}
