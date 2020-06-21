package chapter05;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/16 12:38
 * @Version 1.0
 **/
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    /**
    * 延迟初始化，通过synchronized保证只有一个单例生成
     * 但是存在多个类加载器的时候，并不能保证单例
    * @Author L
    * @Since 12:40 2020/06/16
    * @Param []
    * @return chapter05.Singleton
    **/
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}
