//package javaapplication2;

import java.io.*;

//Object which need to be serialized need to be implemented from Serializable
//interface
//java.io.NotSerializableException is thrown, if below class doesn't implement
//Serializable interface
public class DeSerializeDemo
{
    public static void main(String[] args)
    {
        try
        {

            System.out.println("De serializing object...");

            //DeSerialization starts here
            FileInputStream fis = new FileInputStream("C:\\Users\\donuric\\Desktop\\vehicle.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Vehicle to = (Vehicle) ois.readObject();

            System.out.println("before printing Object");

            to.printVehicleInfo();

            //RMI(Remote Method Invocation) is based on Serialization/Deserialization
        }
        catch (Exception e)
        { e. printStackTrace(); }
    }
}
