package com.hylu.spring.singleton;

import java.util.UUID;

/**
 * 获取唯一主键id的单利实现
 */
public class GeneratorPKIdSingle {

    private static GeneratorPKIdSingle generatorPKIdSingle = new GeneratorPKIdSingle();

    private GeneratorPKIdSingle() {
    }

    public static GeneratorPKIdSingle getInstance() {
        return generatorPKIdSingle;
    }

    /**
     * 获取唯一的uuid
     *
     * @return
     */
    public String getUUIDKey() {
        return UUID.randomUUID().toString();
    }

}
