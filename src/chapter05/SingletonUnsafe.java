package chapter05;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/16 12:43
 * @Version 1.0
 **/
public class SingletonUnsafe {
    private static SingletonUnsafe uniqueInstance;

    /**
    * 通过私有构造器来防止外部初始化实例
    * @Author L
    * @Since 12:43 2020/06/16
    * @Param []
    * @return
    **/
    private SingletonUnsafe() {};

    /**
    * 延迟初始化，不使用则不会产生单例
     * 此方法线程不安全，可能会产生不同的实例
    * @Author L
    * @Since 12:45 2020/06/16
    * @Param []
    * @return chapter05.SingletonUnsafe
    **/
    public static SingletonUnsafe getInstance(){
        if(uniqueInstance == null) {
            uniqueInstance = new SingletonUnsafe();
        }
        return uniqueInstance;
    }
}
