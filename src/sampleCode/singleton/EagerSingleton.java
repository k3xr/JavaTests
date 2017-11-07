package singleton;

/**
 *  The instance of Singleton Class is created at the time of class loading
 *  It has the drawback of the instance being created even though client application might not be using it
 *
 *  https://dzone.com/articles/all-about-the-singleton
 */
public class EagerSingleton {
  private static volatile EagerSingleton instance = new EagerSingleton();

  // private constructor
  private EagerSingleton() {
  }

  public static EagerSingleton getInstance() {
    return instance;
  }
}