package singleton;

/**
 * Java ensures that any enum value is instantiated only once in a Java program
 *
 * https://dzone.com/articles/all-about-the-singleton
 */
public enum EnumSingleton {
  INSTANCE;
  public void someMethod(String param) {
    // some class member
  }
}