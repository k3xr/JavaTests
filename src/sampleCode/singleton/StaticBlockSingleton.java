package singleton;

/**
 * Instance of the class is created in the static block that provides the option for exception handling
 */
public class StaticBlockSingleton {

  private static StaticBlockSingleton instance;

  private StaticBlockSingleton(){}

  //static block initialization for exception handling
  static{
    try{
      instance = new StaticBlockSingleton();
    }catch(Exception e){
      throw new RuntimeException("Exception occured in creating singleton instance");
    }
  }

  public static StaticBlockSingleton getInstance(){
    return instance;
  }
}