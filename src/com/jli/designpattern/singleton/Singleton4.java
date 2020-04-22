package com.jli.designpattern.singleton;

public class Singleton4 {
    private volatile static Singleton4 instance;
    private Singleton4(){}
    public static Singleton4 getInstance(){
        if(instance == null){
            synchronized(Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("双检锁/双重校验锁（DCL，即 double-checked locking）\n" +
                "JDK 版本：JDK1.5 起\n" +
                "是否 Lazy 初始化：是\n" +
                "是否多线程安全：是\n" +
                "实现难度：较复杂\n" +
                "描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。\n" +
                "getInstance() 的性能对应用程序很关键。");
    }
}
