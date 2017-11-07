package singleton;

/**
 * When the singleton class is loaded, the SingletonHelper class is not loaded into memory,
 * and only when someone calls the getInstance method, does this class get loaded and create the Singleton class instance
 *
 * https://dzone.com/articles/all-about-the-singleton
 */
public class BillPughSingleton {

  private BillPughSingleton(){}

  private static class SingletonHelper{
    private static final BillPughSingleton INSTANCE = new BillPughSingleton();
  }

  public static BillPughSingleton getInstance(){
    return SingletonHelper.INSTANCE;
  }
}