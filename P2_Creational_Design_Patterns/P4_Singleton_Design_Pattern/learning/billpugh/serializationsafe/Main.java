package P2_Creational_Design_Patterns.P4_Singleton_Design_Pattern.learning.billpugh.serializationsafe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        SingletonBillPughSerializationSafe instance1 = SingletonBillPughSerializationSafe.getInstance();

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(SingletonBillPughSerializationSafe.getInstance());

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingletonBillPughSerializationSafe instance2 = (SingletonBillPughSerializationSafe) in.readObject(); // New
                                                                                                             // instance!

        System.out.println("Instance 1 hashCode: " + instance1.hashCode());
        System.out.println("Instance 2 hashCode: " + instance2.hashCode());

        System.out.println(
                "Serialization couldn't break your Singleton Class as Instance 1 == Instance 2 : "
                        + (instance1 == instance2));
        in.close();
        out.close();
    }
}
