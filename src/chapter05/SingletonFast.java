package chapter05;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/16 12:46
 * @Version 1.0
 **/
public class SingletonFast {
    private static volatile SingletonFast uniqueInstance;

    private SingletonFast() {}

    /**
    * 通过synchronized与volatile关键字保证，第一次初始化后的性能
    * @Author L
    * @Since 12:48 2020/06/16
    * @Param []
    * @return chapter05.SingletonFast
    **/
    public static SingletonFast getInstance() {
        if(uniqueInstance == null) {
            synchronized (SingletonFast.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new SingletonFast();
                }
            }
        }
        return uniqueInstance;
    }

}
