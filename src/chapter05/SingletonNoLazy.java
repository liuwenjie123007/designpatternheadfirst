package chapter05;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/16 12:50
 * @Version 1.0
 **/
public class SingletonNoLazy {
    private static SingletonNoLazy uniqueInstance = new SingletonNoLazy();

    private SingletonNoLazy() {}

    /**
    * 直接在类中初始化单例，来保证线程安全与性能
     * 还是要小心，多个类加载器情况
    * @Author L
    * @Since 12:51 2020/06/16
    * @Param []
    * @return chapter05.SingletonNoLazy
    **/
    public static SingletonNoLazy getInstance() {
        return uniqueInstance;
    }
}
