/**
 * Create an instance in the global access method
 *
 * Works fine in case of a single-threaded environment, but when it comes to multithreaded systems,
 * it can cause issues if multiple threads are inside the if loop at the same time.
 *
 * https://dzone.com/articles/all-about-the-singleton
 */
public class LazyInitializedSingleton {

  private static LazyInitializedSingleton instance;

  private LazyInitializedSingleton(){}

  public static LazyInitializedSingleton getInstance(){
    if(instance == null){
      instance = new LazyInitializedSingleton();
    }
    return instance;
  }
}