package modlu;

/**
 * @author xiaogege
 * @描述：
 * @date 2021/3/5
 * @time 13:36
 */
//饿汉
public class 单例模式 {
    private static 单例模式 sign = new 单例模式();
    private 单例模式() {

    }
    public static 单例模式 getSign() {
        return sign;
    }
}
//懒汉
 class Lazy{
   private static Lazy lazy = null;
   private Lazy(){

   }
   public static Lazy getLazy() {
       if (lazy == null) {
           lazy = new Lazy();
       }
       return lazy;
   }
}

class Lazy1{
    private volatile static Lazy1 lazy1 = null;
    private Lazy1(){

    }
    public static Lazy1 getLazy1() {
        if (lazy1 == null) {
            synchronized (Lazy1.class) {
                if (lazy1 == null) {
                    lazy1 = new Lazy1();
                }
            }
        }
        return lazy1;
    }
}
