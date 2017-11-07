package singleton;

/**
 * Make the global access method synchronized so that only one thread can execute this method at a time
 *
 * Reduces performance because of the cost associated with the synchronized method,
 * although we need it only for the first few threads that might create the separate instances
 *
 * https://dzone.com/articles/all-about-the-singleton
 */
public class ThreadSafeSingleton {

  private static ThreadSafeSingleton instance;

  private ThreadSafeSingleton(){}

  public static synchronized ThreadSafeSingleton getInstance(){
    if(instance == null){
      instance = new ThreadSafeSingleton();
    }
    return instance;
  }
}