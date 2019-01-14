package com.hylu.spring.singleton;

public class GeneratorPKIdSingleMain {
    public static void main(String[] args) {
        String key = GeneratorPKIdSingle.getInstance().getUUIDKey();
        System.out.println(key);
    }
}
