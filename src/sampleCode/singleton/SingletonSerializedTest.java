package singleton;

import java.io.*;

/**
 * https://dzone.com/articles/all-about-the-singleton
 */
public class SingletonSerializedTest {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    SerializedSingleton instanceOne = SerializedSingleton.getInstance();
    ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
    out.writeObject(instanceOne);
    out.close();

    // deserialize from file to object
    ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
    SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
    in.close();

    System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
    System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
  }
}