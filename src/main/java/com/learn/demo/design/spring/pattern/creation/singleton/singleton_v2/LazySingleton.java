package com.learn.demo.design.spring.pattern.creation.singleton.singleton_v2;

// 延迟初始化单例
public class LazySingleton {
    private static LazySingleton INSTANCE;
    
    private LazySingleton(){}
    
    public static LazySingleton getInstance(){
        if(INSTANCE == null){
        	INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
